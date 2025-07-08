package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoSteams {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		Stream<String> linguagens = Stream.of("java ", "Ruby ", "PHP");
		linguagens.forEach(print);
		
		String[] OutrasLinguagens = {"JS ","Python ", "Go\n"};
		
		Stream.of(OutrasLinguagens).forEach(print);
		Arrays.stream(OutrasLinguagens).forEach(print);
		Arrays.stream(OutrasLinguagens,1 , 4).forEach(print);
		
		List<String> MaisLinguagens = Arrays.asList("C ", "Lua", "lisp");
		MaisLinguagens.stream().forEach(print);
		MaisLinguagens.parallelStream().forEach(print);
		
		Stream.iterate(0, n -> n + 1).forEach(println);
		
	}
}
