package lista06exercicio03;

public class Disciplina {
	
	private int codigo;
	private String disciplinaNome;
	private String ementa;
	private int cargaHoraria;

	public Disciplina(int codigo, String disciplinaNome, String ementa, int cargaHoraria) {
		this.codigo = codigo;
		this.disciplinaNome = disciplinaNome;
		this.ementa = ementa;
		this.cargaHoraria = cargaHoraria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDisciplinaNome() {
		return disciplinaNome;
	}

	public void setDisciplinaNome(String disciplinaNome) {
		this.disciplinaNome = disciplinaNome;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
