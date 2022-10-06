package dp;

import java.util.Arrays;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		System.out.println(LISBU(arr));

	}
	
	public static int LISBU (int arr[]) {
		
		int strg[] = new int[arr.length];
		strg[0] = arr[0];  // for starting item the last elem of LIS will be that only
		int len = 1;       // and length of LIS will be 1
		
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i] > strg[len - 1]) {
				strg[len] = arr[i];   // agar item mera sabse bada huwa toh wo represent karega ek new array ko  jiks last elem wo hoga 
				len++;  			// wo mera last element (le) wala array ka last me add hoga
			}
			else {
				int k = binarySearch (strg, 0, len - 1, arr[i]);  // item se just small wala elem ka index return karega
				strg[k] = arr[i]; 								// uske idx pe item ko store karenge
			}
		}
		
		return len;
				
	}
	
	public static int binarySearch (int strg[], int si, int ei, int item) {
		
		int low = si;
		int high = ei;
		while (low <= high) {
			
			int mid = (low + high) / 2;
			
			if (item > strg[mid]) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		
		return low;
	}
	


}
