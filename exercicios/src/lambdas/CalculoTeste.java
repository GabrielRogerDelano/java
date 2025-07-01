package lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		Calculo soma = new Somar();
		System.out.println(soma.executar(2, 0.2));
		
		Calculo multiplicar = new Multiplicar();
		System.out.println(multiplicar.executar(2, 0.2));
		
		
	}
}
