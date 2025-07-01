package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o primeiro valor");
		double valor1 = entrada.nextDouble();
		
		System.out.println("digite o segundo valor");
		double valor2 = entrada.nextDouble();

		System.out.println("qual operacao quer efetuar");
		String operacao = entrada.next();
		
		double resultado =  "+".equals(operacao) ? valor1 + valor1 : 0 ;
		resultado =  "-".equals(operacao) ? valor1 - valor1 : resultado;
		resultado =  "*".equals(operacao) ? valor1 * valor1 : resultado;
		resultado =  "/".equals(operacao) ? valor1 / valor1 : resultado;
		resultado =  "%".equals(operacao) ? valor1 % valor1 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",valor1 , operacao , valor2 , resultado );
	
		entrada.close();
	}
}
