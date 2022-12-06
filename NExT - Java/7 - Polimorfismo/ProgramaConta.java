package aula7;

public class ProgramaConta {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(true);		
		conta.creditar(100.0);
		System.out.println(conta.saldo);
	}
}
