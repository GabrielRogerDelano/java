package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		// atribuicao por valor(primitivo), faz uma copia do valor
		int a = 2;
		int b = a; 
		
		a ++;
		b --;
		//O resultado mudou pq cada um obteve uma copia
		System.out.println(a + " " + b);
		
		//atribuicao por referencia(objeto), d1 e d2 fazer referencia ao mesmo endereco de memoria
		Data d1 = new Data(5, 6, 2002);
		Data d2 = d1;
		
		d2.mes = 9;
		d2.ano = 2004;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarValorPadroa(d2);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
		
		
	}
	
	static void voltarValorPadroa(Data a) {
		a.dia = 1;
		a.mes = 1;
		a.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
