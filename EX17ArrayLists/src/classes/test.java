package classes;

import java.util.ArrayList;

public class test {
	public static  void main(String[] args) {
		ArrayList <String> strList = new ArrayList<>();
		String s1 = "one";
		String s2 = "two";
		String s3 = "three";
		String s4 = "four";
		String s5 = "five";
		String s6 = "six";
		
		strList.add(s1);
		strList.add(s2);
		strList.add(s3);
		strList.add(s4);
		strList.add(s5);
		strList.add(s6);
		
		for (String string : strList) {
			System.out.println(string);
		}
	}

}
