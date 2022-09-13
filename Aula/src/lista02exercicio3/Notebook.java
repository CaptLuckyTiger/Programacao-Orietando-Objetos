package lista02exercicio3;

public class Notebook {
	String marca;
	String modelo;
	double polegadas_tela;
	String modelo_processador;
	int RAM;
	int HD_SSD;
	boolean ligado = false;

	public void ligar() {
		if (!ligado) // if (ligado==false)
		{
			ligado = true;
			System.out.println(marca + "" + modelo + " est� ligando ");
		} else {
			System.out.println(marca + "" + modelo + " j� est� ligado ");
		}

	}

	public void desligar() {
 
		if (ligado) {
			ligado = false;
			System.out.println(marca + "" + modelo + " est� desligando ");
		} else {
			System.out.println(marca + "" + modelo + " j� est� desligado ");
		}
	}

	public void processar_informacoes() {

		if (ligado) {
			System.out.println(marca + "" + modelo + " est� processando informa��es ");
		} else {
			System.out.println(marca + "" + modelo + " j� est� processando informa��es ");
		}
	}

	public void conectar_internet() {
		if (ligado) { 
			System.out.println(marca + "" + modelo + " est� conectando-se a internet ");
		}
		else {
			System.out.println(marca + "" + modelo + " est� atualmente desligado e n�o pode se conectar a internet ");
		}
	}

	public void imprimirDados() {
		System.out.println("==================================");
		System.out.println("Marca:" + marca);
		System.out.println("Modelo:" + modelo);
		System.out.println("Polegadas da tela:" + polegadas_tela);
		System.out.println("RAM:" + RAM);
		System.out.println("HD/SSD:" + HD_SSD);
	}

	@Override
	public String toString() {
		return "Notebook [marca=" + marca + ", modelo=" + modelo + ", polegadas_tela=" + polegadas_tela
				+ ", modelo_processador=" + modelo_processador + ", RAM=" + RAM + ", HD_SSD=" + HD_SSD + ", ligado="
				+ ligado + "]";
	}

}
