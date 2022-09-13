package aula03carro;

public class Pessoa {
	String Nome;
	int Idade;
	double Peso;
	
	public void comer(){
	
		System.out.println(Nome+ " está comendo \n ");
}
	public void andar() {
		System.out.println(Nome+ " está andando \n ");
		
	}
	public void falar() {
		
		System.out.println(Nome+ " está falando \n ");
	}
	@Override
	public String toString() {
		return "Pessoa [Nome=" + Nome + ", Idade=" + Idade + ", Peso=" + Peso + "]";
	}


}