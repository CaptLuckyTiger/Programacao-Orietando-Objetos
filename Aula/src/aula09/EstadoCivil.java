package aula09;

public enum EstadoCivil {

	SOLTEIRO("Solteiro(a)"),
	CASADO("Casado(a)"),
	DIVORCIADO("Divorciado(a)"),
	VIUVO("Vi�vo(a)");
	
	private String estado;
	
	private EstadoCivil(String estado) {
		
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}
}	
