package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		//primeiro a entrar é o primeiro a sair
		Queue<String> fila = new LinkedList<String>();
		
		//offer e add -> adicionam elementos na fila
		//diferenca é o comportamento ocorre quando a fila esta cheia!
		fila.add("Ana"); // retorn false se estiver cheio
		fila.offer("Bia"); // lanca uma excecao quando esta cheia
		fila.add("Hornet");
		fila.offer("Eva");
		fila.add("Rafael");
		fila.offer("Gui");
		
		//peek e element -> obtem o proximo elemento da fila da fila(sem remover)
		//Diferenca é o comportamento quando a fila esta vazia
		System.out.println(fila.peek());// retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element());//lanca um excecao
		System.out.println(fila.element());	
		
		//poll e remove -> obtem o proximo elemento da fila da fila
		//e remove
		//Diferenca é o comportamento quando a fila esta vazia
	
		System.out.println(fila.poll()); // retorna false quando estiver vazia
		System.out.println(fila.remove());// lanca um excecao quando estiver vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();	
		
		
		
		
	}
}
