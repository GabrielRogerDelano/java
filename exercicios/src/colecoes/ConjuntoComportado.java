package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//o que fica entre o <> é o tipo que aquele conjunto recebera
		//Sorted deixou a lista em ordem alfabetica
		SortedSet<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Eva");
		
		//lista.add(1.23);//erro pq esse conjunto so recebe String
		listaAprovados.add("Alice");
		listaAprovados.add("Marcos");
		listaAprovados.add("Edward");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		//por padrao deixa em ordem crescente
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(300);
		nums.add(9);
		
		for (int n : nums) {
			System.out.println(n);
		}
	}
}
