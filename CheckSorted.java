package recursion;

import java.util.Scanner;

public class CheckSorted {
	/*public static boolean checkSorted(int arr[]) {
		if (arr.length <= 1)
			return true;
		if (arr[0] > arr[1])
			return false;
		
		int small[] = new int[arr.length - 1];
		for (int i = 0; i < small.length; i++) {
			small[i] = arr[i + 1];
		}
		boolean ans = checkSorted(small);
			return ans;		
	}*/
	
	public static boolean checkSortedBetter(int arr[], int startInd) { //alternate way
		if (startInd >= arr.length -1) {
			return true;
		}
		if (arr[startInd] > arr[startInd + 1]) {
			return false;
		}
		return checkSortedBetter(arr, startInd + 1);
	}
	
	public static boolean checkSortedBetter(int arr[]) {
		return checkSortedBetter(arr, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		//System.out.println(checkSorted(arr));
		System.out.println(checkSortedBetter(arr));

	}

}
