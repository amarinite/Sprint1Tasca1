package n2exercici1;

public class Smartphone extends Telephone implements Camera, Clock {
	
	public Smartphone(String brand, String model) {
		super(brand, model);
	}

	@Override
	public void takePicture() {
		System.out.println("Taking picture...");
	}

	@Override
	public void alarm() {
		System.out.println("Ringing alarm...");
	}
	
}
