package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//dados de funcionarios
		
		//tipos numericos
		byte anosDeEmpresa = 21;
		short numeroDeViagens = 540;
		int id = 2_147_483_647;
		//para os tipos 'long' tem que colocaar um L no final
		long pontos = 991_000_112_123_434_111L;
		
		//tipos numericos reais
		//para os tipos 'float' tem que colocar um F no final 
		float salario = 1300.90F;
		double vendasAcumuladas = 2_991_787.82 ;
		
		//tipos booleanos
		boolean estaDeFereias = false;
		
		//tipo caractere
		char status = 'A';
		
		//dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//número de viagens
		System.out.println(numeroDeViagens / 2);
		
		//pontos por real
		System.out.println(pontos / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("ferias ->" + estaDeFereias);
		System.out.println("Status ->" + status);
		
		
		
	}
}
