package materials;

public class DVD extends Material {

	private int dvdCounter;
	private int dvdID;
	
	public DVD(String title, String creator) {
		super(title, creator);
		dvdCounter++;
		this.dvdID = dvdCounter;		
	}

	
	
}




	