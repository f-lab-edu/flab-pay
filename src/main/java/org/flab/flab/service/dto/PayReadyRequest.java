package org.flab.flab.service.dto;

import lombok.Getter;
import org.flab.flab.domain.Merchant;

@Getter()
public class PayReadyRequest {
    private Merchant merchant;
    private String memberId;

    private String approvedURL;
    private String cancelURL;
    private String failURL;

    private Long taxFreeAmount;
    private String tradeNo;
    private Long amount;
    private String itemName;

}
