package generics;

public class caixaNumeroteste {
	public static void main(String[] args) {
		CaixaNumero<Integer> caixaA = new CaixaNumero<>();
		caixaA.guardar(123);
		System.out.println(caixaA.abrir());
		
		CaixaNumero<Double> caixaB = new CaixaNumero<>();
		caixaB.guardar(2.3);
		System.out.println(caixaB.abrir());
		
	}
}
