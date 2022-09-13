package lista03exercicio51;

public class Automatizado2 {
	private int velocidade = 0;
	private int marcha = 0;

	public void acelerar() {
		if (this.velocidade <= 130) {
			this.velocidade += 5;
			System.out.println("Carro automatizado está aumentando a velocidade a:" + this.velocidade + "km");
			trocarMarcha();
		}

	}

	public void frear() {
		if (this.velocidade >= 0) {
			this.velocidade -= 5;
			System.out.println("Carro automatizado está diminuindo a velocide  a:" + this.velocidade + "km");

			this.trocarMarcha();
		}

	}

	private void trocarMarcha() {

		if (this.velocidade >= 1 && this.velocidade <= 19) {
			marcha = 1;
			if (marcha >= 1) {
				System.out.println("Engatando a 1-primeira marcha");
			}

		}
		if (this.velocidade >= 20 && this.velocidade <= 39) {
			marcha = 2;
			if (marcha >= 2) {
				System.out.println("Engantando a 2-segunda marcha");

			}
		}
		if (this.velocidade >= 40 && this.velocidade <= 59) {
			marcha = 3;
			if (marcha >= 3) {
				System.out.println("Engantando a 3-terceira marcha");

			}
			

		}
		if (this.velocidade >= 60 && this.velocidade <= 89) {
			 marcha = 4;
			if (marcha >= 4) {
				System.out.println("Engantando a 4-quarta marcha");

			}
		

		}
		if (this.velocidade >= 90) {
			marcha = 5;
			if (marcha >= 5) {
				System.out.println("Engantando a 5-quarta marcha");
			}
			

		}

	}

	@Override
	public String toString() {
		return "Automatizado2 [velocidade=" + velocidade + ", marcha=" + marcha + "]";
	}

}
