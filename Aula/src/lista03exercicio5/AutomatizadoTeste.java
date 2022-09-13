package lista03exercicio5;

public class AutomatizadoTeste {
	public static void main(String[] args) {
		Automatizado carro = new Automatizado();
		
		System.out.println(carro);
		int i;
		
		for( i=0; i<20; i++){
			carro.acelerar();
		}
		
		for(i=0; i<20; i++) {
			carro.frear();
		}
	

	}
}
