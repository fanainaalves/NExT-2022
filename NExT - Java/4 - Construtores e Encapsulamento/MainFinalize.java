package aula4;

public class MainFinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno al = new Aluno(123, "CARLOS");
		//a1.nome = "EDUARDO"; d� erro de compila��o pois nome � private
		al.setNome("EDUARDO");
	}

}
