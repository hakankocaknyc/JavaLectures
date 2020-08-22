package MarchWeek3;

public class Block {

	public static void main(String[] args) {
		Child object = new  Child();

	}

}
	class GrandParent{
	// fields - methods
	// Anonymous blocks
	
	{ 
		System.out.println("GrandParent Class");
	}
	}
	class Parent extends GrandParent{
		
	{System.out.println(" Parent Class");}
	}
	
	class Child extends Parent{
		
		{System.out.println("Child Class");}
		}