package core;

public class MyStrega extends OggettiHalloween{

	private Strega strega= new Strega();
	
	public MyStrega(){
	     type = "Strega";
	   }
	
	@Override
	public Object clone() throws CloneNotSupportedException{
	    MyStrega myStrega = (MyStrega) super.clone();
	    myStrega.strega = (Strega) myStrega.strega;
	    return myStrega;
	}
	
	@Override
	public void draw() {
		System.out.println("Piazzo la strega");
		
	}
	
	@Override
	public int getX() {
		return strega.getPosx();
	}
	
	@Override
	public int getY() {
		return strega.getPosy();
	}
	
}