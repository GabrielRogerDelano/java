package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DesafioFilter {
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Hiago", 1600.0, 2);
		Funcionario func2 = new Funcionario("Yumi", 2000.0, 22);
		Funcionario func3 = new Funcionario("Tayna", 1850.0, 12);
		
		List<Funcionario> func = Arrays.asList(func1, func2, func3);
		
		Function<Funcionario, String> Nome = n-> n.nome.toUpperCase() ;
		
		func.stream()
			.map(Nome)
			.forEach(System.out::println);
		;
	}
}
