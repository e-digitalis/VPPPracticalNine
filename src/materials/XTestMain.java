package materials;

public class XTestMain {

	public static void main(String[] args) {

		
		MaterialsDatabase md = new MaterialsDatabase();
		StringMethods.identifyClassName();
		
		StringMethods.returnSubstring("A very long name", 2, 8);
		String avln = "A very very very long name";
		StringMethods.returnSubstring(avln, avln.indexOf(' ') + 1, avln.lastIndexOf(' '));
		
		StringMethods.findLength(avln);
		System.out.println("xxx");
		
		StringMethods.returnSubstring(avln, (int)(StringMethods.findLength(avln)/2), StringMethods.findLength(avln)/2);
		StringMethods.returnSubstring(avln, 0, (int) avln.length()/2);
		StringMethods.returnSubstring(avln, (int) avln.length()/2, avln.length());
		
		StringMethods.getStringWithLengthAndFilledWithCharacter(15, ' ');
		StringMethods.getStringWithLengthAndFilledWithCharacter(15, '*');
		
		
		// System.out.println(book1 + " " + book2 + " " + dvd1 + " " + dvd2);
//		System.out.println(bd.book1);
//		System.out.println(bd.book2);
//		System.out.println(bd.dvd1);
//		System.out.println(bd.dvd2);

//		System.out.println(bd.book2.toString()); // right now prints "itemID=0, title=Great programming, creator=null"
//		System.out.println(bd.book2.toString()); // right now prints "itemID=0, title=Great programming, creator=null"

		// FullName.substring( 5, FullName.length( ) - 3 );
		// System.out.println(Str.substring(10) );

//TODO ask		String gc = bd.book1.getClass();



		// XInstancesOf.addInstances(); //didn't work (even at the top)

	}

}
