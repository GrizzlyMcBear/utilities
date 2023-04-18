package utilities.adt.moe;

/** This class represents a binary tree node.
 * 
 * @author MOE
 *
 * @param <T> The type of object stored within the node.
 */
public class BinNode<T> {
	
	/** The value of the current binary tree node. */
    private T value;
    
    /** The left child (node) of the current binary tree node. */
    private BinNode<T> left;
    
    /** The right child (node) of the current binary tree node. */ 
    private BinNode<T> right;

    /** C'tor which gets the value to store in the node.
     * @param value The value of the newly created binary tree node.
     */
    public BinNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
    /** C'tor which gets values for this node and the 2 nodes which are its children.
     * @param left The left child node.
     * @param value The value of this new node.
     * @param right The right child node.
     */
    public BinNode(BinNode<T> left, T value, BinNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    /** Return true if this node has a left child, otherwise - false. */
    public boolean hasLeft() {
        return left != null ;
    }

    /** Return true if this node has a right child, otherwise - false. */
    public boolean hasRight() {
        return right != null ;
    }

    /** Returns the value (type {@link T}) of this binary tree node. */
    public T getValue() {
        return value;
    }
    
    /** Returns the left child of this binary tree node. */
    public BinNode<T> getLeft() {
        return left;
    }
    
    /** Returns the right child of this binary tree node. */
    public BinNode<T> getRight() {
        return right;
    }
    
    /** Updates the value of this binary tree node. */
    public void setValue(T value) {
        this.value = value;
    }
    
    /** Updates the left child of this binary tree node. */
    public void setLeft(BinNode<T> left) {
        this.left = left;
    }
    
    /** Updates the right child of this binary tree node. */
    public void setRight(BinNode<T> right) {
        this.right = right;
    }

    /** Returns the {@link String} representation of the binary sub-tree,
     * starting with this node. */
    public String toString() {
        return " ( " + left + " " + value + " " + right + " ) ";
    }
}