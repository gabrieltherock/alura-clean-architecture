package br.com.gabriel;

import lombok.Data;

@Data
public class Aluno {

    private CPF cpf;
    private String nome;
    private Email email;
}