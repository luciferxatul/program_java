package stacksAndQueue;
import java.util.*;
public class Stack_using_array extends Stacks_using_Arrays  {

	public static void main(String[] args)throws StackEmptyException {
		// TODO Auto-generated method stub
        
		Stacks_using_Arrays stack = new Stacks_using_Arrays();
		for(int i=0;i<5;i++) {
			stack.push(i);
		}
		while(!stack.isEmpty())
		{
			try {
				System.out.println(stack.pop());
			}
			catch(StackEmptyException e) {
				//never reach here
			}
		}
		//System.out.println(stack.isEmpty());
		
		
	}}

