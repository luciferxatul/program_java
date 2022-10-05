package recursion;
import java.util.Scanner;

public class Pattern {
	
	public static void pattern(int n) {
		if (n == 0) {
			return;
		}
		
		pattern(n -1);
		helper(n);
		System.out.println(); 	
	}
	
	private static void helper(int n) {
		if (n == 0)
			return;
		System.out.print("* ");
		helper(n -1);
		
	}
	
	public static void patternBetter(int n) {
		patternHelper(n, 1, 1);
	}
	
	public static void patternHelper(int n, int row, int col) {
		
		if (row > n)
			return;
		
		if (col > row) {
			System.out.println();
			patternHelper(n, row + 1, 1);
			return;
		}
		System.out.print("* ");
		patternHelper(n, row, col + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		patternBetter(n);

	}

}
/*output
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
*/
