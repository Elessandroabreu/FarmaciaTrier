package com.farmacia.elessandro.model;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@NoArgsConstrutor
@AllArgsConstrutor

@Entity
@Table(name = "TBPRODUTO")


public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdProduto")
    private Integer cdProduto;
    @Column(name = "nmProduto")
    private String nmProduto;
    @Column(name = "dsBula")
    private String dsBula;
    @Column(name = "vlProduto")
    private Integer vlProduto;


}
