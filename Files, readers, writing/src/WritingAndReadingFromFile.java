import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingAndReadingFromFile {
	public static void main(String[] args) {
		
		String filename = "src/Thursday.txt";
		try{
			PrintWriter pw = new PrintWriter(filename);
			pw.println("Hello");
			pw.print("Hey");
			pw.print(" you Guys");
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		System.out.println("End of Main");
		try{
			FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
