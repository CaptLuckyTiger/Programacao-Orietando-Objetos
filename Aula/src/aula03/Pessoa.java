package aula03;

public class Pessoa {
	String Nome;
	int Idade;
	double Peso;
	
	public void comer(){
	
		System.out.println(Nome+ " est� comendo \n ");
}
	public void andar() {
		System.out.println(Nome+ " est� andando \n ");
		
	}
	public void falar() {
		
		System.out.println(Nome+ " est� falando \n ");
	}
	@Override
	public String toString() {
		return "Pessoa [Nome=" + Nome + ", Idade=" + Idade + ", Peso=" + Peso + "]";
	}


}