package recursion;

public class DecimaltoOctal {
	
	public static int change(int n) {
		if (n == 0)
			return n;
		int s = n % 8;
		return change(n / 8) * 10 + s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4508;
		System.out.println(change(n));

	}

}
