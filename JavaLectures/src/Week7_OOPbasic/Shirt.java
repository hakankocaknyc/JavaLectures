package Week7_OOPbasic;

public class Shirt {
	
	private String color;
	private char size;
	 
	public Shirt() {
		 System.out.println("consst");
	}
	public Shirt(String color,char size ){
		
	}
 public static void putOn(){
	 
	 System.out.println("shirt is on");
 }
 
public static void putOff(){
	 
	 System.out.println("shirt is off");
 }
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public char getSize() {
	return size;
}
public void setSize(char size) {
	this.size = size;
}
}
