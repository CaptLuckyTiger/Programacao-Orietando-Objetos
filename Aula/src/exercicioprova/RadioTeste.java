package exercicioprova;

public class RadioTeste {
public static void main(String[]args) {
	Radio radio=new Radio("Philps","Samsung",140);
	int i;
	radio.ligar();
	for(i=0; i<10; i++) {
		radio.aumentarVolume();
	}
	for(i=0; i<10; i++) {
		radio.diminuirVolume();
	}
	for(i=0; i<200; i++) {
		radio.aumentarEstacao();
	}
	
 System.out.println(radio);
}
 
}
