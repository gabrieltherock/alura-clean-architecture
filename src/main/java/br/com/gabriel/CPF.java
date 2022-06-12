package br.com.gabriel;

import lombok.Data;

@Data
public class CPF {

    private String numero;

    public CPF(String numero) {
        if (numero == null)
            throw new IllegalArgumentException("CPF inválido!");

        this.numero = numero;
    }
}
