package com.betabyte.back.clients;

import com.betabyte.back.users.Usermodel;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table (name = "clients")
@AllArgsConstructor
@NoArgsConstructor
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private Long dni;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String phone;

    @Column
    private String city;

    @Column
    private String address;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Usermodel user;

}

