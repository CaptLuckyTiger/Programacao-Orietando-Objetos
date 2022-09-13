package lista04exercicio03;

public class Banco {
	private int numeroConta;
	private Titular titular;
	private double saldo=0;

	public Banco(int numeroConta, Titular titular, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.titular=titular;
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

		public void emitirRelatorio() {
			System.out.println("Numero da conta:"+this.numeroConta);
			System.out.println("Salado"+this.saldo);
			System.out.println("=============");
			System.out.println("Titular");
			System.out.println("Nome:"+this.titular.getNome());
			System.out.println("Sexo:"+this.titular.getSexo());
			System.out.println("CPF:"+this.titular.getCpf());
			System.out.println("RG:"+this.titular.getRg());
			System.out.println("Renda Mensal:"+this.titular.getRendaMensal());
			System.out.println("=============");
			System.out.println("Endereco");
			System.out.println("Logadouro:"+this.getTitular().getEndereco().getLogadouro());
			System.out.println("Bairro:"+this.getTitular().getEndereco().getBairro());
			System.out.println("Cidade:"+this.getTitular().getEndereco().getCidade());
			System.out.println("Numero da casa::"+this.getTitular().getEndereco().getNumero());
			System.out.println("Unidade Federativa:"+this.getTitular().getEndereco().getUnidadeFederativa());
			
			
		}

		public Titular getTitular() {
			return titular;
		}
	


	
}
