package materials;

import java.util.ArrayList;

public class MaterialsDatabase {

	Material book1 = new Book("Great java", "Mia Namaste", 456791320);
	Material book2 = new Book("Great programming", "Mia Namaste", 1237894560);
	Material dvd1 = new DVD("Great music for java", "Mia Namaste");
	Material dvd2 = new DVD("Great music for programming", "Mia Namaste");
	Material book3 = new Book("Great java", "Mia Namaste", 456791320);
	Material book4 = new Book("Great programming", "Mia Namaste", 1237894560);

	public void createArrayList() {
		ArrayList<Material> matList = new ArrayList<Material>();
		matList.add(book1);
	}

}
