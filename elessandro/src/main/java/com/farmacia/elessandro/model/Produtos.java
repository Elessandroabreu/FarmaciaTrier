package com.farmacia.elessandro.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "TBPRODUTO")


public class Produtos {
    @jakarta.persistence.Id
    private Long id;
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
