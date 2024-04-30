package n1exercici1;

public abstract class Instrument {
	private String name;
	private double price;
	
	protected Instrument(String name, float price) {
		this.name = name;
		this.price = price;
	}
	
    {
        System.out.println("Aquest bloc d'inicialitzacio s'executa despres de cridar el constructor de la classe Instrument i abans d'executar els metodes");
    }
    
    static {
    	 System.out.println("Aquest bloc estatic s'executa quan es carrega la classe, no quan es crea una instancia");
    }
	
	public abstract void play();

}
