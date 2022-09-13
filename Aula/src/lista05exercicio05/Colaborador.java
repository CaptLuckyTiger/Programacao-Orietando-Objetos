package lista05exercicio05;

public class Colaborador {
  protected  String nome;
  protected  String endereco;
  protected String dataInicio;

 public Colaborador(String nome, String endereco, String dataInicio) {

	this.nome = nome;
	this.endereco = endereco;
	this.dataInicio = dataInicio;
}
 
 	public void imprimirDados() {
 		System.out.println("Nome:"+this.nome);
 		System.out.println("Endereco:"+this.endereco);
 		System.out.println("Data de Inicio:"+this.dataInicio);
 	}
}
