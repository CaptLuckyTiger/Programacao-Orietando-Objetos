package lista02exercicio2;

public class RegistroPessoas {

	String nome;
	String sexo;
	double cpf;
	int idade;
	double altura;
	double peso;

	public void andar() {
		System.out.println(
				nome + " " + sexo + " " + cpf + " " + idade + " " + altura + " " + peso + " " + " está andando \n ");
	}

	public void correr() {
		System.out.println(
				nome + " " + sexo + " " + cpf + " " + idade + " " + altura + " " + peso + " " + " está correndo \n ");
	}

	public void falar() {
		System.out.println(
				nome + " " + sexo + " " + cpf + " " + idade + " " + altura + " " + peso + " " + " está falando \n ");
	}

	public void dormir() {
		System.out.println(
				nome + " " + sexo + " " + cpf + " " + idade + " " + altura + " " + peso + " " + " está dormindo \n ");
	}

	public void imprimirDados() {

		System.out.println("===============");
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("CPF: " + cpf);
		System.out.println("Idade: " + idade);
		System.out.println("Altura" + altura);
		System.out.println("Peso" + peso);
		System.out.println("===============");

	}

}
