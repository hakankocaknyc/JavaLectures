package Week8_base;

public class ShapeMain {

	
	public static void main(String[] args) {
	
		
		Square sObj = new Square(6, 6);
		Rectangle rObj = new Rectangle(10, 5);
		 Circle cobj = new Circle(4);
		
		 System.out.println("Square area is : " +sObj.area());
		 System.out.println("Rectangle area is " + rObj.area());
		 System.out.println("Circle area is " + cobj.area());
 
		 
}
}
