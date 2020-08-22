package Week10_PLY;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book obj1=  new Book(), obj2 = new Book();
		obj1.setTitle("World");
		obj1.setAuthor("Tony Brond");
		obj1. setPages(315);
		
		obj2.setTitle("Java");
		obj2.setAuthor("Emily jain");
		obj2. setPages(153);

		obj1.info();
		System.out.println("****************");
		obj2.info();
	}}

