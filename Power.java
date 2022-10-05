package recursion;
import java.util.Scanner;
public class Power {
	public static int power(int x, int n) {
		if  (n == 0) {
			return 1;
		}
		return x * power(x,n - 1);
	}
	public static int print(int n) {
		if (n > 1) {
			System.out.print(n + " ");
			return print(n - 1);
		}
		return 1;
	}
	
public static int powerBetter(int x, int n) { //O(log n)
		
		if (n == 0) {
			return 1;
		}
		
		int rr = power(x, n / 2);
		if(n % 2 == 0) {
			return rr * rr;
		}
		
		return x * rr * rr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int x = sc.nextInt();
		int n = sc.nextInt();
		//System.out.print(power(x, n));
		System.out.println(print(n));

	}

}
