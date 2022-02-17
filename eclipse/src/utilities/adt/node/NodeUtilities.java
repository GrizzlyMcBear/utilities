package utilities.adt.node;

import utilities.adt.moe.Node;

public class NodeUtilities {

	public static Node<Integer> createNodes(String csvValues) {
		if (csvValues == null || csvValues.isEmpty()) return new Node<Integer>(null);
		
		// Split the argument into separate values using the comma
		String[] values = csvValues.split(",");
		Node<Integer> result = new Node<Integer>(null);
		Node<Integer> currNode = result;
		
		// Go over the separated string values and convert them into numeric values while inserting them into the linked list
		for (int valueIndex = 0; valueIndex < values.length; valueIndex++) {
			// Possible shorter code:
			// currNode.setNext(new Node<Integer>(Integer.valueOf(values[valueIndex]))); 
			
			// Create a numeric value from the current string
			Integer currValue = Integer.valueOf(values[valueIndex]);
			// Create a new node with the value and link it as the next node
			currNode.setNext(new Node<Integer>(currValue));
			// Advance `currNode` to the next node
			currNode = currNode.getNext();
		}
		
		return result.getNext();
	}
}
