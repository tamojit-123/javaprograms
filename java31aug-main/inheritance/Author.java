//only constructor , setters and getters,  toString() -> this type of class we called as Model /Domain/value/POJO/Bean
class Author {
	private String authorName;
	private String authorPenName;
	private int authorid;

	public Author() {
	}

	public Author(String authorName, String authorPenName, int authorid) {
		this.authorName = authorName;
		this.authorPenName = authorPenName;
		this.authorid = authorid;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setAuthorPenName(String authorPenName) {
		this.authorPenName = authorPenName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getAuthorPenName() {
		return authorPenName;
	}

	// toString()-> it is a builtin function which is given under the package
	// java.lang.Object class
	// Object -> it isParentclass forall builtIn class and user defined class
	public String toString() {
		return authorName + authorid;
	}
}

class Book {
	// proeprties
	int bid;
	String bname;
	float price;
	Author author; // reference of authorclass as property for book class

	public Book() {
	}

	public Book(int bid, String bname, float price, Author author) {
		this.bid = bid;
		this.bname = bname;
		this.price = price;
		this.author = author;
	}

	// getter methods
	public int getBid() {
		return bid;
	}

	public String getBname() {
		return bname;
	}

	public float getPrice() {
		return price;
	}

	public Author getAuthor() {
		return author;
	}

	public static void main(String[] ar) {
		Author author = new Author("Steven", "king", 1001);
		System.out.println(author);
		author.setAuthorName("James");
		author.setAuthorPenName("Goosling");
		Book book = new Book(1231, "J2se", 856.4565f, author);
		System.out.println("BookId:" + book.getBid());
		System.out.println("Book Name:" + book.getBname());
		System.out.println("BookPrice:" + book.getPrice());
		System.out.println("Book Author:" + book.getAuthor());

	}
}