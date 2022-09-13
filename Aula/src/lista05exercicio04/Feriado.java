package lista05exercicio04;

public class Feriado extends Data {
		private String descricao;

		
		public Feriado() {
			super();
			this.descricao = "Feriado";
		}


		public Feriado( String descricao) {
			super();
			this.descricao = descricao;
		}


		public Feriado(int dia, int mes, int ano, String descricao) {
			super(dia, mes, ano);
			this.descricao = descricao;
		}


		@Override
		public String toString() {
			return "Feriado [descricao=" + descricao + ", toString()=" + super.toString() + "]";
		}


		

	
		
}
