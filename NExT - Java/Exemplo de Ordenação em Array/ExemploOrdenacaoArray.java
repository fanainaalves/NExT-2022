package aula2;

public class ExemploOrdenacaoArray {
	public static void main(String[] args) {
		double[] numeros = {2.1, 3.2, 1.0, 5.3, 4.2, 0.3, 4.2};
		double aux = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int k = i + 1; k < numeros.length; k++) {
				if (numeros[k] < numeros[i]) {
					aux = numeros[k];
					numeros[k] = numeros[i];
					numeros[i] = aux;
				}
			}
		}
		for (int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
