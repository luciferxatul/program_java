 package linkedList;
import java.util.Scanner;

public class DeleteR {
	
	public static Node<Integer> delete(Node<Integer> head, int pos){
		if (head.next == null) {
			return head;
		}
		if (pos == 0) {
			return head.next;
		}
		
		if (head == null) {
			return head;
		}
		 head.next = delete(head.next, pos - 1);
		 return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NodeUse n = new NodeUse();
		Node<Integer> head = n.takeInput();
		n.print(head);
		System.out.println("enter the pos whose elem you want to delete:");
		int pos = sc.nextInt();
		head = delete(head, pos - 1);
		n.print(head);
		
		

	}

}
