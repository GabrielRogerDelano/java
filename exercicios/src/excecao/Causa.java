package excecao;

public class Causa {
	public static void main(String[] args) {
		try {
			metodoA(null);
		} catch (Exception causa) {
			if(causa.getCause() != null) {
				System.out.println(causa.getCause().getMessage());
			}
		}
		
		metodoA(null);
	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno está nulo");
		}
		System.out.println(aluno.nome);
	}
}
