package generics;

public class caixaTeste {
	public static void main(String[] args) {
		Caixa<String> caixaA =  new Caixa<>();
		caixaA.guardar("A caixa A guarda uma String");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);

		
		Caixa<Double> caixaB =  new Caixa<>();
		caixaB.guardar(9.0090);
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}
}
