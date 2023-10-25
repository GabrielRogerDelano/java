package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Ju", "Leo");
	
		System.out.println("Forma tradicional");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando lambda");
		aprovados.forEach(nome -> System.out.println(nome + "!"));
		
		System.out.println("\nMetodo Reference");
		// entre os dois dois pontos fica o resultado do forEach
		aprovados.forEach(System.out::println);
		
		System.out.println("Funcoes dentro de lambdas");
		aprovados.forEach(nome -> imprimir(nome));
		
		System.out.println("\nMetodo Reference");
		aprovados.forEach(Foreach::imprimir);
	}
	
	static void imprimir(String nome) {
		System.out.println("Oi, meu nome e " + nome);
	}
}
