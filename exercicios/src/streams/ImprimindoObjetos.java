package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Luis", "Miguel", "Tulio");
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando iterator.");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("\nUsando Stream");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}
}
