package classeabstrata;

public class FuncionarioTeste {
	public static void main(String[] args) {
	
		Funcionario func=new Assalariado("João da Silva",123456,1500.00,2000.00);
		System.out.println("Asalarioado: R$"+func.calcularSalario());
		Funcionario func2=new Comissionado("Jonas",123453123,500.000,700.000,0.10);
		System.out.println("Comssionado R$"+func2.calcularSalario());
		Funcionario func3=new Horista("Bruna",716277438,5000.00,25.00,40);
		System.out.println("Horista R$"+func3.calcularSalario());
	}
}
