package n1exercici1;

public class Strings extends Instrument {
	
	public Strings(String name, float price) {
		super(name, price);
		
	}

	@Override
	public void play() {
		 System.out.println("Sona un instrument de corda");
	}
}
