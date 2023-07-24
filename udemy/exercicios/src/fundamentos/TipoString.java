package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(1));
		
		String s = "Bom tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("bom"));
		System.out.println(s.toLowerCase().startsWith("tarde"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
	
		var nome = "Pedro";
		var sobrenome = "Sombra";
		var idade = 23;
		var salario = 1330.50;
		
		System.out.printf("O senhor %s %s tem %d anos e recebe R$%.2f .\n\n", nome,sobrenome ,idade,salario);
		System.out.println("frase qualque".contains("qual"));
		System.out.println("frase qualque".indexOf("qual"));
		System.out.println("frase qualque".substring(6));
		System.out.println("frase qualque".substring(6, 8));
	}
}
