package aula5;

public class Funcionario {
	private String nome;
	private String cpf;
	private Dependente[] dependentes;
	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public Funcionario(String nome, String cpf, Dependente[] dependentes) {
		this.nome = nome;
		this.cpf = cpf;
		this.dependentes = dependentes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Dependente[] getDependentes() {
		return dependentes;
	}
	public void setDependentes(Dependente[] dependentes) {
		this.dependentes = dependentes;
	}
}
