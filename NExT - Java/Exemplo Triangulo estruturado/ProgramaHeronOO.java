import java.util.Scanner;

public class ProgramaHeronOO {
	private static final Scanner ENTRADA = new Scanner(System.in);
	public static void main(String[] args) {
		double l11 = ENTRADA.nextDouble();
		double l12 = ENTRADA.nextDouble();
		double l13 = ENTRADA.nextDouble();
		double l21 = ENTRADA.nextDouble();
		double l22 = ENTRADA.nextDouble();
		double l23 = ENTRADA.nextDouble();
		Triangulo t1 = new Triangulo(l11, l12, l13);
		Triangulo t2 = new Triangulo(l21, l22, l23);
		System.out.println(t1.calcularArea());
		System.out.println(t2.calcularArea());
	}

}
