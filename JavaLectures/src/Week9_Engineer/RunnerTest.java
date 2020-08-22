package Week9_Engineer;

public class RunnerTest {

	public static void main(String[] args) {
	 
		MecanicalEngineer me = new MecanicalEngineer(true, false);
		String [] workexperince ={"hakan ", "elan ", "Bob","Chase"};
		
		me.backGroundCkeck();
		me.GPA(3.40);
		me.experience(workexperince); 
		me.work();
 
		}

}
