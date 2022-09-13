package lista03exercicio51;


public class Automatizado2Teste {
	public static void main(String[] args) {
		Automatizado2 carro = new Automatizado2();
		
		
		int i;
		
		for( i=0; i<20; i++){
			carro.acelerar();
			System.out.println(carro);
		}
		
		for(i=0; i<20; i++) {
			carro.frear();
		}
	

	}
}
