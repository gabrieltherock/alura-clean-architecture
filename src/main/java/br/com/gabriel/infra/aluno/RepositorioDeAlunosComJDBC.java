package br.com.gabriel.infra.aluno;

import br.com.gabriel.dominio.aluno.Aluno;
import br.com.gabriel.dominio.aluno.CPF;
import br.com.gabriel.dominio.aluno.RepositorioDeAlunos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

    private final Connection connection;

    public RepositorioDeAlunosComJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
        String sql = "insert into aluno values(?, ?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, aluno.getCpf().getNumero());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getEmail().getEndereco());
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Aluno buscarPorCpf(CPF cpf) {
        return null;
    }

    @Override
    public List<Aluno> listarTodosOsAlunosMatriculados() {
        return null;
    }
}
