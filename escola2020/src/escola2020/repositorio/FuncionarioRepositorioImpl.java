package escola2020.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import escola2020.dominio.Funcionarios;
import escola2020.util.GerenciadorConexao;
import escola2020.util.GerenciadorConexaoMysql;

public class FuncionarioRepositorioImpl implements FuncionarioRepositorio {

	private final GerenciadorConexao gerenciador = GerenciadorConexaoMysql.getInstancia();

	@Override
	public ArrayList<Funcionarios> getAll() throws SQLException {
		Connection conexao = gerenciador.conectar();
		String comandosql = "SELECT matricula, cpf, nome, sobrenome, sexo, dtNascimento, email,"
				+ "dtCadastro, status, telefone, endereco, cidade, uf, cep FROM funcionarios ";
		Statement comando = conexao.createStatement();
		ResultSet resultado = comando.executeQuery(comandosql);
		ArrayList<Funcionarios> lista = new ArrayList<>();
		Funcionarios funcionario;
		while (resultado.next()) {
			funcionario = new Funcionarios();
			funcionario.setMatricula(resultado.getString("matricula"));
			funcionario.setCpf(resultado.getString("cpf"));
			funcionario.setNome(resultado.getString("nome"));
			funcionario.setSobrenome(resultado.getString("sobrenome"));
			funcionario.setSexo(resultado.getString("sexo"));
			funcionario.setDataNascimento(resultado.getString("dtNascimento"));
			funcionario.setEmail(resultado.getString("email"));
			funcionario.setDtCadastro(resultado.getDate("dtCadastro"));
			funcionario.setStatus(resultado.getInt("status"));
			funcionario.setTelefone(resultado.getString("telefone"));
			funcionario.setEndereco(resultado.getString("endereco"));
			funcionario.setCidade(resultado.getString("cidade"));
			funcionario.setUf(resultado.getString("uf"));
			funcionario.setCep(resultado.getString("cep"));
			lista.add(funcionario);
		}
		gerenciador.desconectar(conexao);
		return lista;
	}

	@Override
	public void inserir(Funcionarios funcionario) throws SQLException {
		Connection conexao = gerenciador.conectar();
		String comandoSql = "INSERT INTO Funcionarios (matricula, cpf, nome, sobrenome, sexo, dtNascimento, email,status, telefone, endereco, cidade, uf, cep,cargos_codigo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement comando = conexao.prepareStatement(comandoSql);
		comando.setString(1, funcionario.getMatricula());
		comando.setString(2, funcionario.getCpf());
		comando.setString(3, funcionario.getNome());
		comando.setString(4, funcionario.getSobrenome());
		comando.setString(5, funcionario.getSexo());
		comando.setString(6, funcionario.getDataNascimento());
		comando.setString(7, funcionario.getEmail());
		comando.setInt(8, funcionario.getStatus());
		comando.setString(9, funcionario.getTelefone());
		comando.setString(10, funcionario.getEndereco());
		comando.setString(11, funcionario.getCidade());
		comando.setString(12, funcionario.getUf());
		comando.setString(13, funcionario.getCep());
		comando.setInt(14, funcionario.getCargos_codigo());
		comando.executeUpdate();
		gerenciador.desconectar(conexao);

	}

	@Override
	public void atualizar(Funcionarios funcionario) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(String matricula) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Funcionarios get(String matricula) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
