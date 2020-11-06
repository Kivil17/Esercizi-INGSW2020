package core;

public abstract class OggettiHalloween implements Cloneable{
	
	   private String id;
	   protected String type;
	   
	   public abstract void draw();
	   public abstract int getX();
	   public abstract int getY();
	   
	   @Override
	   public Object clone() throws CloneNotSupportedException {
		   return super.clone();
	   }

	   public String getType() {
		   return type;
	   }

	   public String getId() {
		   return id;
	   }
	   
	   public void setId(String id) {
		   this.id = id;
	   }
}
