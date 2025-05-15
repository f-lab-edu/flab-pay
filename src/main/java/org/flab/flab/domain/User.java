package org.flab.flab.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String username;

    @Column()
    private String password;

    @Column()
    private String email;

    @Column()
    private String phoneNumber;

    @Column()
    private LocalDateTime createAt;

    @Column()
    private LocalDateTime updateAt; // localDateTime 은 나노세컨드

//    @Column()
//    private LocalDate createdDate; // 2025-11-02 로 서치

}
