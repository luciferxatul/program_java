package recursion;

public class Digit { //count no. of digits in a no
	static int c = 0;
	public static int digit(int n) {
		if (n > 0) {
			c++;
			return digit(n / 10);
		}
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digit(157));

	}

}
