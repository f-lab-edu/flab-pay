package org.flab.flab.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity()
@Table(name = "payments")
public class Payments {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private Long amount;

    @Column()
    private PaymentStatus status;

    @Column()
    private LocalDateTime approvedAt;

    @Column()
    private LocalDateTime createdAt;
}
