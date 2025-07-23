package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacao {
	public static void main(String[] args) {

		try {
			Aluno aluno = new Aluno("Marcos", 11.0);
			Validar.aluno(aluno);
			Validar.aluno(null);
			
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaDoIntervaloException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("FIM");
	}
}
