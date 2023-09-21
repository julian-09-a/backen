package com.betabyte.back.detallespedido;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "DetallesDelPedido")
@AllArgsConstructor
@NoArgsConstructor
public class DetallesPedidosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String send;

    @Column
    private Long Billing;

    @Column
    private float Address;

    @Column
    private LocalDate creation_date;

}    
