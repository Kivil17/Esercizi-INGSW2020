
public class MercedesFactory extends AbstractFactory {

	@Override
	public AutomobiliDaMario create(int prezzo, int porte, String tipo) {
		return new Mercedes(prezzo, porte, tipo);
	}

}
