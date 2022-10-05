package recursion;
import java.util.Scanner;

public class LastIndex {
	public static int pos = -1;
	public static int index(int arr[], int x, int start) {
		if(start == arr.length) {
			return pos;
		}
		if (arr[start] == x) {
			pos = start + 1;
		}
		return index(arr, x, start + 1);
	}
	public static int index(int arr[], int x) {
		return index(arr, x, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(index(arr, x));
		

	}

}
