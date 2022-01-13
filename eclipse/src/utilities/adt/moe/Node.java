package utilities.adt.moe;

/**
 * This class implements the `Node` ADT (Abstract Data Type), not to be confused with the
 * <a href="https://docs.oracle.com/javase/7/docs/api/org/w3c/dom/Node.html">Node interface</a>.
 *  
 * @author MOE
 * @param <T> The type of data stored in each Node.
 */
public class Node<T> {
	
    private T value;
    private Node<T> next;
    
    /**
     * C'tor which creates a node with a `value` field and no next node.
     * @param value The value (of the specified type T) the node would be initialized with.
     */
    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    /**
     * C'tor which creates a node with both a `value` field and a next node.
     * @param value The value (of the specified type {@link T}) the node would be initialized with.
     * @param next The node following this one (this node is linked to the next node).
     */
    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }
    
    /**
     * This method returns the value of the current node.
     * @return
     */
    public T getValue() {
        return value;
    }
    
    /**
     * This method returns the node which follows the current node.
     * @return
     */
    public Node<T> getNext() {
        return next;
    }
    
    /**
     * This method sets (updates) the value stored in the current node to `value`.
     * @param value
     */
    public void setValue(T value) {
        this.value = value;
    }
    
    /**
     * This method sets the node which follows the current node to be `next`.
     * @param next
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    /**
     * This method returns a {@link String} which describes the current node (and any nodes which follow it).
     */
    @Override
    public String toString() {
//    	return this.value+ "  " + next;
    	return String.format("-> [ %s ] %s", getValue(), getNext() == null ? "-|" : getNext());
    }
}