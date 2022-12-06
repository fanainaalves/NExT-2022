package aula4.professor;

import aula4.Aluno;

public class MainProfessor {
	public static void main(String[] args) {
		Aluno a = new Aluno(123, "EDUARDO");
		//a.setNome("CLAUDIO"); // dá erro de compilação pois setNome é default
		System.out.println(a.getMatricula());
	}
}
