package aula7;

public class ContaPoupanca extends ContaCorrente {
	double taxaJuros;
	void render() {
		saldo = saldo * (1 + taxaJuros/100);
	}
}
