package com.betabyte.back.admins;

import java.util.Date;

import com.betabyte.back.users.Usermodel;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "admins")
@NoArgsConstructor
@AllArgsConstructor
public class AdminModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Usermodel user;

    @Column
    private Date createdate;

}
