package MarchWeek3;

public class Super {

	public static void main(String[] args) {
		 

	}

	public Super() {
		super();
		// TODO Auto-generated constructor stub
	}

}
class A{
	
	int a;
	int b;
	public A(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	
}
class B extends A {
	int c;
	int d;
	
	public B(int a, int b, int c, int d ) {
		super(a, b);
		 this.c=c;
		 this.d=d;
		 
	}
	
}
class C extends B {
	int e; 

	public C(int a, int b, int c, int d, int e) {
		super(a, b, c, d);
		this.e = e;
		
	}
	
		 
	}



