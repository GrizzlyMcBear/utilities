package utilities.adt.mine;

import utilities.adt.moe.Node;
import utilities.adt.moe.Stack;

/**
 * @author Ronen Cohen
 * @implNote Utility methods which help creating ADTs in order to save time during H.W. and teaching.
 */
public class Utilities {
	
	/* Node related methods: */
	
	/** 
	 * This method creates nodes, each one of them contains {@link Integer An Integer}, 
	 * by the given {@link String `csvValues` argument}. 
	 * @param csvValues
	 * @return
	 */
	public static Node<Integer> createIntegerNodes(String csvValues) {
    	
    	// For the degenerated case, return an empty list
    	if (csvValues == null || csvValues.equals(""))
    		return null;
    	
    	Node<Integer> list = null,
    			currNode = null,
    			newNode = null;
    	int index;
    	
    	String[] values = csvValues.trim().split(",");// Create a strings array from the argument.
    	
    	// Create a nodes list from the given values
    	for (index = 0; index < values.length; index++) {
    		
    		newNode = new Node<Integer>(new Integer(values[index].trim()));
    		
    		if (list == null) {
    			list = newNode;
    			currNode = list;
    		} else {
    			currNode.setNext(newNode);
        		currNode = currNode.getNext();
    		}
		}
    	
    	return list;
    }
    
    public static Node<Character> createCharacterNodes(String values) {
    	Node<Character> result = null;
    	
    	if (values != null && !values.equals("")) {// Create the new list only for strings which contain data.
    		Node<Character> currNode = null,
    				newNode = null;
    		int index;
    		
    		values = values.trim();
    		
    		// Create a nodes list from the given values
        	for (index = 0; index < values.length(); index++) {
        		
        		newNode = new Node<Character>(values.charAt(index));
        		
        		if (result == null) {
        			result = newNode;
        			currNode = result;
        		} else {
        			currNode.setNext(newNode);
            		currNode = currNode.getNext();
        		}
    		}
    		
    	}
    	
		return result;
    }

    // TODO: refactor this method to be generic
    /** Returns the length of the list.
     * @author Ronen Cohen
     * @param nodes
     * @return The length of the nodes list, starting at the given `nodes` argument.
     */
    public static int length(Node<Integer> nodes) {
    	Node<Integer> currNode = nodes;
    	int length = 0;
    	
    	while (currNode != null) {
    		length++;
    		currNode = currNode.getNext();
    	}
    	
    	return length;
    }

    public static <T> int length(Stack<T> stack) {
    	if (stack == null) return 0;
    	
    	int length = 0;
    	Stack<T> helpStack = new Stack<T>();
    	while (!stack.isEmpty()) {
    		length++;
    		helpStack.push(stack.pop());
    	}
    	flipStacks(helpStack, stack);
    	
    	return length;
    }
    
    public static <T> void flipStacks(Stack<T> origin, Stack<T> destination) {
		while (!origin.isEmpty())
			destination.push(origin.pop());
	}
    
    /**
     * This method creates a {@link Stack} containing {@link Integer} items
     * @param csvValues A CSV (Comma Separated Values) of numbers.
     * @return A stack which contains the numbers passed as arguments.
     */
    public static Stack<Integer> createIntegerStack(String csvValues) {
    	Stack<Integer> result = new Stack<Integer>();
    	String[] values = csvValues.trim().split(",");
    	
    	for (int i = 0; i < values.length; i++)
    		result.push(new Integer(values[i]));
    	
    	return result;
    }
}