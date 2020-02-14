package escola2020.repositorio;

import java.sql.SQLException;
import java.util.ArrayList;

import escola2020.dominio.Cargo;



public interface CargoRepositorio {
		public Cargo get(String matricula) throws SQLException;
		/**
	 * Retorna um vetor com todos os registros do BD
	 * @return ArrayList<CargosCargos funcionario> com todos os registros, ou um objeto vazio
	 * @throws SQLException
	 */
	public ArrayList<Cargo> getAll() throws SQLException;
	

	
}
