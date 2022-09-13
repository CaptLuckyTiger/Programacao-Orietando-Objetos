package exercicioabstract;

public class AreaPerimetroTeste {
	public static void main(String[] args) {
		
		AreaPerimetro circulo=new Circulo("Azul",2.15);
		System.out.println("Ciruclo Resultado: "+circulo.calcularArea()+circulo.calcularPerimetro());
		
		AreaPerimetro quadrado=new Quadrado("Verde",4.2);
		System.out.println("Quadrado Resultado: "+quadrado.calcularArea()+quadrado.calcularPerimetro());
		
		AreaPerimetro retangulo=new Retangulo("Amarelo",5.1,4.2);
		System.out.println("Rentagulo Resultado:  "+retangulo.calcularArea()+retangulo.calcularPerimetro());
		
	}
}
