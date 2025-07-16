package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("gabi", 2.4);
		Aluno a2 = new Aluno("Ana", 5.4);
		Aluno a3 = new Aluno("Tales", 8.7);
		Aluno a4 = new Aluno("kilmer", 6.0);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
		
		System.out.println(alunos.stream().allMatch(aprovado));
	}
}
