package lista06exercicio01;

public class Sessao {
	
	protected String data;
	protected String hora;
	protected int numeroIngressos;
	
	private Sala sala;
	
	private int ingressosVendidos;
	
	
	public Sessao(String data, String hora, Sala sala) {
		this.data = data;
		this.hora = hora;
		this.ingressosVendidos=0;
		this.sala = sala;
		 this.numeroIngressos = this.sala.getCapacidadeMaxima(); 
	}

	

	public void imprimirDados() {
		System.out.println("Data da sessão: "+this.data);
		System.out.println("Horario da sessão "+this.hora);
		System.out.println("Total de ingressos vendidos:"+this.ingressosVendidos);
		System.out.println("Total de ingressos restantes: "+this.numeroIngressos);
		System.out.println("Numero da sala: "+this.sala.getIndentificao());
		System.out.println("Titulo do filme: "+this.sala.getFilme().getTitulo());
		System.out.println("Duração do filme: "+this.sala.getFilme().getDuracao());
	}
	
	public void venderIngresso(int Ingresso) {
		if (this.numeroIngressos >= Ingresso) {
		
			this.numeroIngressos-=Ingresso;
			
			 this.ingressosVendidos+=Ingresso;
			System.out.println("Compra realizada:");
		} else {
			System.out.println("Ingressos esgotados:");
		}
	}
}
