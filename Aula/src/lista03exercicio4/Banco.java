package lista03exercicio4;

public class Banco {

	private int agencia;
	private int conta;
	private double saldo;

	public Banco(int agencia, int conta) {

		this.agencia = agencia;
		this.conta = conta;
		this.saldo = 4000.00;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		System.out.printf("\nValor R$:%.2f depositado", valor);
	}

	public void sacar(double valor) {
		if (this.saldo >= valor) {

			this.saldo -= valor;
			System.out.println("\nSaque executado");
		} else {
			System.out.println("\nSaldo insuficiente:");
		}
	}

	public void saldom() {
		System.out.println("\nO saldo atual é R$:" + this.saldo);
	}

	@Override
	public String toString() {
		return "Banco [agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + "]";
	}

}
