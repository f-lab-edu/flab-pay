package org.flab.flab.client.kakao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.flab.flab.service.dto.PayReadyResponse;

import java.time.LocalDateTime;
import java.util.Date;

@Getter()
@NoArgsConstructor()
public class KakaoPayReadyResponse {
    private String tid;
    @JsonProperty("next_redirect_app_url")
    private String nextRedirectAppURL;
    @JsonProperty("next_redirect_mobile_url")
    private String nextRedirectMobileURL;
    @JsonProperty("next_redirect_pc_url")
    private String nextRedirectPcURL;
    @JsonProperty("android_app_scheme")
    private String androidAppScheme;
    @JsonProperty("ios_app_scheme")
    private String iosAppScheme;
    @JsonProperty("created_at")
    private String createdAt;

    public PayReadyResponse toPayResponse() {
       PayReadyResponse response = PayReadyResponse.builder()
               .pgTradeNo(this.tid)
               .redirectURL(this.nextRedirectAppURL)
               .payReadyTime(LocalDateTime.parse(this.createdAt))
               .build();

       return response;
    }

}
