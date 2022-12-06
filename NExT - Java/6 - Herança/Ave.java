package aula6;

public class Ave extends Animal {	
	double velocidadeVoo;
	void voar() {
		System.out.println("Voando genericamente");
	}
	public Ave(String dataNascimento, double velocidadeVoo) {
		super(dataNascimento);
		this.velocidadeVoo = velocidadeVoo;
	}
}
