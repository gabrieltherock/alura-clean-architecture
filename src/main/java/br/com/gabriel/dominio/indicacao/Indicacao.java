package br.com.gabriel.dominio.indicacao;

import br.com.gabriel.dominio.aluno.Aluno;
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
