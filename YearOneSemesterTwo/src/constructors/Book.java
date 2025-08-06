package labA;

public class Book {
	private String title;
	private String author;
	
	public Book() {
		this.title = "Unknown Title";
		this.author = "Unknown Author";
	}
	public Book(String title) {
		this.title = title;
		this.author = "Unknown Author";
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
}