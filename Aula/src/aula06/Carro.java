package aula06;

public class Carro {

			
		String modelo;//passagem de parametro
		String marca;//passagem de parametro
		int ano;//passagem de parametro
		String placa;//passagem de parametro
		String cor;//passagem de parametro
		int velocidade=0;
		boolean ligado=false;
		
		
		public void ligar() {
			if(!ligado) // if (ligado==false)
			{
				ligado=true;
				System.out.println(marca+ "" +modelo+ " est� ligando ");
			}else {
				System.out.println(marca+ "" +modelo+ " j� est� ligado ");
			}
			
		}
		public void desligar() {
			if(ligado) // if ligado(ligado==true)
			{
				ligado=false;
				   	System.out.println(marca+ "" +modelo+ " est� desligando ");
			}else {
				 	System.out.println(marca+ "" +modelo+ " j� est� desligando ");
			}	
				
		
		}
		
		public Carro(String m,String r,int a,String p,String c) {
			modelo=m;
			marca=r;
			ano=a;
			placa=p;
			cor=c;
		}

		public void acelerar() {
			if(ligado) 
			{
				velocidade+=10; //velocidade=velocidade+10
				System.out.println(marca+ "" +modelo+ " est� acelerando Velocidade" +velocidade+ "km/h:");
			
			}else {
				
				System.out.println(marca+ "" +modelo+ " j� est� parado/desligado ");
				
			}
			
			
		
			
			
		}
		public void frear() {
			if(velocidade>0)
			{
			if(ligado)
				velocidade-=10; //velocidade=velocidade-10
				System.out.println(marca+ "" +modelo+ " est� freando Velocidade "+velocidade+ "km/h:");
			
			}
			else {
				System.out.println(marca+ "" +modelo+ "j� est� parado/desligado");
			}	
			
			}
		
			
		
		
	/*	public void imprimirDados() { //m�todo para o usu�rio final
			
			System.out.println("===============");
			System.out.println("Modelo: " + modelo);
			System.out.println("Marca: " + marca);
			System.out.println("Ano de fabrica��o: " + ano);
			System.out.println("Placa: " + placa);
			System.out.println("Cor: " + cor);
			System.out.println("Ligado: " + ligado);
			System.out.println("Velocidade: " + velocidade);
			System.out.println("===============");
		}*/

		@Override
		public String toString() {
			return "classecarroexemplo [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa
					+ ", cor=" + cor + ", ligado=" + ligado + "]";
		}

	}

