package exercicio_aula07;

public class RelogioTeste {
	public static void main(String[]args) {
     Relogio relogio1=new Relogio("Oriente",23,10);
     
  
     relogio1.setHora(25);
     relogio1.setMinutos(33);
     
     System.out.println(relogio1.getMarca());
     System.out.println(relogio1.getHora());
     System.out.println(relogio1.getMinutos());
     }
}
