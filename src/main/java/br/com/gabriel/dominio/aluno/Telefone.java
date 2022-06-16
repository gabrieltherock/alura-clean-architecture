package br.com.gabriel.dominio.aluno;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Telefone {

    private String ddd;
    private String numero;
}
