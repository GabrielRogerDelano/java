package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		int idade = 3;
		switch(idade) {
		case 3:
			System.out.println("sabe falar");
		case 2: 
			System.out.println("sabe andar");
		case 1:
			System.out.println("sabe engatinhar");
			break;
		default:
			System.out.println("sabe muito");
		}
		
	}
}
