package br.com.gabriel.dominio.aluno;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(Aluno aluno);
    Aluno buscarPorCpf(CPF cpf);
    List<Aluno> listarTodosOsAlunosMatriculados();
}
