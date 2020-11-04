package core;

public class BMWFactory extends AbstractFactory{

	@Override
	public AutomobiliDaMario create(int prezzo, int porte, String tipo) {
		return new BMW(prezzo, porte, tipo);
	}

	BMWFactory(){super();}
}
