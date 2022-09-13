package aula07;

public class Conta {
	private int numeroConta;
	private String titular;
	private double saldo;

	public Conta(int numeroConta, String titular) { 
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0.00;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		this.calcularRendimento();
	}

	public void sacar(double valor) {
		if (this.saldo >= valor) {

			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso:");
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	public void imprimirSaldo() {
		System.out.println("Numero da conta:" + this.numeroConta);
		System.out.println("Titular:" + this.titular);
		System.out.println("Saldo:" + this.saldo);
	}

	private void calcularRendimento() {
		double rendimento = this.saldo * 0.10;
		this.saldo += rendimento;
	}

	public void setTitular(String titular) {
		this.titular = titular;

	}

	public String getTitular() {
		return this.titular;
	}

}
