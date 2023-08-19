package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		//ultimo a entrar é o primeiro a sair
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("o pequeno pricipe");
		livros.push("Don Quixote");
		livros.push("O hobbit");
		
		// a explicacao do que cada um faz esta em Fila.java
		//a diferenca da fila e pilha é que em pilha comeca
		//pelo ultimo adicionado
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println("\ntodos os livros na pilha : ");
		for (String livro : livros) {
			System.out.println(livro);
		}
		
		System.out.println("\nRemovendo livros : ");
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.remove());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		
		
	}
}
