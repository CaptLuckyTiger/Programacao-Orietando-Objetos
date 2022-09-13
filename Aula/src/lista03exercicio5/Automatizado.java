package lista03exercicio5;

public class Automatizado {
	private int velocidade=0;
	private int marcha=0;

	public void acelerar() {
		if (this.velocidade <= 130) {
			this.velocidade += 5;
			System.out.println("Carro automatizado está aumentando a velocidade a:" + this.velocidade+"km");
			trocarMarcha();
		}
	
	}

	public void frear() {
		if (this.velocidade >= 0) {
			this.velocidade -= 5;
			System.out.println("Carro automatizado está diminuindo a velocide  a:" + this.velocidade+"km");
			
			this.trocarMarcha();
		}

	}
	
	private void trocarMarcha() {
		
		if(this.velocidade>=1 & this.velocidade<=19) {
			
			if(marcha!=1) {
				System.out.println("Engatando a 1-primeira marcha");
			
			}
			marcha=1;
		}
		if(this.velocidade>=20 & this.velocidade<=39) {
			if(marcha!=2){
				System.out.println("Engantando a 2-segunda marcha");
		
		
			}
			marcha=2;
		}
		if(this.velocidade>=40 & this.velocidade<=59) {
			if(marcha!=3) {
				System.out.println("Engantando a 3-terceira marcha");
			
			}
			marcha=3;
			
		}
		if(this.velocidade>=60 & this.velocidade<=89) {
			if(marcha!=4) {
				System.out.println("Engantando a 4-quarta marcha");
			
			}
			marcha=4;
			
		}
		if(this.velocidade>=90) {
			if(marcha!=5) {
				System.out.println("Engantando a 5-quarta marcha");
			}
			marcha=5;
		
	}
	
	}

	@Override
	public String toString() {
		return "Automatizado [velocidade=" + velocidade + ", marcha=" + marcha + "]";
	}



	

}
