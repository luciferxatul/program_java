package recursion2;
import java.util.Scanner;

public class Remove_Char {
	public static String remove(String str , char x) {
		if (str.isEmpty()) {      // if(str.length() == 0)
			return str;
		}
		String ans = "";
		if (str.charAt(0) != x) {
			ans = ans + str.charAt(0);
		}
		return ans + remove(str.substring(1) , x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		String check = sc.nextLine();
		char x  = check.charAt(0);
		System.out.println(remove(str, x));

	}

}
