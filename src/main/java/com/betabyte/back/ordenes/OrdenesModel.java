package com.betabyte.back.ordenes;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Ordenes")
@AllArgsConstructor
@NoArgsConstructor
public class OrdenesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name_product;

    @Column
    private float price;

    @Column
    private String state;

    @Column
    private LocalDate fecha_pedido;

}
