package aula161;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private int cnpj;
	private String nomeBanco;
	private List<Conta> contas;

	public Banco(int cnpj, String nomeBanco) {

		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contas = new ArrayList<Conta>();

	}

	public void criarNovasContas(int numeroConta, String nomeTitular) {
		Conta conta = new Conta(numeroConta, nomeTitular);
		this.contas.add(conta);
		System.out.println("Conta " + numeroConta + "criada com sucesso");
	}

	public void verificarSaldo(int numeroConta) {
		boolean verificacao = false;
		for (Conta conta : contas) {

			if (conta.getNumeroConta() == numeroConta) {

				conta.verificarSaldo();
				verificacao = true;
			}
		}
		if (verificacao == false) {
			System.out.println("Conta inexiste");
		}

	}

	public void realizarSaque(int numeroConta, double valor) {
		boolean verificacao = false;
		for (Conta conta : contas) {

			if (conta.getNumeroConta() == numeroConta) {

				conta.realizarSaque(valor);
				verificacao = true;

			}
		}
		if (verificacao == false) {
			System.out.println("Conta inexistente");
		}
	}

	public void realizarDeposito(int numeroConta, double valor) {
		boolean verificacao = false;
		for (Conta conta : contas) {
			if (conta.getNumeroConta() == numeroConta) {
				conta.realizarDeposito(valor);
				verificacao = true;
			}
		}
		if (verificacao == false) {
			System.out.println("Conta inexistente: ");
		}
	}

}
