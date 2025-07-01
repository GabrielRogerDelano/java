package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data NiverRobson  = new Data();
		NiverRobson.dia = 29;
		NiverRobson.mes = 2;
		NiverRobson.ano = 2004;

		Data d2  = new Data();

		System.out.println(NiverRobson.obterDataFormatada());
		System.out.printf(d2.obterDataFormatada());
	}
}
