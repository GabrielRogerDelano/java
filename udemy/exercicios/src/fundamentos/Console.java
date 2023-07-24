package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia\n");
		
		System.out.println("Bom");
		System.out.println(" dia");
		
		System.out.printf("Seu nome e %s", "Yuri");
		System.out.printf("Seu salario e R$%.2f\n\n", 1823.9821);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		var nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		var sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		var idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d" , nome,sobrenome, idade);
		
		entrada.close();
		
	}
}
