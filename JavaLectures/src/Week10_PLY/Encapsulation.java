package Week10_PLY;

public class Encapsulation {
	 
		
		private String name;
		private String IdNum;
		private  int age;
		public void info(){
			

			 System.out.println("Name : " +  getName()+ "\nId Number "	+  getIdNum()
			 +"\nAge : " +  getAge());
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getIdNum() {
			return IdNum;
		}
		public void setIdNum(String idNum) {
			IdNum = idNum;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
	}


