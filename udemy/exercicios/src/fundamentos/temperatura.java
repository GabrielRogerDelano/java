package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		//(°f -32 ) * 5/9 = °C
		final double AJUSTE = 32;
		final double FATOR = 5.0 /9.0;
		
		double fahrenheit  = 20;
		double celsius = (fahrenheit - AJUSTE ) * FATOR;
		System.out.println(fahrenheit + "fahrenheit equivalem a " + celsius+" graus celsius");
	}
}
