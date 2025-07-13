package org.flab.flab.client.kakao;

import lombok.RequiredArgsConstructor;
import org.flab.flab.client.core.FLabRestTemplateFactory;
import org.flab.flab.service.PayClient;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@ConfigurationPropertiesScan()
public class KakaoConfig {

    private final KakaoClientProperties kakaoClientProperties;

    @Bean
    public PayClient kakaoPayClient(){
        FLabRestTemplateFactory factory = new FLabRestTemplateFactory(kakaoClientProperties,(request, body,  execution) -> {
            request.getHeaders().add("Authorization", "Bearer 123412341234");
            return execution.execute(request, body);
        });

        KakaoPayClient kakaoPayClient = new KakaoPayClient(factory.create());

        return kakaoPayClient;
    }

}
