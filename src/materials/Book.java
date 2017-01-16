package materials;

public class Book extends Material {

	private int bookCounter;
	private int bookID;
	private int iSBN; //International Standard Book	Number
	
	public Book(String title, String creator, int iSBN) {
		super(title, creator);
		bookCounter++;
		this.bookID = bookCounter;
		this.iSBN = iSBN;	
	}

	@Override
	public String toString() {
		return super.toString() + ", bookID: " + bookID;
	}

	public int getBookID() {
		return bookID;
	}

	public int getiSBN() {
		return iSBN;
	}


	
}
