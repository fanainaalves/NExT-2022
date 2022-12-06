package aula7;

public class Conta {
	long numero;
	double saldo;
	void creditar(double valor) {
		saldo = saldo + valor;
	}
	final void debitar(double valor) {
		saldo = saldo - valor;
	}	
}
