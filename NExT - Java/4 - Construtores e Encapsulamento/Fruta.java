package aula4;

public class Fruta {
	private boolean temCaroco;
	private boolean temCasca;
	
	public Fruta(boolean temCaroco, boolean temCasca) {
		super();
		this.temCaroco = temCaroco;
		this.temCasca = temCasca;
	}
	
	public boolean isTemCaroco() {
		return temCaroco;
	}

	public void setTemCaroco(boolean temCaroco) {
		this.temCaroco = temCaroco;
	}

	public boolean isTemCasca() {
		return temCasca;
	}

	public void setTemCasca(boolean temCasca) {
		this.temCasca = temCasca;
	}

	public void retirarCarcoco() {
		this.temCaroco = false;
	}
}
