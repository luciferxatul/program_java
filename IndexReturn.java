package recursion;

import java.util.Scanner;

public class IndexReturn {
	public static int index(int arr[], int x, int startInd) {
		if(startInd >= arr.length) {
				return -1;
		}
		if (arr[startInd] == x)
			return startInd + 1;
		return index(arr, x, startInd + 1);
	}
	
	public static int index(int arr[], int k) {
		return index(arr, k, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		int x = sc.nextInt();
		int k = index(arr, x); 
		if (k != -1)
		System.out.println("at " + k + " position");
		else
			System.out.println("not present");

	}

}
