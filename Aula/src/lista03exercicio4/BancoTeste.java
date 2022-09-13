package lista03exercicio4;

public class BancoTeste {
 public static void main(String[]args) {
	 Banco banco1=new Banco(75594,23458);
	 
	 banco1.saldom();
	 banco1.depositar(300.00);
	 banco1.depositar(300.00);
	 banco1.saldom();
	 banco1.sacar(900.00);
	 banco1.saldom();
	 
	 System.out.println(banco1);
 
 }
}
