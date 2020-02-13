package escola2020.controlador;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import escola2020.dominio.Funcionarios;
import escola2020.servico.FuncionarioServico;
import escola2020.servico.FuncionarioServicoException;
@SuppressWarnings("serial")
@Named
@RequestScoped
public class FuncionarioCadastroManager implements Serializable{
	
		private Funcionarios funcionario;
		private FuncionarioServico servico;
		
		public FuncionarioCadastroManager() {
			this.setFuncionario(new Funcionarios());
			this.servico = new FuncionarioServico();
		}

		public Funcionarios getFuncionario() {
			return funcionario;
		}

		public void setFuncionario(Funcionarios funcionario) {
			this.funcionario = funcionario;
		}

		
		
	
		
		public String salvar() {
			try {
				servico.salvar(this.funcionario);
			} catch (FuncionarioServicoException exception) {
				FacesContext contexto = FacesContext.getCurrentInstance();
				FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!"+ exception.getMessage(),"");
				contexto.addMessage(null, mensagem);			
				return null;
			}
			return "tabelaFuncionarios.xhtml";
		}

	}

