package com.artbeauty.arby.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_APPOINTMENT")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "time")
    private LocalDateTime time;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "name_client")
    private String nameClient;

    @Column(name = "cellular_client")
    private String cellularClient;

    @ManyToOne
    @JoinColumn(name = "user_client_fk")
    private UserArby userClient;
}
