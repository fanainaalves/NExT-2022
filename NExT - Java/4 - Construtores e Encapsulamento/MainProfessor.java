package aula4.professor;

import aula4.Aluno;

public class MainProfessor {
	public static void main(String[] args) {
		Aluno a = new Aluno(123, "EDUARDO");
		//a.setNome("CLAUDIO"); // d� erro de compila��o pois setNome � default
		System.out.println(a.getMatricula());
	}
}
