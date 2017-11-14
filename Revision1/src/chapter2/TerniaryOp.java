package chapter2;

public class TerniaryOp {
	public static void main(String[] args) {
		int x = 50;
		
		double profit = x >= 80 && x<=90 ? 0.2 : x > 90 ?  0.5 :0;
		
		System.out.println(profit);
	}

}
