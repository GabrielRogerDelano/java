package oo.composicao;

public class CursosTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Clara");
		Aluno aluno2 = new Aluno("Tulio");
		Aluno aluno3 = new Aluno("Jonh");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Python");
		Curso curso3 = new Curso("C#");
		
		aluno1.adicionarCurso(curso1);
		aluno2.adicionarCurso(curso1);
		
		aluno1.adicionarCurso(curso2);
		aluno3.adicionarCurso(curso2);
		
		curso3.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno3);
		
		for (Aluno aluno : curso1.alunos) {
			System.out.println("meu nome é " + aluno.nome 
					+ " e estou matriculado no curso de " 
					+ curso1.nome + "\n");
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursosencontrados = aluno1.obterCursosPorNomes("Java");
		
		if(cursosencontrados != null) {
			System.out.println(cursosencontrados.nome);
			System.out.println(cursosencontrados.alunos);
		}
	}
}
