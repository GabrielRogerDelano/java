package generics;

public class CaixaObjetoteste {
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar("bola");
		
		String coisa = (String) caixaA.abrir();
		System.out.println(coisa);
	
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar(2.9);
		
		Double coisa2 = (Double) caixaB.abrir();
		System.out.println(coisa2);
	}
}
