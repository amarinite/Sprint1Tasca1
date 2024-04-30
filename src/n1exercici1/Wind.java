package n1exercici1;

public class Wind extends Instrument {

	public Wind(String name, float price) {
		super(name, price);
		
	}

	@Override
	public void play() {
		 System.out.println("Sona un instrument de vent");
	}

}
