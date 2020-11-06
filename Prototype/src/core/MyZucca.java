package core;

public class MyZucca extends OggettiHalloween{

	private Zucca zucca= new Zucca();
	
	public MyZucca(){
	     type = "Zucca";
	   }
	
	@Override
	public Object clone() throws CloneNotSupportedException{
	    MyZucca myZucca = (MyZucca) super.clone();
	    myZucca.zucca = (Zucca) myZucca.zucca;
	    return myZucca;
	}
	
	@Override
	public void draw() {
		System.out.println("Piazzo la zucca");
		
	}
	@Override
	public int getX() {
		return zucca.getPosx();
	}
	@Override
	public int getY() {
		return zucca.getPosy();
	}
}
