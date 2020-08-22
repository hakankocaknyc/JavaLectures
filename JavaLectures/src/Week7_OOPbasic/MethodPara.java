package Week7_OOPbasic;

public class MethodPara {

	
	// void with parameterized
	
	public void add(int num1,int num2){
		
		int sum= num1+num2;
		
		System.out.println("Sum of values :" + sum);
		
	}
	
	// Non- void with parameterized 
	public int multiply(int num1, int num2){
		int multiplyNum=  num1* num2;
		
		return multiplyNum;
	}
	
	public String fullNAme(String firsName, String lastName){
		
		return " Your mane is : "+ (firsName + "" + lastName );
	}
	
	public static void main(String[] args) {
		 
		
		
		MethodPara obj = new MethodPara();
		obj.add(5, 2);
		System.out.println("Multiply  ; " + obj.multiply(3, 5));
		
//		System.out.println(obj.fullNAme(HAkan , lastName));
	}

}
