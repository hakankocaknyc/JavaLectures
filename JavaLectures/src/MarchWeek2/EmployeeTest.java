package MarchWeek2;

public class EmployeeTest {

	 // Fields - Attributes -Global Variable - instance varible
	
  String name;
  int age;
  double salary;
  int workHours;
public EmployeeTest(String name, int age, double salary, int workHours) {
	 
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.workHours = workHours;
}
public EmployeeTest(String name, int age) {
	 
	this.name = name;
	this.age = age;
}

void work(){
	salary =salary + 1000;
	workHours++;
}
void absence(){
	 salary = salary -50;
}
}
