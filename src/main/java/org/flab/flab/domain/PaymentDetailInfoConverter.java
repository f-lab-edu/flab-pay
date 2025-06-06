package org.flab.flab.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter()
public class PaymentDetailInfoConverter implements AttributeConverter<PaymentDetailInfo, String> {

    private static final ObjectMapper mapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(PaymentDetailInfo paymentDetailInfo) {
        try {
            return mapper.writeValueAsString(paymentDetailInfo);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public PaymentDetailInfo convertToEntityAttribute(String s) {
        try {
            return mapper.readValue(s, PaymentDetailInfo.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
