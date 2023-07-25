package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("digite o seu salario de 3 meses atras");
		String valor1 = entrada.nextLine().replace(',','.');
		
		System.out.println("digite o seu salario de 2 meses atras");
		String valor2 = entrada.nextLine().replace(',','.');
		
		System.out.println("digite o seu salario de 1 meses atras");
		String valor3 = entrada.nextLine().replace(',','.');
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2+ salario3)/3;

		System.out.printf("A sua media de salario eh R$%.2f: ",media);
		entrada.close();
	}
}
