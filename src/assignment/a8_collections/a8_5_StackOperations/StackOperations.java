package assignment.a8_collections.a8_5_StackOperations;

//import java.util.Iterator;
import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Object> stk = new Stack<>();
		stk.push("String 1");
		stk.push("String 3");
		stk.push("String 2");
		stk.push("String 4");
		stk.push("String 5");

		stk.push(1);
		stk.push(4);
		stk.push(5);
		stk.push(4.55f);
		stk.push(45.55f);
		System.out.println("Contents of stack : " );
//		System.out.println("Contents of stack : " + stk);
		for (Object item: stk) {
	            System.out.println(item);
	    }
		stk.pop();
		stk.pop();
		System.out.println("Contents of stack : " );
		for (Object item: stk) {
	            System.out.println(item);
	    }
//		Iterator iterate_value = stk.iterator();
	
//		 while (iterate_value.hasNext()) {
//	            System.out.println(iterate_value.next());
//	     }
	}

}
