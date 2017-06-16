package classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ShoppingList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		try {
			FileReader fr = new FileReader("src/classes/Shopping");
			BufferedReader br = new BufferedReader(fr);
			String current;
			while ((current = br.readLine()) != null) {
				list.add(current);
			}
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		double total = 0;
		for (int i = 0; i < list.size(); i++) {
			int a = list.get(i).length();
			String stri = list.get(i).substring(a - 4, a);

			double d = Double.parseDouble(stri);
			total += d;

		}
		System.out.printf("Total = %.2f", total);
	}
}
