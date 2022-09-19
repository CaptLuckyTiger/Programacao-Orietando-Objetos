package aula16_1;


public class ContaTeste {

	public static void main(String[] args) {

		Banco banco = new Banco(12456, "NewBank");

		banco.criarNovasContas(1, "Jo�o da Silva");
		banco.criarNovasContas(2, "Maria de Oliveira");
		banco.criarNovasContas(3, "Ricardo Carvalho");

		banco.realizarDeposito(5, 500.00); // conta inexistente

		banco.realizarDeposito(2, 1000.00);
		banco.realizarDeposito(3, 650.00);

		banco.realizarSaque(2, 150.00);

		banco.verificarSaldo(1);
		banco.verificarSaldo(2);
		banco.verificarSaldo(3);

	}
}
