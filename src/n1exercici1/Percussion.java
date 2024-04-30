package n1exercici1;

public class Percussion extends Instrument {
	
	public Percussion(String name, float price) {
		super(name, price);
		
	}

	@Override
	public void play() {
		 System.out.println("Sona un instrument de percussio");
	}
	
}
