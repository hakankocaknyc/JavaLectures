package MarchWeek2_0;

import java.util.ArrayList;

public class staticBlocks {

	static ArrayList<String>list = new ArrayList<String>();
	
	
	static {
		
		
		System.out.println("Hello World");
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
	}
	static{
		// if a class has static members that require complex initialization
		
		System.out.println("Hello from static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(list);
	}

}
