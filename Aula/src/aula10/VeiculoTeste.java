package aula10;

public class VeiculoTeste {
		
	public static void main(String[]args) {
		Carro carro1= new Carro("Gol","Volskwagen",2020,5,"Flex",5);
		
		carro1.calibrarPneus();
		carro1.abastecer();
		
		Aviao aviao1=new Aviao("A-300","AIRBUS",2005,800,"Combustivel de avião",4000);
		aviao1.Voar();
		aviao1.abastecer();
	}
}
