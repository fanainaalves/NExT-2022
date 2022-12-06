package aula4;

public class ProgramaCarroAviao1 {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.marca = "FIAT";
		c1.potencia = 80.0;
		c1.modelo = "MOBI";
		c1.acelerar();
		Aviao a1 = new Aviao();
		a1.capacidadeCarga = 200.22;
		a1.quantidadePassageiros = 120;
		a1.decolar();
	}
}
