package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumbers {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/classes/AddressBook.txt");
	    StringBuilder fileContents = new StringBuilder((int)file.length());
	    Scanner scanner = new Scanner(file);
	    String lineSeparator = System.getProperty("line.separator");

	    try {
	        while(scanner.hasNextLine()) {
	            fileContents.append(scanner.nextLine() + lineSeparator);
	        }
	        
	    } finally {
	        scanner.close();
	    }
	    Pattern mypatt = Pattern.compile("");
	    Matcher m = mypatt.matcher(fileContents);
	    while(m.find()){
	    	System.out.println(m.group());	  
	    	
	    	}
	}

}
