package lista06exercicio031;

public class UTFPRTESTES {
	public static void main(String[] args) {
		Disciplina disciplina1 = new Disciplina(77230, "Quimica", "Labarotorio:1,Laboratorio:2,Quimica Aplicada:1", 60);
		Professor professor = new Professor(98912352, "Jose Alencar","09/12/2020" ,5500.00 ,disciplina1, "Mestre",1500.00);
		professor.calcularSalario();
		professor.emitirRelatorio();
		System.out.println("=========================================================");
		Processos processo1=new Processos(871293092,"15/10/1999","Atualicação professional monitorada");
		TecnicoAdminstrativo tecnico=new TecnicoAdminstrativo(processo1,98192839,"Fernanda","11/11/2011",2500.00,350.00);
		tecnico.salarioTecnico();
		tecnico.emitirRelatorio();
	}
}
