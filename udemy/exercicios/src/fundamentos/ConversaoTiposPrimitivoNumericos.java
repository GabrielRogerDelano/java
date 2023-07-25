package fundamentos;

public class ConversaoTiposPrimitivoNumericos {
	public static void main(String[] args) {
		
		double a = 1;//implicita
		System.out.println(a);
	
		float b =  (float)1.90;//explicita (CAST)
		System.out.println(b);

		int c = 4;//explicita (CAST)
		byte i =  (byte) c ;
		System.out.println(i);
		
		double e = 1.999;//explicita (CAST)
		int f =  (int)e;
		System.out.println(f);
	}
}
