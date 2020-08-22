package Week10_PLY;

 

public class Book {

	private String title;
	private String author;
	private int pages;

	
	
	public Book() {
		super();
	}


	public Book(String title, String author, int pages) {
		super();
		this.title = title;
		this.author = author;
		if (pages > 300) {
			System.out.println("Invalid Number");
			this.pages= 0;
			
		} else {
			this.pages= pages;
		}
	}


	public void info(){
		System.out.println("Author :" +getAuthor());
		System.out.println("Title :" +getTitle());
		System.out.println("Pages :" +getPages());
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	
}
