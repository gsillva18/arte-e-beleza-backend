package com.artbeauty.arby.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_USER_ARBY")
public class UserArby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cellular")
    private String cellular;

    @Column(name = "password")
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Email> emails = new ArrayList<>(); // o admin pode ter mais de um email de acesso, o usuário apenas um
}
