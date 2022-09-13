package lista04exercicio05;

public class Ingressos {
	private String nomeEvento;
	private String dataEvento;
	private int faixaEtariaEvento;
	private int numeroIngressos;
	Artista artista;

	public Ingressos(String nomeEvento, String dataEvento , int faixaEtariaEvento,
			Artista artista) {
		this.nomeEvento = nomeEvento;
		this.dataEvento = dataEvento;
		this.faixaEtariaEvento = faixaEtariaEvento;
		this.artista = artista;
	}
	
	public void venderIngressos(int ingressos) {
			 this.numeroIngressos=this.artista.getLocal().getCapacidadeMaxima();
			if(this.numeroIngressos>=ingressos) {
				this.numeroIngressos-=ingressos;
					System.out.println("Compra realizada:");
			}
			else {
					System.out.println("Ingresso esgotados:");
				
			}
	}
	 public void emitirRelatorio() {
		 System.out.println("Nome do evento:"+this.nomeEvento);
		 System.out.println("Data do evento:"+this.dataEvento);
		 System.out.println("Local do evento:");
		 System.out.println("Nome do evento:"+this.artista.getLocal().getNomeLocal());
		 System.out.println("Capacidade maxima:"+this.artista.getLocal().getCapacidadeMaxima());
		 System.out.println("Faixa Etaria:"+this.faixaEtariaEvento);
		 System.out.println("============================================");
		 System.out.println("Artista:");
		 System.out.println("Nome do artista:"+this.artista.getNome());
		 System.out.println("Nacionalidade:"+this.artista.getNacionalidade());
		 System.out.println("Bibiografia:"+this.artista.getBibiografia());
		 System.out.println("=================================");
		 System.out.println("Endereco:");
		 System.out.println("Logadouro:"+this.artista.getLocal().getEndereco().getLogadouro());
		 System.out.println("Numero:"+this.artista.getLocal().getEndereco().getNumero());
		 System.out.println("Bairro:"+this.artista.getLocal().getEndereco().getBairro());
		 System.out.println("Cidade:"+this.artista.getLocal().getEndereco().getCidade());
		 System.out.println("Estado:"+this.artista.getLocal().getEndereco().getEstado());
	 }
}
