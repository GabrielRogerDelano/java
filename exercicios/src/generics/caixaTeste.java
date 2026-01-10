package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		Caixa<Boolean> caixaA = new Caixa<>();
		caixaA.guardar(true);

		System.out.println(caixaA.abrir());
	}
}
