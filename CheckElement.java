package recursion;
import java.util.Scanner;

public class CheckElement {  //check elem is present in array or not
	public static boolean present(int arr[], int x) {
		if (arr.length == 1) {
			if (arr[0] == x)
				return true;
			else
				return false;

		}
		if (arr[0] == x)
			return true;
		int small[] = new int[arr.length - 1];
		for(int i = 0; i < small.length; i++) 
			small[i] = arr[i + 1];
		
		return present(small , x);
		
	}
	
	public static boolean presentBetter(int arr[], int x, int startInd) {
		if (startInd >= arr.length - 1) {
			if (arr[startInd] != x)
				return false;
		
		}
		if(arr[startInd] == x)
			return true;
		return presentBetter(arr, x, startInd + 1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		int x = sc.nextInt();
		//System.out.println(present(arr , x));
		System.out.println(presentBetter(arr, x, 0));
		

	}

}
