package exercicio_abstract;

public  abstract class AreaPerimetro {
	
	protected String cor;
	

	public AreaPerimetro(String cor) {
		this.cor = cor;
	}

	public abstract Double calcularArea();
	
	public abstract Double calcularPerimetro();
	
	
}
