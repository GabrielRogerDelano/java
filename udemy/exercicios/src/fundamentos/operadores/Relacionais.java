package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		 System.out.println(2 == 3);
		 System.out.println(2 !=3);
		 System.out.println(2 < 3);
		 System.out.println(2 <= 3);
		 System.out.println(2 > 3);
		 System.out.println(2 >= 3);
		 
		 double Nota = 9.9;
		 boolean BomComportamento = true;
		 boolean PassouPorMedia = Nota >= 7;
		 
		 boolean TemDesconto = BomComportamento && PassouPorMedia;
		 
		 System.out.println("\nTem desconto? :" + TemDesconto);
	}
}
