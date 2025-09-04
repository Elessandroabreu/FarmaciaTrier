package com.farmacia.elessandro.model;

//id do cliente
// nome do cliente
// cpf do cliente
// telefone do cliente
//email do cliente

//funcionario
//id funcionario
//nome do funcionario
//email do funcionario
//cargo do funcionario
//codigo do cargo do funcionario

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "TBPRODUTO")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdProduto")
    private Integer cdProduto;

    @Column(name = "nmProduto")
    private String nmProduto;

    @Column(name = "dsBula")
    private String dsBula;

    @Column(name = "vlProduto")
    private Double vlProduto;
}
