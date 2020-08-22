package MarchWeek2;

public class Employee {

	public static void main(String[] args) {
		 
		EmployeeTest ahmet =new  EmployeeTest("ttt", 30,1000,50);
		
		EmployeeTest james = new EmployeeTest("James Bond", 50);
		
		james.salary =1000;
		james.workHours= 30;
		ahmet.work();
		System.out.println(ahmet.salary);
		ahmet.absence();
		System.out.println(ahmet.salary);
		
		james.work();
		james.absence();
		james.absence();
		System.out.println(james.salary);
		
	}

}
