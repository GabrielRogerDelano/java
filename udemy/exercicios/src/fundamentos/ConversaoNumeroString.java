package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		Integer num2 = 100000000;
		System.out.println(Integer.toString(num2).length());
	
		//concatenando com uma string vazia transforma o int em string, mas nao é didatico
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
	}
}
