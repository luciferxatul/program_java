package recursion;
import java.util.Scanner;

public class SumArray {
	public static int sum(int arr[]) {
		if (arr.length == 1) {
			System.out.println(arr[0]);
			return arr[0];
			
		}
		int small[] = new int[arr.length - 1];
		for(int i = 0; i < small.length; i++) {
			small[i] = arr[i + 1];
		}
		System.out.println(arr[0]);
		return arr[0] + sum(small);
		
	}
	
	public static int sumBetter(int arr[], int start) {
		if (start >= arr.length - 1)
			return arr[start];
		return sumBetter(arr, start + 1) + arr[start];
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		//System.out.println(sum(arr));
		System.out.println(sumBetter(arr, 0));
			
		

	}

}
