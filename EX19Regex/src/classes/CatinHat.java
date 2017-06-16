package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CatinHat {
	public static void main(String[] args) {
		try {
			readBook();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void readBook() throws FileNotFoundException{
		 	File file = new File("src/classes/The Cat in the Hat.txt");
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
		    Pattern mypatt = Pattern.compile("cat|Cat");
		    Matcher m = mypatt.matcher(fileContents);
		    int counter = 0;
		    while(m.find()){
		    	counter++;
		    	System.out.println(m.start() + " " + m.group());
		    	
		    	
		    }	
	
		   System.out.println(counter);
		    
	}


}