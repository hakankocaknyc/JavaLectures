package Week9_Engineer;

public class MecanicalEngineer implements IEngineer,IWorking {

	private boolean reference;
	private boolean bakcGroundCheck;
	
	public MecanicalEngineer(boolean reference,boolean bakcGroundCheck ){
		super();
		this.reference =reference;
		this.bakcGroundCheck=bakcGroundCheck;
		
	}

	@Override
	public void work() {
		 
		System.out.println("mecanical engineer is working ...");
		
	}

	@Override
	public void references() {
		if(reference){
			
			System.out.println(" His reference is received");
		} else {
			System.out.println("His reference is not received");
		}
		 
		
	}

	@Override
	public void backGroundCkeck() {
		 
		if(bakcGroundCheck){
			
			System.out.println(" He has a criminal record");
		}else{
			System.out.println(" He does not have any criminal background");
		}
		
	}

	@Override
	public String GPA(double gpa) {
		 
		return "GPA score is" + gpa;
	}

	@Override
	public void experience(String[] array) {
		 if(array.length== 0){
			 System.out.println(" Candidate does not have any experince ");
		 }else {
			 System.out.println("As a mechanical engineer I worked those companies....");
		 } for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
