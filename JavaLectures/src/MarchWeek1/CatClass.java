package MarchWeek1;

import java.util.Arrays;

 

public class CatClass {

	
	
	public static int hakan(int a, int b ){
		String kocak="Kocak";
		System.out.println(hakan(3, 7))  ;
		
		return a*b;
		
	}
	
	public static int hakan(int a, int b ,int c){
		System.out.println(hakan(3, 7,6) );
		
		return a-b;
		
	}
	public static int hakan(int a, int b, double d){
		System.out.println(hakan(3, 7,0.4)  );
		
		return (int) (a+b+d);
		
	}
	public static int hakan(int a, int b, int f, int g){
		System.out.println(hakan(3, 7)  );
		
		return a*b;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sonuc " + hakan(5, 6)+hakan(4, 7, 8)+hakan(5, 7, 9, 9));
	 
		
		
		
		
		
// 	int[] nums = {100,234,311,5433,6454,1233,54523,45645,1234,9999,988};
//     int sum = 0;
//     int sumOfEvens = 0;
//    int sumOfOdds = 0;
//             
//   for (int i= 0; i>nums.length ; i++){
//	   System.out.println(nums);
//   }
	}

}
