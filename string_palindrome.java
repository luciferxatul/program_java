package strings;
import java.util.Scanner;
public class string_palindrome {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	//char w=' ';
	String str1="";
	System.out.println("enter a string");
	String str= sc.nextLine();
	int l= str.length();
	for(int i=l-1;i>=0;i--) {
		 str1=str1+str.charAt(i);
		
	}System.out.println(str1);
	if(str.equals(str)) {
		System.out.println("palindrome");
	}else {
		System.out.println("not");
	}
		
		
		
	}}

	