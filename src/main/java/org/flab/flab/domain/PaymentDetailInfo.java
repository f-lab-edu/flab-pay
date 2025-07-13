package org.flab.flab.domain;

import java.io.Serializable;
import java.util.Objects;

public class PaymentDetailInfo implements Serializable {

    private String authNumber;
    private String approvedURL;
    private String cancelURL;
    private String failURL;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PaymentDetailInfo that = (PaymentDetailInfo) o;
        return Objects.equals(authNumber, that.authNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(authNumber);
    }
}
