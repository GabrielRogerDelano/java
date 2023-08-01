package controle;

public class Break {
	public static void main(String[] args) {
		
		//Break para a repeticao
		
		for(int i = 0 ; i < 10; i++){
			
			if(i == 5){
				break;
			}
			
			System.out.println(i);
		}
		System.out.println("FIM");
	
	}
}
