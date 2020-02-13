package escola2020.teste;

import java.util.ArrayList;

import escola2020.dominio.Funcionarios;
import escola2020.servico.FuncionarioServico;
import escola2020.servico.FuncionarioServicoException;

public class Teste {

	public static void main(String[] args) throws FuncionarioServicoException {
		ArrayList<Funcionarios> teste = new ArrayList<>();
		FuncionarioServico servico = new FuncionarioServico();
		teste = servico.listar();
		for (Funcionarios funcionario : teste) {
			System.out.println(funcionario.getDtCadastro());
		}

	}

}
