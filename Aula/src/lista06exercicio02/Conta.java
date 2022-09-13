package lista06exercicio02;

public class Conta extends Cliente {

	private PratoEntrada pratoEntrada;
	private PratoPrincipal pratoPrincipal;
	private PratoSobremesa pratoSobremesa;
	private double calculoTotal;

	private double valorTotal, valorTotal2, valorTotal3;

	public Conta(String nome, long cpf, PratoEntrada pratoEntrada, PratoPrincipal pratoPrincipal,
			PratoSobremesa pratoSobremesa) {
		super(nome, cpf);

		this.pratoPrincipal = null;
		this.pratoEntrada = null;
		this.pratoSobremesa = null;
		this.valorTotal = this.valorTotal2 = this.valorTotal3 = 0;
		this.calculoTotal = 0;

	}

	public void entrada(int a) {
		if (a <= 1) {
			PratoEntrada prato1 = new PratoEntrada("Queijadinho", "687120", "Queijo", 12.55);

			this.valorTotal = prato1.getprato() * 0.1 + prato1.getprato();
			
			//System.out.println("Nome do prato: " + prato1.getNome());
			//System.out.println("Numero do prato: " + prato1.getNumero());
			//System.out.println("Ingredientes do prato: " + prato1.getIngredientes());
			//System.out.printf("O valor do prato � R$: %.2f", valorTotal);
		} else {
			System.out.println("Numero de pedidos execidos um por cliente:");
		}
	}

	public void principal(int b) {
		if (b <= 1) {
			PratoPrincipal prato2 = new PratoPrincipal("Acaraj�", "99012", "Carne,Lim�o,Batatas", 25.12);

			this.valorTotal2 = prato2.getprato() * 0.1 + prato2.getprato();

			//System.out.println("Nome do prato: " + prato2.getNome());
			//System.out.println("Numero do prato: " + prato2.getNumero());
			//System.out.println("Ingredientes do prato: " + prato2.getIngredientes());
			//System.out.println("O valor do prato � R$: " + this.valorTotal2);

		} else {
			System.out.println("Numero de pedidos execidos um por cliente:");
		}

	}

	public void sobremesa(int c) {
		if (c <= 1) {
			PratoSobremesa prato3 = new PratoSobremesa("Sorvete de Chocolate", "877901", "Chocolate", 13.50);
			this.valorTotal3 = prato3.getprato() * 0.1 + prato3.getprato();

			//System.out.println("Nome do prato: " + prato3.getNome());
			//System.out.println("Numero do prato: " + prato3.getNumero());
			//System.out.println("Ingredientes do prato: " + prato3.getIngredientes());
			
			System.out.println("O valor do prato � R$: " + this.valorTotal3);
		} else {
			System.out.println("Numero de pedidos execidos um por cliente: ");
		}

	}

	public void fecharConta() {

		if (valorTotal !=0) {
			
			PratoEntrada prato1 = new PratoEntrada("Queijadinho", "687120", "Queijo", 12.55);
				
			System.out.println(" prato consumido: " + prato1.getNome());
			
			System.out.println("Valor do prato: " + prato1.getprato());

			this.calculoTotal = this.valorTotal;


		}

		if (valorTotal2 !=0) {
			
			PratoPrincipal prato2 = new PratoPrincipal("Acaraj�", "99012", "Carne,Lim�o,Batatas", 25.12);

			System.out.println(" prato consumido: " + prato2.getNome());

			System.out.println("Valor do prato: " + prato2.getprato());

			this.calculoTotal += this.valorTotal2;
		}

		if (valorTotal3!= 0)

		{		
			
			PratoSobremesa prato3 = new PratoSobremesa("Sorvete de Chocolate", "877901", "Chocolate", 13.50);
			
			System.out.println(" prato consumido: " + prato3.getNome());

			System.out.println("Valor do prato: " + prato3.getprato());
			this.calculoTotal+=this.valorTotal3;
	
		}
		
		System.out.println("O valor total total do pedido �: "+this.calculoTotal);
		
		
	}

}
