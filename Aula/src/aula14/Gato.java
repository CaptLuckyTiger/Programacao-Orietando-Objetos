package aula14;

public class Gato extends Mamifero {

	public Gato(String nome) {
		
		super(nome);
	}
	public void emetirSom() {
		System.out.println(this.nome+ " está miando");
	}
}
