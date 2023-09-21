package com.betabyte.back.superadmin;

import com.betabyte.back.users.Usermodel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "SuperAdmin")
@AllArgsConstructor
@NoArgsConstructor
public class SuperAdminModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Usermodel user;

}
