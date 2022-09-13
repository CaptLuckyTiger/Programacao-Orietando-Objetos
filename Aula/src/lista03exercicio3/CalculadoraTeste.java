package lista03exercicio3;

public class CalculadoraTeste {
 public static void main(String[]args) {
	Calculadora calculadora1=new Calculadora("HP","Karspey","Cientifica",2048);
	
	calculadora1.calcularSoma(10, 5);
	calculadora1.calcularSubtracao(10, 5);
	calculadora1.calcularMultiplicacao(10, 5);
	calculadora1.calcularDivisao(10, 5);
	
	System.out.println(calculadora1);
 }
}