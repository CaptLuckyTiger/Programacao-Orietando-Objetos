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
			System.out.println(marca + "" + modelo + " está ligando ");
		} else {
			System.out.println(marca + "" + modelo + " já está ligado ");
		}

	}

	public void desligar() {
 
		if (ligado) {
			ligado = false;
			System.out.println(marca + "" + modelo + " está desligando ");
		} else {
			System.out.println(marca + "" + modelo + " já está desligado ");
		}
	}

	public void processar_informacoes() {

		if (ligado) {
			System.out.println(marca + "" + modelo + " está processando informações ");
		} else {
			System.out.println(marca + "" + modelo + " já está processando informações ");
		}
	}

	public void conectar_internet() {
		if (ligado) { 
			System.out.println(marca + "" + modelo + " está conectando-se a internet ");
		}
		else {
			System.out.println(marca + "" + modelo + " está atualmente desligado e não pode se conectar a internet ");
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
