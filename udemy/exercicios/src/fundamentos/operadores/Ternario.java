package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoFinal = media >= 7.6 ? "Aprovado" : "reprovado";
	
		System.out.println("O aluno está " + resultadoFinal);
		
		 double Nota = 9.9;
		 boolean BomComportamento = true;
		 boolean PassouPorMedia = Nota >= 7;
		 boolean TemDesconto = BomComportamento && PassouPorMedia;
		 String resultado = TemDesconto ? "Sim" : "Não";
		 System.out.println("\nTem desconto? :" + resultado);
		
	}
}
