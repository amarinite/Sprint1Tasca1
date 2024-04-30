package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind trumpet = new Wind("saxofon", 195.50f);
		Percussion bongos = new Percussion("bongos", 55.0f);
		Strings violin = new Strings("violin", 148.90f);
		
		trumpet.play();
		bongos.play();
		violin.play();
	}

}
