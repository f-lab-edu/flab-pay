package org.flab.flab.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity()
@Table(name = "payments")
public class Payment {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String tradeNo;

    @Column()
    private String itemName;

    @Column()
    private Long amount;

    @Column()
    private Long taxFreeAmount;

    @Column()
    private PaymentStatus status;

    @Column()
    private LocalDateTime approvedAt;

    @Column()
    private LocalDateTime createdAt;

    @Column()
    private LocalDateTime refundAt;
}
