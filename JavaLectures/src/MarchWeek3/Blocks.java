package MarchWeek3;
/*
 here we will learn to see how the different part(Anonymous Block,Static Block and Constructor)
 of class and what would be the order of execution
 */
public class Blocks {
	
	//Anonymous Block
	{
		System.out.println("  Anonymous Block ");
	}
	
	static{
		System.out.println("Static Block");
	}
	
	public Blocks(){
		System.out.println("Counstructor  ");
	}
	
	

	public static void main(String[] args) {
		
		Blocks object = new Blocks();
		 
	}

}
