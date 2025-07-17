package excecao;

public class Basico {
	public static void main(String[] args) {
		
		
		Aluno a1 = null;
		
		try {
			imprimirNome(a1);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario");
		}		
		
		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro de: " + e.getMessage());
		}
		
		System.out.println("FIM");
	}
	
	public static void imprimirNome(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
