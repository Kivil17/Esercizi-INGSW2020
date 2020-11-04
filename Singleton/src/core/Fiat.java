package core;
import java.awt.image.BufferedImage;

public class Fiat extends AutomobiliDaMario{

	@Override
	public String toString() {
		return "complimenti hai scelto Fiat [prezzo=" + prezzo + ", porte=" + porte + ", tipo=" + tipo + "]";
	}

	private int prezzo;
	private int porte;
	private String tipo;
	
	public Fiat(int prezzo,  int porte, String tipo) {
		super();
		this.prezzo = prezzo;
		this.porte = porte;
		this.tipo= tipo;
	}
	
	@Override
	public void caratteristiche() {
		System.out.println("fiat:");
		System.out.println("Prezzo: "+prezzo);
		System.out.println("Numero Porte: "+porte);
		System.out.println("Tipo:"+tipo);
		
		System.out.println();
		
	}


	
	
}
