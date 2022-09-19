package exercicio_abstract;

public class Retangulo extends AreaPerimetro {
	private Double base;
	private Double altura;
	public Retangulo(String cor, Double base, Double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public Double calcularArea() {
	
		return this.base*this.altura;
	}

	@Override
	public Double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*(this.base+this.altura);
	}
	
	
	
}
