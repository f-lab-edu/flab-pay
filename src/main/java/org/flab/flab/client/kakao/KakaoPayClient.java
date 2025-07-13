package org.flab.flab.client.kakao;

import org.flab.flab.service.PayClient;
import org.flab.flab.service.dto.PayReadyRequest;
import org.flab.flab.service.dto.PayReadyResponse;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

public class KakaoPayClient implements PayClient {


    private final RestTemplate restTemplate;

    public KakaoPayClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public PayReadyResponse payReady(PayReadyRequest request) {
        HttpEntity<KakaoPayReadyRequestDTO> httpRequest = new HttpEntity<>(KakaoPayReadyRequestDTO.fromMerchant((request)));
        String url = "/online/v1/payment/ready";
        KakaoPayReadyResponse response = this.restTemplate.postForObject(url, httpRequest, KakaoPayReadyResponse.class);
        return null;
    }
}
