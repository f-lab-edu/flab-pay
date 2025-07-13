package org.flab.flab.client.kakao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.flab.flab.domain.Merchant;
import org.flab.flab.service.dto.PayReadyRequest;

/*
* cid	String	O	가맹점 코드, 10자
partner_order_id	String	O	가맹점 주문번호, 최대 100자
partner_user_id	String	O	가맹점 회원 id, 최대 100자
(실명, ID와 같은 개인정보가 포함되지 않도록 유의)
item_name	String	O	상품명, 최대 100자
quantity	Integer	O	상품 수량
total_amount	Integer	O	상품 총액
tax_free_amount	Integer	O	상품 비과세 금액
approval_url	String	O	결제 성공 시 redirect url, 최대 255자
cancel_url	String	O	결제 취소 시 redirect url, 최대 255자
fail_url	String	O	결제 실패 시 redirect url, 최대 255자
* */

@Getter()
@NoArgsConstructor()
public class KakaoPayReadyRequestDTO {
    private String cid;
    @JsonProperty("partner_order_id")
    private String partnerOrderId;
    @JsonProperty("partner_user_id")
    private String partnerUserId;
    @JsonProperty("item_name")
    private String itemName;

    private int quantity;
    @JsonProperty("total_amount")
    private Long totalAmount;
    @JsonProperty("tax_free_amount")
    private Long taxFreeAmount;
    @JsonProperty("approval_url")
    private String approvalURL;
    @JsonProperty("cancel_url")
    private String cancelURL;
    @JsonProperty("fail_url")
    private String failURL;


    public static KakaoPayReadyRequestDTO fromMerchant(PayReadyRequest request) {
        KakaoPayReadyRequestDTO dto = new KakaoPayReadyRequestDTO();
        dto.cid = request.getMerchant().name();
        dto.partnerOrderId = request.getTradeNo();
        dto.partnerUserId = request.getMemberId();
        dto.itemName = request.getItemName();
        dto.totalAmount = request.getAmount();
        dto.taxFreeAmount = request.getTaxFreeAmount();
        dto.approvalURL = request.getApprovedURL();
        dto.cancelURL = request.getCancelURL();
        dto.failURL = request.getFailURL();
        return dto;
    }
}
