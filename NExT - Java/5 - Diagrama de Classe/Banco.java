package aula5;

public class Banco {
	private String nome;
	private String endereco;
	private Calendario calendario;
	private Transacao[] transacoes;
	private Cliente[] clientes;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Calendario getCalendario() {
		return calendario;
	}
	public void setCalendario(Calendario calendario) {
		this.calendario = calendario;
	}
	public Transacao[] getTransacoes() {
		return transacoes;
	}
	public void setTransacoes(Transacao[] transacoes) {
		this.transacoes = transacoes;
	}
	public Cliente[] getClientes() {
		return clientes;
	}
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}	
}
