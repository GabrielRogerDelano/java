package generics;

public class ParesTeste {
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso =new Pares<>();
		
		resultadoConcurso.adicionar(1, "Carol");
		resultadoConcurso.adicionar(2, "Yaulo");
		resultadoConcurso.adicionar(3, "Vinicius");
		resultadoConcurso.adicionar(4, "Marcos");
		resultadoConcurso.adicionar(2, "Yuri");
		
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(3));
	}
}
