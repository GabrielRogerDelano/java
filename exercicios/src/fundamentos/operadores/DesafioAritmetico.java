package fundamentos.operadores;

public class DesafioAritmetico {
	public static void main(String[] args) {
		int x = (int) Math.pow(2, 4);
		double y = Math.pow(5, 3);

		System.out.println(x);
		System.out.println(y);

		//Desafio
		double numA = Math.pow(6 * (3 + 2), 2);//30
		double denA = 3*2;
		
		double numB = (1-5) * (2-7);//20
		double denB = 2;

		double supA = numA/ denA;
		double supB = Math.pow(numB/ denB, 2);
		
		double superior = Math.pow(supA - supB, 3);
		double inferior = Math.pow(10, 3 );
		
		double e =  superior / inferior;
 
		System.out.println(e);
	}
}
