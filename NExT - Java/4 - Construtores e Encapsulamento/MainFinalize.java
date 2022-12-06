package aula4;

public class MainFinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno al = new Aluno(123, "CARLOS");
		//a1.nome = "EDUARDO"; dá erro de compilação pois nome é private
		al.setNome("EDUARDO");
	}

}
