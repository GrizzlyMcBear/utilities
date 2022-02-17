package utilities.adt.node;

import utilities.adt.moe.Node;

public class NodeUtilities {

	/**
	 * @implNote Several notes regarding the implementation:</br>
	 * 	<ul>
	 * 		<li><b>Naming conventions:</b></br>
	 * 			we use the `list` (`firstNode` would also be acceptable) as a variable literal</br>
	 * 			to convey that this variable represents the list even though it points to an instance of `Node`</br>
	 * 			and could be named `node`
	 * 		</li>
	 * 	</ul>
	 * @param csvValues
	 * @return
	 */
	public static Node<Integer> createNodes(String csvValues) {
		if (csvValues == null || csvValues.isEmpty()) return new Node<Integer>(null);
		
		// Split the argument into separate values using the comma
		String[] values = csvValues.split(",");
		// Note that `list` points 
		Node<Integer> list = new Node<Integer>(null);
		Node<Integer> currNode = list;
		
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
		
		return list.getNext();
	}
}
