 package linkedList;
import java.util.Scanner;

public class ReverseBest {
	
	public static Node<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null, tail = null;
		while (data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
			}
			tail = newNode;
			data = sc.nextInt();	
		}
		return head;
			
	}
	
	public static void print(Node<Integer> head){
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static Node<Integer> reverse(Node<Integer> head){
		if (head == null || head.next == null) {
			return head;
		}
		Node<Integer> reverseTail = head.next;
		Node<Integer> smallAns = reverse(head.next);
		reverseTail.next = head;
		head.next = null;
		return smallAns;
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		print(head);
		head = reverse(head);
		print(head);

	}

}
