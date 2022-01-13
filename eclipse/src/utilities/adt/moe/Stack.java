package utilities.adt.moe;

/**
 * @author MOE
 * @param <T> The generic type which the this stack stores.
 */
public class Stack<T> {
    
	/** The field which points to the first item (node) in the stack. */
	private Node<T> head;
    
    /** C'tor which creates an empty stack and returns it. */
    public Stack() {
        this.head = null;
    }
    
    /** Creates a new item (node) with the given object and insert it
     	as the stack's new first item.  */
    public void push(T x) {
        Node<T> temp = new Node<T>(x);
        temp.setNext(head);
        head = temp;
    }
    
    /** Remove the stack's first item (node) and returns it. */
    public T pop() {
    	T x = head.getValue();
        head = head.getNext();
        return x;
    }

    /** Returns the first item - without removing it from the stack. */
    public T top() {
        return head.getValue();
    }

    /** Returns `true` if the stack is empty, otherwise - `false`. */
    public boolean isEmpty() {
        return head == null;
    }

    /** Returns a string which represents the stack currently. */
    public String toString() {
        String s = "[";
        Node<T> p = this.head;
        while (p != null)
        {
            s = s + p.getValue().toString();
            if (p.getNext() != null)
                s = s + ",";
            p = p.getNext();
        }
        s = s + "]";
        return s;
    }
}