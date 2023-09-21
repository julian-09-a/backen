package com.betabyte.back.productos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name =  "products")
@AllArgsConstructor
@NoArgsConstructor
public class ProductosModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String Name;

    @Column
    private String Description;

    @Column 
    private float Price;

    /*
     * @Column
     * private String imagen;
    */
}
