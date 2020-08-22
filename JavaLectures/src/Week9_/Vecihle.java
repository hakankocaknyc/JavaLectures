package Week9_;

 

public interface Vecihle {
public void showSpeed();
}
class Car implements Vecihle{

	@Override
	public void showSpeed() {
		 System.out.println("Speed implementation");
		
	}}
 class Audi extends Car{
	 
	 public long Max_SPEED = 250;
	 public void showSpeed(){
		 System.out.println("Speed implementation");
	 }
	 
	  
 }