package classe;

public class Data {
	int ano;
	int mes;
	int dia;
	
	//construtor padrao
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		
		//usando o this() para chamar outro contrutor, 
		//no caso o de data formatada definido pelos
		//paramentros dentro de this
		this(1, 1, 1970);
		 
	}
	
	//construtor formatado
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	//metodo para instancia
	String obterDataFormatada(){
		final String formato = "%d/%d/%d ";
		return String.format(formato, this.dia, this.mes, this.ano);
	}
	
	void imprimirDataFormatada() {
		//usando o this para chamar um metodo de instacia na classe
		System.out.println(this.obterDataFormatada());
	}
}
