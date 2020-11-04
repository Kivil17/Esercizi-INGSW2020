package core;

public class BMW extends AutomobiliDaMario{


	private int prezzo;
	private int porte;
	private String tipo;
	
	public BMW(int prezzo,  int porte, String tipo) {
		super();
		this.prezzo = prezzo;
		this.porte = porte;
		this.tipo= tipo;
	}
	
	@Override
	public void caratteristiche() {
		System.out.println("BMW:");
		System.out.println("Prezzo: "+prezzo);
		System.out.println("Numero Porte: "+porte);
		System.out.println("Tipo:"+tipo);
		
		System.out.println();
		
	}

	@Override
	public String toString() {
		return "complimenti hai scelto BMW [prezzo=" + prezzo + ", porte=" + porte + ", tipo=" + tipo + "]";
	}


}
