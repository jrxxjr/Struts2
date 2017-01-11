package br.com.tidicas.action;

import com.opensymphony.xwork2.ActionSupport;

import br.com.tidicas.bean.Mensagem;

public class Page1Action extends ActionSupport {

	private static final long serialVersionUID = 8697902030491419431L;
	
	private Mensagem mensagem; 
	
	public Mensagem getMensagem() {
		return mensagem;
	}


	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}


	public String execute() {
		mensagem = new Mensagem();
		mensagem.setTexto("Página 1");
		return SUCCESS;
	}
	
}