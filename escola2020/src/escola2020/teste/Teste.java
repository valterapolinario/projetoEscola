package escola2020.teste;

import escola2020.dominio.Funcionarios;
import escola2020.servico.FuncionarioServico;
import escola2020.servico.FuncionarioServicoException;

public class Teste {

	public static void main(String[] args) throws FuncionarioServicoException {
	Funcionarios funcionario ;
	FuncionarioServico servico = new FuncionarioServico();
	
	funcionario = new Funcionarios("2", "1234567", "lucas", "silva", "masculino", "29/01/1234", "hj@Gmail.com",  1, "2310", "lok", "poik", "pe", "oj",1);
		servico.salvar(funcionario);
	
	
	}

	

}
