package org.flab.flab.domain;

import jakarta.persistence.*;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDateTime;

@Entity()
@Table(name = "Payment_detail")
public class PaymentDetail {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private PaymentMethodType type;

    @Column()
    private Long amount;

    @Column()
    private PaymentDetailStatus status;

    @Column()
    private LocalDateTime createAt;

    @Convert(converter = PaymentDetailInfoConverter.class)
    private PaymentDetailInfo info;

    @Column()
    private LocalDateTime approvedAt;

    @Column()
    private LocalDateTime refundAt;

    @ManyToOne()
    private Payments payments;
}
