package com.artbeauty.arby.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_CUSTOMER_ACCOUNT")
public class CustomerAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount_polite")
    private Integer amountPolite;

    @OneToOne
    @JoinColumn(name = "user_fk")
    private UserArby user;
}
