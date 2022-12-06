package aula4;

public class Lampada {
	private boolean acesa;
	private double watts;
	public Lampada(boolean acesa) {
		this.acesa = acesa;
	}
	public Lampada(boolean acesa, double watts) {
		this.acesa = acesa;
		this.watts = watts;
	}
	public Lampada() {
		this.acesa = false;
		this.watts = 60.0;
	}
	public double getWatts() {
		return watts;
	}
	public void setWatts(double watts) {
		this.watts = watts;
	}
	public boolean isAcesa() {
		return acesa;
	}
	public void ligar() {
		this.acesa = true;
	}
	public void desligar() {
		this.acesa = false;
	}	
}
