package materials;

import java.util.Arrays;

public class StringMethods {

	public static String identifyClassName() {

		MaterialsDatabase md = new MaterialsDatabase();
		
		String gc = md.book1.getClass().toString();
//		int lio = gc.lastIndexOf('.');
//		System.out.println(gc.substring(lio + 1));
		System.out.println(gc.substring(gc.lastIndexOf('.') + 1));
		
	
		System.out.println();
		System.out.println(md.book1.getClass() + " calling from here"); // prints
																		// class
																		// books.Book
		
		System.out.println(md.book1.getClass().toString().substring(md.book1.getClass().toString().lastIndexOf('.') + 1));
		
		return gc;

	}
	
	public static void returnSubstring(String text, int start, int end) {
	
		System.out.println(text.substring(start,end));
				
	}

	public static int findLength(String text) {
		int length = text.length();
		System.out.println(text.length());
		return length;
	}
	
	public static void fillChar(String text) {
	//	String filled = StringUtils.repeat("*", 10); needs JAR
		
	}
	
	public static String getStringWithLengthAndFilledWithCharacter(int length, char charToFill) {
		  if (length > 0) {
		    char[] array = new char[length];
		    Arrays.fill(array, charToFill);
		    System.out.println(array);
		    return new String(array);
		  }
		  return "";
		}

	
	
	
}



















