package ie.ben.twodarrays;

public class EX3Calander {

	public static void main(String[] args) {
		String[] months = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		String[] headers = new String[] { "M", "T", "W", "T", "F", "S", "S" };
		int[] start = new int[] { 2, 5, 5, 1, 3, 6, 1, 4, 0, 2, 5, 0 };
		int temp = 0;
		int counter = 0;
		int temp2 = 0;
		String s ="";
		boolean alreadyExecuted = false;
		int startInt = 0;

		int[][] days = {
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30, 31 }, // jan
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,
						28 }, // feb
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30, 31 }, // march
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30 }, // april
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30, 31 }, // may
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30 }, // june
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30, 31 }, // july
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30, 31 }, // august
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30 }, // oct
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30, 31 }, // sept
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30 }, // novem
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
						29, 30, 31 } // dec
		};

		for (int i = 0, k =0; i < months.length; i++, k++) {

			for (int z = 0; z < days[i].length; z++) {

				temp = days[i][z];

				if (days[i][z] == 1) {
					System.out.println("\n" + months[i]);
					for (int j = 0; j < headers.length; j++) {

						System.out.printf("%-10s", headers[j]);

					}
					System.out.println();
					startInt = start[k];
					alreadyExecuted = false;
					

				}
				
				if (days[i][z] == 1) {
					counter = 0;
				}
				if (start[k] == startInt && alreadyExecuted == false) {
					for(int x = 0; x<startInt;x++){
						
					
						System.out.printf("%-10s", s);
					
						counter++;
					}
						alreadyExecuted =true;
					
						
					}
				if (counter == 7) {
					
					System.out.println();
					System.out.printf("%-10d", temp);
					counter = 0;
				} else {
					System.out.printf("%-10d", temp);
				}

				counter++;

			}

		}
	}
	}


