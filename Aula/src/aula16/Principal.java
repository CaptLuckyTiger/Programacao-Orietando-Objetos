package aula16;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {

		Carro carro1 = new Carro("ABC-1234", "Gol");
		Carro carro2 = new Carro("BACS-2485", "Fusca");
		Carro carro3 = new Carro("asdhasf-2485", "Onix");
		Carro carro4 = new Carro("B234-5", "XSport");

		List<Carro> vetorGenerico = new ArrayList<Carro>();

		vetorGenerico.add(carro1);
		vetorGenerico.add(carro2);
		vetorGenerico.add(carro3);
		vetorGenerico.add(carro4);

		// Carro c = (Carro) vetorGenerico.get(1);

//		for (int i = 0; i < vetorGenerico.size(); i++) {
//
//			Carro c = (Carro) vetorGenerico.get(i);
//
//			System.out.println(c.getPlaca());
//		}

		for (Carro c : vetorGenerico) {
			System.out.println(c.getPlaca());
		}
		// System.out.println(c);
	}
}
