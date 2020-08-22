package Week10_PLY_Plant;

public class Plant {
	public void grow(){
		
		System.out.println(" Plant Growing");
	}
	
}

	class Tree extends Plant{
		public void grow(){
		System.out.println("Tree growing");
		
	}
		public void shedLeaves(){
			System.out.println("Leavesshedding.");
		}
		public static void doGrow(Plant plant){
			 
		}
	}

	
	

