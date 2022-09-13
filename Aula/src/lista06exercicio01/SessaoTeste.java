package lista06exercicio01;

public class SessaoTeste {
	public static void main(String[] args) {
		Filme filme1 = new Filme("ROCK 4", "102 minutos");
		Sala sala1 = new Sala(81823, 300, filme1);
		
		Sessao sessao1 = new Sessao("09/11/1958", "9:58", sala1);
		sessao1.venderIngresso(100);
		sessao1.venderIngresso(500);

		
		sessao1.imprimirDados();

	}
}
