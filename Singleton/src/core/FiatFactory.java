package core;

public class FiatFactory extends AbstractFactory {

	@Override
	public AutomobiliDaMario create(int prezzo, int porte, String tipo) {
		return new Fiat(prezzo, porte, tipo);
	}

	FiatFactory(){super();}
}
