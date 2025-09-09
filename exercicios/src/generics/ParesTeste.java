package generics;

public class ParesTeste {
	
	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso= new Pares<>();
		
		resultadoConcurso.adicionar(1, "Angela");
		resultadoConcurso.adicionar(2, "Carlos");
		resultadoConcurso.adicionar(3, "Caio");
		resultadoConcurso.adicionar(4, "Yumi");
		resultadoConcurso.adicionar(2, "Ursula");
		
		System.out.println(resultadoConcurso.getValor(2));
	}
}
