package aula6.mamifero;

import aula6.Animal;

public class Mamifero extends Animal {
	public void mamar() {
		System.out.println("Mamando");
	}
	public Mamifero(String dataNascimento) {
		super(dataNascimento);
	}
}
