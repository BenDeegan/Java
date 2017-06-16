import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class solver {
	public static void main(String[] args) throws FileNotFoundException {
		work();
		// lead - load - goad - gold
	}
	public static StringBuilder fileContents() throws FileNotFoundException{
		File file = new File("src/websters-dictionary.txt");
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
	    return fileContents;
	}
	
	public static void work() throws FileNotFoundException{
		String lead = "lead";
		String gold = "gold";
		char [] leadArr = lead.toCharArray();
		char [] goldArr = gold.toCharArray();
		char [] set = new char [leadArr.length];		
		StringBuilder st = new StringBuilder(fileContents());
		int i = 0;
		String str = lead;
		
		while(!leadArr.equals(goldArr)){
			if(leadArr[i] == goldArr[i]){
				i++;
			}else{
				char oldChar = leadArr[i];
				char newChar = goldArr[i];
				str.replace(oldChar, newChar);
				if(st.toString().contains(str)){
					leadArr[i] = newChar;
				}
			}
			System.out.println(leadArr);
		}
		



}
}
