package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("gabi", 2.4);
		Aluno a2 = new Aluno("Ana", 5.4);
		Aluno a3 = new Aluno("Tales", 8.7);
		Aluno a4 = new Aluno("kilmer", 6.0);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
		Function<Aluno, Double> apenasNota = n -> n.nota;
		
		BiFunction<Media, Double, Media> calcularMedia  = 
				(media, nota) -> media.adicionar(nota);
				
		BinaryOperator<Media> combinarMedia = 
				(m1, m2) -> Media.combinar(m1, m2);
				
		Media media = alunos.stream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.print("A media da turma de aprovados é " + media.getValor() );
	}
}	
