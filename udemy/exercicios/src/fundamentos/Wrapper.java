package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		//O que é wrapper : Eles são um nome adicional ao padrão de projeto Decorator.
		//Tem como principal função “envolver coisas” adicionando funcionalidades à ela.
		//sao representados pela primeira letra do tipo da variavel sendo maiuscula.
		
		//byte != Byte
		Byte b = 100;
		Short s = 1000;
		
		Integer i = 10000;
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
	
		Float f = 123.1F;
		System.out.println(f);
		
		Double d = 1080.1960;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		//resumindo: o wrapper torna o tipo primitivo em um objeto para fazer certas funcoes
		//como o caso acima. Que converteu um valer primitivo para wtrapper na linha 21
		//e na linha 23 transformuo para string antes de upperCase()
		
		Character c = '$'; //char
		System.out.println(c);
	}
}
