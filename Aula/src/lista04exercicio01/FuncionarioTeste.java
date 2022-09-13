package lista04exercicio01;

public class FuncionarioTeste {
	public static void main(String[]args) {
			Funcionario funcionario1=new Funcionario(981938,"Jose","09/11/2000","Masculino","Setor A",997733,"Rua Alberto Feno",976,"Wesker","Ponta Grossa","PR");
			
			funcionario1.getEndereco().setCidade("Curitiba");
			funcionario1.getEndereco().setNumero(910);
			funcionario1.emitirRelatorio();
			
			Endereco endereco2=new Endereco(" Alpinos",272,"Karma","Longinquia","US");
			Funcionario funcionario2=new Funcionario(898213,"Joana","09/08/1983","Femeino","Terciario",98123211,endereco2);
			
			System.out.println("==============================");
			funcionario2.emitirRelatorio();
	}
}
