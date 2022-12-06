package aula7;

public class ProgramaOpSoma {

	public static void main(String[] args) {
		OperacaoMatematica om = new OperacaoMatematica();
		int a = 2; 
		double b = 3.0;
		double[] valores = {1.0, 3.0, 2.0};
		double[] valores1 = {b, 2.1, 4.3, 0.1};
		om.somar(a, 1);
		om.somar(b, 9.0);
		om.somar(valores);
		om.somar(valores1);
		om.somar(a, b);
		om.somar(a, 1, 2);
	}
}
