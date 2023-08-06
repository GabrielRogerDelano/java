package classe;

public class PrimeiroTrauma {

	int a = 3;
	static int c = 5;
	public static void main(String[] args) {
		
		//como pegar um valor da classe
		
		//criando uma instacia da classa e mostrando o valor de a
		PrimeiroTrauma b = new PrimeiroTrauma();
		System.out.println(b.a);
		
		//ou tornando a variavel em static, poque static pode acessar static
		System.out.println(c);
	}
}
