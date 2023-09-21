package com.betabyte.back.users;

import jakarta.persistence.*;
import lombok.*;

import com.betabyte.back.clients.ClientModel;
import com.betabyte.back.admins.AdminModel;
import com.betabyte.back.superadmin.SuperAdminModel;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usermodel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false,length = 255)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column
    private UserRole role;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private ClientModel client;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private AdminModel admin;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private SuperAdminModel superAdmin;

}
