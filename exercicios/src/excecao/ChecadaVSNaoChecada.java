package excecao;

public class ChecadaVSNaoChecada {
	public static void main(String[] args) {
		
		try {
			erro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			erro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	public static void erro1() throws RuntimeException{
		throw new RuntimeException("Erro massa 01");
	}

	public static void erro2() throws Exception{
		throw new Exception("Erro top 02");
	}
}
