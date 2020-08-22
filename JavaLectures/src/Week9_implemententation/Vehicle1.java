package Week9_implemententation;

  public interface Vehicle1 { // parent interface
	public void hasWheels();
	public void hasEngine();
	

}
 interface Car extends Vehicle1{ //Child interface
	  public void hasDoor(int a);
	  public void hasAirbags();
	  public void hasRoof();
	
}
   interface Motorcycle extends Vehicle1{
	   
	   public void hasPedal();
	   public void HasHandlebars();
	   public void hasStand();
   }
    
