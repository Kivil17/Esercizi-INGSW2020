package core;

public abstract class AbstractFactory {

	private static String className= "core.MercedesFactory";
	
	public static void init(String cn)
	{
		if(instance!=null)
			throw new RuntimeException("è stata gia inizializzata");
		
		className=cn;
	}
	
	private static AbstractFactory instance=null;
	
	public static AbstractFactory getInstance() {
		if(instance==null)
			try {
				instance= (AbstractFactory) Class.forName(className).newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return instance;
		
	}
	
	AbstractFactory(){}
	
	abstract public AutomobiliDaMario create(int prezzo,  int porte, String tipo);
}
