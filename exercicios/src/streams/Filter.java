package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("marcos", 9.0);
		Aluno aluno2 = new Aluno("Yumi", 6.7);
		Aluno aluno3 = new Aluno("Jaques", 8.3);
		Aluno aluno4 = new Aluno("Ivan", 2.5);
		Aluno aluno5 = new Aluno("Loki", 6.4);
		
		List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);
		
		Predicate<Aluno> aprovado = aluno -> aluno.nota>= 7;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns "+ a.nome + ", você foi aprovado(a)";
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
			;
	}
}
