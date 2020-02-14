package escola2020.teste;

import java.util.ArrayList;

import escola2020.dominio.Cargo;
import escola2020.servico.FuncionarioServico;
import escola2020.servico.FuncionarioServicoException;

public class Teste {

	public static void main(String[] args) throws FuncionarioServicoException {
		ArrayList<Cargo> lista = new ArrayList<>();
		FuncionarioServico servico = new FuncionarioServico();
		lista = servico.listarCargos();
		for (Cargo item : lista) {
System.out.println(item.getNome());
		}
	}

}
