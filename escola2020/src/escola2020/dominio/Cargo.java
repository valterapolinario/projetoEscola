package escola2020.dominio;

public class Cargo {
	private Integer codigo;
	private String nome;
	private String descricao;
	private String copetencias;
	private double pisoSalarial;

	public Cargo() {

	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCopetencias() {
		return copetencias;
	}

	public void setCopetencias(String copetencias) {
		this.copetencias = copetencias;
	}

	public double getPisoSalarial() {
		return pisoSalarial;
	}

	public void setPisoSalarial(double pisoSalarial) {
		this.pisoSalarial = pisoSalarial;
	}
	
}