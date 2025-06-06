package org.flab.flab.domain;

public enum PaymentMethodType {
    CARD(true),
    CASH(true),
    POINT(false);

    private final boolean mainPaymentMethod;

    PaymentMethodType(boolean mainPaymentMethod) {
        this.mainPaymentMethod = mainPaymentMethod;
    }

    public boolean isMainPaymentMethod() {
        return mainPaymentMethod;
    }
}
