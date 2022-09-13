package aula14;

public class Cachorro extends Mamifero {

	public Cachorro(String nome) {
		super(nome);
	
	}
	
	public void emetirSom() {
		System.out.println(this.nome+ " está latindo");
	}
}
