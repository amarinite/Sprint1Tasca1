package n1exercici2;

public class Car {
	private static final String BRAND = "Toyota";
	private static String model;
	// L'atribut POWER, en no ser static, es replicarà a cada instància
	private final int POWER = 3000;
		
	public Car() {
		// Els atributs final no es poden inicialitzar al constructor, pero els static sí
		// En ser static, l'atribut no està guardat en cada instància sinó en la classe, per aixó accedim a model amb Car i no amb this
		Car.model = "Prius";
	}
	
	public static void brake() {
		System.out.println("The car is braking");
		// System.out.println(this.POWER); <- També cal dir que els atributs no estàtics no es poden fer servir dins de mètodes estàtics
	}
	
	public void accelerate() {
		System.out.println("The car is accelerating");
		// System.out.println(Car.BRAND); <- Aquí no hi hauria problema en fer servir atributs estàtics
	}
}
