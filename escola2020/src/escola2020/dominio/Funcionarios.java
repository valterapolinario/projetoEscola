package escola2020.dominio;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class Funcionarios {

	@NotNull
	private String matricula;

	@NotNull
	private String cpf;

	@NotNull
	private String nome;

	@NotNull
	private String sobrenome;

	@NotNull
	private String sexo;

	@NotNull
	private java.sql.Date dtNascimento;

	@NotNull
	private String email;

	private Date dtCadastro;

	private int status;

	private String telefone;

	private String endereco;

	private String cidade;

	private String uf;

	private String cep;

	private int cargos_codigo;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public java.sql.Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(java.sql.Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(java.sql.Date date) {
		this.dtCadastro = date;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getCargos_codigo() {
		return cargos_codigo;
	}

	public void setCargos_codigo(int cargos_codigo) {
		this.cargos_codigo = cargos_codigo;
	}

}
