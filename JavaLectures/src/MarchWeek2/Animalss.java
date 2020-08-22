package MarchWeek2;

public class Animalss {
	
	
	
	 private String name;
	 
	 private int age;

	 
	 
	public Animalss(String name, int age) {
	 
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animalss  animals = new Animalss ("Poppi ", 5); 
		animals.setName("Poppi");
		System.out.println("my dog name is  is : " + animals.getName());
	
		animals.setAge(5);
		System.out.println("my dog age is : " + animals.getAge());
		
	}

}
