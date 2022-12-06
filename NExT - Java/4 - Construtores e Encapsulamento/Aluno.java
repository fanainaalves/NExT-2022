package aula4;

public class Aluno {
	final double MEDIA_MINIMA_APROVACAO = 5.0;
	private long matricula;
	private String nome; 
	public Aluno(long matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	public long getMatricula() {
		return matricula;
	}
}
