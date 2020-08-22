package Week9_;

 
interface Walk{
	default	void move(){
			System.out.println();
		}
	}
	
	interface  Run{
		 default void move1 (){
	}}
	public class Tester1  implements Walk,Run{
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			
			Walk obj=new Tester1();
			obj.move();
		}

		@Override
		public void move() {
			System.out.println(" Move quickly");
			 
		}
	
	}
