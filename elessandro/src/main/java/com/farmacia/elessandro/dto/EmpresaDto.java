package com.farmacia.elessandro.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EmpresaDto(
        @NotBlank(message = "Nao e possivel salvar uma empresa sem nome")
        String nmEmpresa,

        @NotBlank(message = "Nao e possivel salvar uma empresa sem cnpj")
        String cnpjEmpresa,

        @NotBlank(message = "Nao e possivel salvar uma empresa sem telefone")
        String telefoneEmpresa,

        @Email @NotBlank(message = "Nao e possivel salvar uma empresa sem endereco")
        String enderecoEmpresa,

        @Email @NotBlank(message = "Nao e possivel salvar uma empresa sem email")
        String emailEmpresa) {
}