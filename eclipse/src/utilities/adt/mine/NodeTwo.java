package utilities.adt.mine;

/**
 * This class implements a bidirectional Node ADT (Abstract Data Type) according to the MOE's base code.
 *  
 * @author Ronen Cohen
 * @param <T> The type of data stored in each Node.
 */
public class NodeTwo<T> {
	
    private T value;
    private NodeTwo<T> right;
    private NodeTwo<T> left;
    
    //TODO: go over the documentation
    /**
     * C'tor which creates a node with a `value` field and no right or previous nodes.
     * @param value The value (of the specified type T) the node would be initialized with.
     */
    public NodeTwo(T value) {
        this(value, null, null);
    }
    //TODO: go over the documentation
    /**
     * C'tor which creates a node with both a `value` field and a right node.
     * @param value The value (of the specified type {@link T}) the node would be initialized with.
     * @param right The node following this one (this node is linked to the right node).
     */
    public NodeTwo(T value, NodeTwo<T> right) {
    	this(value, right, null);
    }
    public NodeTwo(T value, NodeTwo<T> right, NodeTwo<T> left) {
    	this.value = value;
    	this.right = right;
    	this.left = left;
    }
    //TODO: go over the documentation
    /**
     * This method returns the value of the current node.
     * @return
     */
    public T getValue() {
        return value;
    }
    //TODO: go over the documentation
    /**
     * This method returns the node which follows the current node.
     * @return
     */
    public NodeTwo<T> getRight() {
        return right;
    }
    public NodeTwo<T> getLeft() {
    	return left;
    }
    /**
     * This method sets (updates) the value stored in the current node to `value`.
     * @param value
     */
    public void setValue(T value) {
        this.value = value;
    }
    /**
     * This method sets the node which follows the current node to be `right`.
     * @param right
     */
    public void setRight(NodeTwo<T> right) {
        this.right = right;
    }
    public void setLeft(NodeTwo<T> left) {
    	this.left = left;
    }
    /**
     * This method returns a {@link String} which describes the current node (and any nodes which follow it).
     */
    @Override
    public String toString() {
//    	return this.value+ "  " + right;
    	return String.format("%s [ %s ] %s",
    			getLeft() == null ? "|-" : "<=>", 
    			getValue(), 
    			getRight() == null ? "-|" : getRight());
    }
    public NodeTwo<T> returnRight() {
    	NodeTwo<T> currNode = this;
    	while (currNode.getRight() != null)
    		currNode = currNode.getRight();
    	
    	return currNode;
    }
    public NodeTwo<T> returnLeft() {
    	NodeTwo<T> currNode = this;
    	while (currNode.getLeft() != null)
    		currNode = currNode.getLeft();
    	
    	return currNode;
    }
}