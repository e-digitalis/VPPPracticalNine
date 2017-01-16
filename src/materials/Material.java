package materials;

public class Material { //superclass

	private int itemID;
	private static int itemCounter; //belongs to all objects
	private String title;	
	private String creator;	
	
	public Material(String title, String creator) {
	
		itemCounter++;
		this.itemID = itemCounter;
		this.title = title;
		this.creator = creator;
	}

	@Override
	public String toString() {
		return "itemID: " + itemID + ", title: " + title + ", creator: " + creator;
	}

	public int getItemID() {
		return itemID;
	}

	public String getTitle() {
		return title;
	}

	public String getCreator() {
		return creator;
	}
	
	
	
	
}
