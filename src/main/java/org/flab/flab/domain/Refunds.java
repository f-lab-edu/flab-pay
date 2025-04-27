package org.flab.flab.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity()
@Table(name = "refunds")
public class Refunds {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column()
    private Long amount;

    @Column()
    private String reason;

    @Column()
    private PaymentStatus status;

    @Column()
    private LocalDateTime createdAt;

    @Column()
    private LocalDateTime processedAt;
}
