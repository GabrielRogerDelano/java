package fundamentos;

public class notacaoPonto{
	public static void main(String[] args) {
		
		String a = "Boa noite companheiros";
		a = a.replace("companheiros", "companheiris");
		a = a.toUpperCase();
		a = a.concat("!!!");
		System.out.println(a);
		
		String b = "Rafa".toLowerCase();
		System.out.println(b);
		
		String c = "nenhum animal dormira em cama"
				.toUpperCase()
				.concat(" com lencois e travesseiros");
		System.out.println(c);
		
		//Tipos primitivos nao tem o operador'.'
	}
}
