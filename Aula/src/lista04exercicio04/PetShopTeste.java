package lista04exercicio04;

public class PetShopTeste {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Bento Borges", 985, "Joeville", "Aberto Matos", "PR");
		Dono dono1 = new Dono("7723010-001", "Martines", "@martines.com", 9945001, endereco1);
		Animal animal1 = new Animal("Astolfinho", 3, "macho", dono1);

		PetShop petshop1 = new PetShop(animal1);

		petshop1.tratamento("banho", "3:59");
		petshop1.emitirDados();
	}
}
