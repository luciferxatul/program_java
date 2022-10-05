package recursion;
import java.util.Scanner;

public class Fibonacci {
	static int a = 0, b = 0, c = 1;
	public static void print(int n) {
		if (n == 0) {
			return;
		}
		a = b;
		System.out.print(b + " ");
		b = c;
		c = a + b;
		print(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		print(n + 1);

	}

}
