package Week10_PLY_Poliymorphism;

abstract class A {
public static void main(String[] args) {
		
		G c = new G();
		
		c.methodOne(); 
		c.methodTwo(); 
		
//		System.out.println(c.i); //112 j;221
//		System.out.println(c.j); 
	}

	int i = 111;
	int j = 222;
	
	abstract void methodOne();//
	abstract void methodTwo();
}

abstract class P extends A {
	
	@Override
	void methodOne() {
		System.out.println(i); //111
		System.out.println(j); //222
		
		i = ++i; //112
		j = --j; //221
	}
}
class G extends P {

	@Override
	void methodTwo() {
		System.out.println(i); 
		System.out.println(j); 
		
		i = i++; 
		j = j--; 
	}
	
}
