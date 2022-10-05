package recursion;
import java.util.Scanner;
public class Temp {

	public static void print(int n) {
		if (n <= 0)
			return;
//		System.out.println(n);
//		print(n - 2);
//		if (n != 1)
//			System.out.println(n - 1);
		if (n % 2 != 0)
			System.out.println(n);
		print(n - 1);
		if ( n % 2 == 0)
			System.out.println(n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		print(t);
		
		

	}

}
