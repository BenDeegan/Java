package mains;

import exercises5.Email;

public class MainForEmail {

	public static void main(String[] args) {
		Email e1 = new Email("ben@google.ie", "12345678901234567890123456", 1);
		System.out.println(e1.toString());
		
		Email e2 = new Email("bengoogle.ie", "1234567", 1);
		System.out.println(e2.toString());

	}

}
