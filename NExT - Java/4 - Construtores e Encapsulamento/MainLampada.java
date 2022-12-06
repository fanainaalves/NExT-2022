package aula4;

public class MainLampada {

	public static void main(String[] args) {
		Lampada l1 = new Lampada();
		Lampada l2 = new Lampada(true, 100.0);
		Lampada l3 = new Lampada(true);
		System.out.println(l1.getWatts());
		System.out.println(l1.isAcesa());
		System.out.println(l2.getWatts());
		System.out.println(l2.isAcesa());
		System.out.println(l3.getWatts());
		System.out.println(l3.isAcesa());
		l1.ligar();
		l2.desligar();
		System.out.println(l1.isAcesa());
		System.out.println(l2.isAcesa());
	}

}
