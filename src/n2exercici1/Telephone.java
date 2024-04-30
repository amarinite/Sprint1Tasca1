package n2exercici1;

public class Telephone {
	private String brand;
	private String model;
	
	public Telephone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public void ring(String phoneNumber) {
		System.out.println("Ringing " + phoneNumber + "...");
	};

}
