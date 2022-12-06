package aula6;

public class BeijaFlor extends Ave {
	double tempoDeParadinha;
	public BeijaFlor(String dataNascimento, double velocidadeVoo,
			double tempoDeParadinha) {
		super(dataNascimento, velocidadeVoo);
		this.tempoDeParadinha = tempoDeParadinha;
	}
}
