package br.com.gabriel;

import lombok.Data;

@Data
public class Email {

    private String endereco;

    public Email(String endereco) {
        if (endereco == null || !endereco.matches("/^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?$/i"))
            throw new IllegalArgumentException("Email inválido!");

        this.endereco = endereco;
    }
}
