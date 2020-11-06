package core;

public class MyZombie extends OggettiHalloween{

	private Zombie zombie= new Zombie();
	
	public MyZombie(){
	     type = "Zombie";
	   }
	
	@Override
	public Object clone() throws CloneNotSupportedException{
	    MyZombie myZombie = (MyZombie) super.clone();
	    myZombie.zombie = (Zombie) myZombie.zombie;
	    return myZombie;
	}
	
	@Override
	public void draw() {
		System.out.println("Piazzo lo zombie");
		
	}
	@Override
	public int getX() {
		return zombie.getPosx();
	}
	@Override
	public int getY() {
		return zombie.getPosy();
	}
}
