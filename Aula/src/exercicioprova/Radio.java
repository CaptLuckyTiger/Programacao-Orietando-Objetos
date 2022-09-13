package exercicioprova;

public class Radio {
	private String modelo;
	private String marca;
	private int potencia;
	int volume = 0;
	double estacao = 35.2;
	boolean ligado = false;

	public Radio(String modelo, String marca, int potencia) {
		this.modelo = modelo;
		this.marca = marca;
		this.potencia = potencia;
	}

	public void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println("O radio está ligado");
		} else {
			System.out.println("O radio já est� ligado");
		}
	}

	public void desligar() {
		if (ligado) {
			ligado = false;
			System.out.println("O radio est� desligado");
		} else {
			System.out.println("O radio j� est� desligado");
		}
	}

	public void aumentarVolume() {
		if (volume <= 10) {
			if (ligado) {
				volume += 1;
				System.out.println("O volume está aumentando em:" + volume);
			}
			if (ligado == false) {
				System.out.println("Ligue o radio para poder aumentar ou diminuir");
			}
		}
	}

	public void diminuirVolume() {
		if (volume >= 1) {
			if (ligado) {
				volume -= 1;
				System.out.println("O volume está diminuindo a:" + volume);
			}
		}
		if (ligado == false) {
			System.out.println("O radio está desligado ligue para poder efetuar essa opera��o");
		}
	}

	public void aumentarEstacao() {
		if (estacao <= 77.5) {
			if (ligado) {
				estacao += 0.2;
				System.out.println("O radio está aumentando a estacao para" +estacao );
			}

		}
	}

	public void diminuirEstacao() {
		if (estacao >=35.4 ) {
			if (ligado) {
				estacao -= 0.2;
				System.out.println("O radaio está diminuindo a estacao em "+estacao);
			}
		}
	}

	@Override
	public String toString() {
		return "Radio [modelo=" + modelo + ", marca=" + marca + ", potencia=" + potencia + ", volume=" + volume
				+ ", estacao=" + estacao + ", ligado=" + ligado + "]";
	}

	
	}

