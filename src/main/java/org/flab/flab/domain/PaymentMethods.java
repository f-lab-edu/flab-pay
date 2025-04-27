package org.flab.flab.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "payment_methods")
public class PaymentMethods {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private PaymentMethodType methodType;

    @Column()
    private String provider;

    @Column()
    private String cardNumber;

    @Column()
    private LocalDateTime createdAt;
}
