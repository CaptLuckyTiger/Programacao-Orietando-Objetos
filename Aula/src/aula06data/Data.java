package aula06data;

public class Data {
	int dia;
	int mes;
	int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int mes,int ano) {
		
	this(0,mes,ano);
}

	public Data(int dia) {
		this(dia,0,0);
		
	}
	public Data() {
		this(0,0,0);
	}

	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}

}

