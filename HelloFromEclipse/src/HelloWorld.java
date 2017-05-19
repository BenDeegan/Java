
public class HelloWorld {
	public static void main(String[] args) {
			int result1 = 30;
	        int result2 = 70;
	        int result3 = 50;
		ex12(result1, result2, result3);

	}
	 public static void ex12(int result1, int result2, int result3) {
	        boolean one = false;
	        boolean two = false;
	        boolean three = false;
	        double avg = (result1 + result2 + result3) / 3;
	        if (result1 >= 40) {
	            System.out.println("Subject 1 passed");
	            one = true;
	        }
	        if (result2 >= 40) {
	            System.out.println("Subject 2 passed");
	            two = true;
	        }
	        if (result3 >= 40) {
	            System.out.println("Subject 3 passed");
	            three = true;
	        }

	        if (one == true && two == true && three == true) {
	            System.out.println("You passed everything");
	        } else if (one == true && two == true && avg >= 50
	                || one == true && three == true && avg >= 50
	                || two == true && three == true && avg >= 50) {
	            System.out.println("You passed two and had an average over 50");
	        } else System.out.println("Your avg grade wasn't high enough, you failed");

	    }
	
}
