package Week9_implemententation;

public interface Moveable {
	int AVG_SPEED =60;
	void move();
	

}
class Vehicle implements Moveable{
	 
	@Override
	public void move() {
		 System.out.println("Average speed is: " + AVG_SPEED);
		
		 
	
	} 
}
