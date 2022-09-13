package aula14;

public class Mamifero {
	protected String nome;

	public Mamifero(String nome) {
		this.nome=nome;
	}
	
	
	public void emetirSom() {
		System.out.println(this.nome+ " Está emitindo som generico ");
	}
}
