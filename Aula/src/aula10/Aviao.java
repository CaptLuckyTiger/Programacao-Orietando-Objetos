package aula10;

public class Aviao extends Veiculo {

	private int altitudeMaxima;

	public Aviao(String modelo, String fabricante, int ano, int numeroPassageiros, String combustivel,
			int altitudeMaxima) {
		super(modelo, fabricante, ano, numeroPassageiros, combustivel);

		this.altitudeMaxima = altitudeMaxima;

	}

	public void Voar() {
		System.out.println(this.fabricante + " " + this.modelo + " Est� levantando voou ");
	}
}
