package aula05;

public class Galinha {
	String nome;
	int quantidadedeOvos=0;
	static int quantidadeOvosGranja=0;
	
	
	public void botar() {
		quantidadedeOvos++;
		quantidadeOvosGranja++;
	}
}
