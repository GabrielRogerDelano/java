package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Antonio");
		lista.add(u1);
		lista.add(new Usuario("Bart"));
		lista.add(new Usuario("yuri"));
		lista.add(new Usuario("Fernanda"));
		lista.add(new Usuario("Paulo"));
		 
		//diferente de um conjunto, uma lista pode ser acessada pelo indice
		System.out.println("Acesando um elemento da lista no indice 1 :\n"
		+ lista.get(1));
		
		
		//removendo um elemento da lista
		System.out.println("\nremovendo um elemento da lista no indice 1: \n"
		+ lista.remove(1));

		System.out.println("\nremovendo um elemento da lista no indice 0: \n"
		+ lista.remove(u1));
		
		
		//verificando se a lista contem um elemento
		System.out.println("\nA fernanda esta na lista?\n"
		+ lista.contains(new Usuario("Fernanda")));
		
		System.out.println("\nA Antonio esta na lista?\n"
		+ lista.contains(u1));
		
		
		System.out.println("\n\nUsuarios da lista");
		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
		 
		
	
	}
}
