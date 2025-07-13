package org.flab.flab.client.core;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.core5.util.TimeValue;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class FLabRestTemplateFactory {
    private final FLabClientProperties properties;
    private final ClientHttpRequestInterceptor interceptor;
    public FLabRestTemplateFactory(FLabClientProperties properties, ClientHttpRequestInterceptor interceptor) {
        this.properties = properties;
        this.interceptor = interceptor;
    }
    public RestTemplate create() {
        RestTemplateBuilder builder = new RestTemplateBuilder();
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();

        connectionManager.setMaxTotal(properties.getMaxConnPerRoute());
        connectionManager.setDefaultMaxPerRoute(properties.getMaxConnPerRoute());
        HttpClient httpClient = HttpClientBuilder.create()
                .setConnectionManager(connectionManager)
                .evictIdleConnections(TimeValue.of(properties.getIdleConnectionTimeout()))
                        .build();


        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient);
        factory.setConnectionRequestTimeout(properties.getConnectionTimeout());
        factory.setConnectTimeout(properties.getConnectionTimeout());
        factory.setReadTimeout(properties.getReadTimeout());

        builder.interceptors(interceptor);
        builder.requestFactory(() -> factory);
        return builder.build();
    }
}
