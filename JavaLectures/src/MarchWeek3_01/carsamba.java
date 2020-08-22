package MarchWeek3_01;

public class carsamba {

		
		public static void main(String[] args) {
	        c obje = new c();
	        a obje2 = new c();
	        obje2.print();
	        
	    }
	}
	class a{
	     int age;
	     String name;
	     void print(){
	         System.out.println("This is parent class");
	     }
	}
	class b extends a{
	     int height;
	}
	class c extends b{
	    String lastname;
	    void print(){
	         System.out.println("This is child class");
	     }
	}
