
public class Triangulo {
	double lado1;
	double lado2;
	double lado3;
	Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	double calcularArea() {
		double s = calcularPerimetro() / 2;
		return Math.sqrt(s*(s - lado1)*(s - lado2)*(s - lado3));
	}
	double calcularPerimetro() {
		return (lado1 + lado2 + lado3);
	}
}
