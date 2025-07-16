package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("gabi", 2.4);
		Aluno a2 = new Aluno("Ana", 5.4);
		Aluno a3 = new Aluno("Tales", 8.7);
		Aluno a4 = new Aluno("kilmer", 6.0);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Comparator<Aluno> MaiorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(MaiorNota).get());
		System.out.println(alunos.stream().min(MaiorNota).get());
	}
}
