package utilities.adt.stack;

import utilities.adt.moe.Stack;

public class StackUtilities {

	public static <T> void flip(Stack<T> origin, Stack<T> destination) {
		while (!origin.isEmpty())
			destination.push(origin.pop());
	}
	
	public static <T> int size(Stack<T> stack) {
		if (stack == null || stack.isEmpty())
			return 0;
		
		int size = 0;
		Stack<T> aidStack = new Stack<T>();
		while (!stack.isEmpty()) {
			aidStack.push(stack.pop());
			size++;
		}
		
		while (!aidStack.isEmpty())
			stack.push(aidStack.pop());
		
		return size;
	}
}
