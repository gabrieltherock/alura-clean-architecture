package br.com.gabriel;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Indicacao {

    private final Aluno indicado;
    private final Aluno indicante;
    private final LocalDateTime dataIndicacao;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.dataIndicacao = LocalDateTime.now();
    }
}
