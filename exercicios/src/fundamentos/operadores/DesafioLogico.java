package fundamentos.operadores;

public class DesafioLogico {
	public static void main(String[] args) {
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		System.out.printf("Comprou a TV de 50 polegadas : %b",(trabalho1 && trabalho2));
		System.out.printf("\nComprou a TV de 32 polegadas : %b",(trabalho1 ^ trabalho2));
		System.out.printf("\nTem sorvete : %b",(trabalho1 || trabalho2));
		
	}
}
