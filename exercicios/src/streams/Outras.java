package streams;

import java.util.Arrays;
import java.util.List;

public class Outras {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("gabi", 2.4);
		Aluno a2 = new Aluno("Ana", 5.4);
		Aluno a3 = new Aluno("Tales", 8.7);
		Aluno a4 = new Aluno("kilmer", 6.0);
		Aluno a5 = new Aluno("Jane", 5.0);
		Aluno a6 = new Aluno("carlos", 7.0);
		Aluno a7 = new Aluno("gustavo", 9.9);
		Aluno a8 = new Aluno("marcos", 1.0);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		System.out.println("Usando distinct");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip e Limit");
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(3)
			.forEach(System.out::println);
		
		System.out.println("\nTakeWhile");
			alunos.stream()
			.distinct()
			.takeWhile(a -> a1.nota >= 7)
			.forEach(System.out::println);
		
	}
}
