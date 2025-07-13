package org.flab.flab.service.dto;

import lombok.Builder;

import java.time.LocalDateTime;

public class PayReadyResponse {
    private String pgTradeNo;
    private String redirectURL;
    private LocalDateTime payReadyTime;

    @Builder
    public PayReadyResponse(String pgTradeNo, String redirectURL, LocalDateTime payReadyTime) {
        this.pgTradeNo = pgTradeNo;
        this.redirectURL = redirectURL;
        this.payReadyTime = payReadyTime;
    }
}
