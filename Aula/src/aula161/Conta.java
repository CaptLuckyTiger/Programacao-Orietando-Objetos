package aula161;

public class Conta {
	private int numeroConta;
	private double saldo;
	private String nomeTitular;

	public Conta(int numeroConta, String nomeTitular) {

		this.numeroConta = numeroConta;
		this.saldo = 0.00;
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void verificarSaldo() {
		System.out.println("Numero da conta: " + this.numeroConta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Nome Titular: " + this.nomeTitular);
		System.out.println("============================");
	}

	public void realizarSaque(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque relizado com sucesso: ");
		} else {
			System.out.println("Saldo Insuficiente: ");
		}
	}

	public void realizarDeposito(double valor) {
		this.saldo += valor;
		System.out.println("Deposito realizado com sucesso: ");
	}
}
