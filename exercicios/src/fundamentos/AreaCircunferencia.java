package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		//declrando variaveis
		int raio = 3;
		//final (tipo da variavel) == torna a variavel em constante. Por coveniencia deixa tmb em maiusculas
		final double PI= 3.14159;
		
		double area = PI * raio * raio;
		//syso - abreviacao para 'System.out.println();' 
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " + area + "m2. ");
	}
}
