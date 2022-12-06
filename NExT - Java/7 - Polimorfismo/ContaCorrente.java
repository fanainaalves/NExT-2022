package aula7;

public class ContaCorrente extends Conta {
	String cpfCorrentista;
	boolean ganhaBonus;
	
	public ContaCorrente(boolean ganhaBonus) {
		this.ganhaBonus = ganhaBonus;
	}
	
	@Override
	void creditar(double valor) {
		if (ganhaBonus == true) {
			saldo = saldo + valor + 0.10;
		} else {
			saldo = saldo + valor;
		}		
	}
}
