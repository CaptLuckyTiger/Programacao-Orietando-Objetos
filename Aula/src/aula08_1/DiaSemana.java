package aula08_1;

public enum DiaSemana {

	DOMINGO(1, "domingo"),
	SEGUNDA(2, "segunda-feira"),
	TERCA(3, "ter�a-feira"),
	QUARTA(4, "quarta-feira"),
	QUINTA(5, "quinta-feira"),
	SEXTA(6, "sexta-feira"),
	SABADO(7, "s�bado");
	
	private int dia;
	private String diaExtenso;
	
	private DiaSemana(int dia, String diaExtenso) {
		
		this.dia = dia;
		this.diaExtenso = diaExtenso;
	}

	public int getDia() {
		return dia;
	}

	public String getDiaExtenso() {
		return diaExtenso;
	}
}
