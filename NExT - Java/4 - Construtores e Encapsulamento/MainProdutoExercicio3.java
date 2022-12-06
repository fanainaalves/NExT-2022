package aula4;

public class MainProdutoExercicio3 {

	private static final String VIRGULA = " , ";

	public static void main(String[] args) {
		ProdutoExercicio3 p1 = new ProdutoExercicio3();
		p1.setDescricao("Maçã");
		p1.setValor(4.30);
		p1.setEstoque(55700);
		ProdutoExercicio3 p2 = new ProdutoExercicio3();
		p2.setDescricao("Arroz");
		p2.setValor(2.30);
		p2.setEstoque(78);
		String dadosProd1 = p1.getDescricao() + VIRGULA 
				+ p1.getValor() + VIRGULA + p1.getEstoque();
		System.out.println(dadosProd1);
		System.out.println(p2.getDescricao() + VIRGULA 
				+ p2.getValor() + VIRGULA + p2.getEstoque());
	}

}
