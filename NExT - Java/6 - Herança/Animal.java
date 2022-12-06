package aula6;

public class Animal {
	static int x;
	static final int CONSTANTE_QUALQUER = 2;
	protected String dataNascimento; 
	protected void nascer() { 
		System.out.println("Nascendo genericamente");
	}
	public Animal(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	static void teste() {
		dataNascimento = "11/11/1902";
		nascer();
		x = 1;
	}
}
