package MarchWeek2;

public class Class2 {
	
	int x;
	String y;
	 public Class2(){
		 System.out.println(" you used non parameter constructer to create your object");
	 }
//	 public Class2 (int xInt, String yString){
//		 
//		  this. x =xInt;
//		  this. y =yString;
//		  
//		  System.out.println(" you used the 2 parameter constructer to create your object");
// 
//	
//	 }
	
	public Class2(int x, String y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println(" you used the 2 parameter constructer to create your object");
	}
	public static void main(String[] args) {
		
		Class1 object1 = new Class1(3,"StringValue");
		Class2 object2 = new Class2(9, " Anothor String");
		Class2 object3 = new Class2();
		object3.x =5;
		object3.  y ="java";
}}
