import java.util.Scanner;

public class HeronEstruturado {
	private static final Scanner ENTRADA = new Scanner(System.in);
	public static void main(String[] args) {
		// entrada
		double a1, a2, b1, b2, c1, c2; 
		a1 = ENTRADA.nextDouble();
		b1 = ENTRADA.nextDouble();
		c1 = ENTRADA.nextDouble();
		a2 = ENTRADA.nextDouble();
		b2 = ENTRADA.nextDouble();
		c2 = ENTRADA.nextDouble();
		//saida
		double s = (a1 + b1 + c1)/2;
		double area1 = Math.sqrt(s*(s - a1)*(s - b1)*(s - c1));		
		System.out.println("Area1: " + area1);
		System.out.println("Area1: " + calcularAreaTriangulo(a1, b1, c1));
		//saida
		s = (a2 + b2 + c2)/2;
		double area2 = Math.sqrt(s*(s - a2)*(s - b2)*(s - c2));
		System.out.println("Area2: " + area2);
		System.out.println("Area2: " + calcularAreaTriangulo(a2, b2, c2));
	}
	static double calcularAreaTriangulo(double a, double b, double c) {
		// processamento e representacao abstracional
		double s = (a + b + c)/2;
		return Math.sqrt(s*(s - a)*(s - b)*(s - c));
		
	}
}
