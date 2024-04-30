package n1exercici2;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		// La diferència per invocar mètodes és que per a mètodes estàtics hem d'utilitzar la Classe
		Car.brake();
		
		// En canvi, per a mètodes no esàtics fem servir la instància	
		car1.accelerate();

		
	}

}
