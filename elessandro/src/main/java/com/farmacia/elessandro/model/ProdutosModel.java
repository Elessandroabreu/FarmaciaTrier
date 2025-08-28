package com.farmacia.elessandro.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "TBPRODUTO")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProdutosModel {

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
