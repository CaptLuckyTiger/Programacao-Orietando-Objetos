package lista06exercicio03;

public class UTFPRTESTE {
	public static void main(String[] args) {
		Disciplina disciplina1 = new Disciplina(77230, "Quimica", "Labarotorio:1,Laboratorio:2,Quimica Aplicada:1", 60);
		Professores professor = new Professores(disciplina1, 98912352, "Jose Alencar", "Mestre", "09/12/2020", 5500.00,
				1500.00);
		professor.calcularSalario();
		professor.emitirRelatorio();
		System.out.println("=========================================================");
		Processo processo1=new Processo(871293092,"15/10/1999","Atualicação professional monitorada");
		TecnicosAdminstrativos tecnico=new TecnicosAdminstrativos(processo1,98192839,"Fernanda","11/11/2011",2500.00,350.00);
		tecnico.salarioTecnico();
		tecnico.emitirRelatiorio();
	}
}
