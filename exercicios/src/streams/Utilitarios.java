package streams;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Utilitarios {

	private Utilitarios() {
		
	}
	
	public static final UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	
	public static final UnaryOperator<String> primeiraLetra = n -> n.charAt(0)+"";
	
	public static final Consumer<Object> print = System.out::println;
	
	
	public static String grito(String n) {
		return  n + "!!!";	
	}
}
