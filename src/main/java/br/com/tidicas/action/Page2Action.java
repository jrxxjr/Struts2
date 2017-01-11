package br.com.tidicas.action;

import com.opensymphony.xwork2.ActionSupport;

import br.com.tidicas.bean.Mensagem;

public class Page2Action extends ActionSupport {

	private static final long serialVersionUID = 3435863672428729537L;
	private Mensagem mensagem; 
	
	public Mensagem getMensagem() {
		return mensagem;
	}


	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}

	public String execute() {
		mensagem = new Mensagem();
		mensagem.setTexto("Página 2");
		return SUCCESS;
	}

}