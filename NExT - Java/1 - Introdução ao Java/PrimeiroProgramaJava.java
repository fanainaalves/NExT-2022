package next;

import java.util.Scanner;

public class PrimeiroProgramaJava {

	public static void main(String[] args) {
		// Inicializa recurso para ler dados do teclado
		Scanner entrada = new Scanner(System.in);
		// Escreve uma mensagem no console
		System.out.print("Digite um n�mero inteiro: ");
		// L� um n�mero inteiro do console e armazena o n�mero lido em uma vari�vel
		int x = entrada.nextInt(); 
		// Escreve uma mensagem no console
		System.out.print("Digite outro n�mero inteiro: ");
		// L� um n�mero inteiro do console e armazena o n�mero lido em uma vari�vel
		int y = entrada.nextInt();
		// Calcula a soma dos n�meros lidos e armazena o resultado em uma vari�vel
		int z = x + y;
		// Escreve o valor de uma vari�vel no console e PULA LINHA
		System.out.println(z);
		// Escreve uma mensagem no console
		System.out.print("Fim do programa!");		
	}

}
