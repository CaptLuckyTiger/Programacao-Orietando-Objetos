package exercicioabstract;

public class Circulo extends AreaPerimetro {
	private Double raio;

	public Circulo(String cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public Double calcularArea() {
		
		return this.raio*2*3.14;
	}

	@Override
	public Double calcularPerimetro() {
	
		return 2*3.14*this.raio;
	}
	
	
	
	
}
