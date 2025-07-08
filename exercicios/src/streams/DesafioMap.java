package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		 
		Function<Integer, String> virarBinario = n -> n.toBinaryString(n);
		
		UnaryOperator<String> inverte = 
				texto -> new StringBuilder(texto).reverse().toString();
				
		Function<String, Integer> binarioParaInteger = 
				string -> Integer.parseInt(string, 2);
			
		nums.stream()
			.map(virarBinario)
			.map(inverte)
			.map(binarioParaInteger)
			.forEach(Utilitarios.print);
	}
}
