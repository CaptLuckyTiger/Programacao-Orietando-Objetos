package lista02exercicio4;

public class BibliotecaTeste {
	public static void main(String[]args) {
		
		Biblioteca livro1=new Biblioteca();
		//Biblioteca livr2=new Biblioteca();
		
		
		
		
		
	 livro1.titulo="Arkyn";
	 livro1.autor="SimonRon";
	 livro1.editora="Crystalina";
	 livro1.ano_public=2019;
	 livro1.PAG=229;
	
	
	livro1.emprestimo();
	livro1.emprestimo();
	livro1.devolucao();
	livro1.devolucao();
	livro1.impressaoDados();
	
	
	}
	
}
