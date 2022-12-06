package aula6;

import aula6.mamifero.Homem;

public class ProgramaHirarquia {

	public static void main(String[] args) {
		Homem h1 = new Homem("11/11/1971");		
		h1.mamar();
		h1.nascer();
		h1.pensar();
		System.out.println(h1.dataNascimento);
		// public - visível no universo
		// protected - visível no pacote e na sub-hierarquia (ou em subclasses)
		// default - visível no pacote 
		// private - visível na classe
		int menor = Math.min(1, 2);
	}
}
