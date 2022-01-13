package utilities.adt.moe;

public class List<T> {
	
    private Node<T> first;
    
    /* ������ ���� ������� ����� ���� */
    public List() {
        this.first = null;
    }
    
    /*������ ������ �� ������ ������� ������ 
      �� ������ ���� ������ ������ null*/
    public Node<T> getFirst() {
    	return first;
    }
    
    /*������ ������ ������ ����� ���� ����� ��� ��� value  ���� ������ p 
    ������ ������ �� ������ ����� �������
    ��� ������ ���� ����� ������ ���� �� ������ p ���� ����� null
    ����: ������ next ����� ������   */
    public Node<T> insert(Node<T> p, T value) {
        Node<T> q = new Node<T>(value);
        
        if (p == null) {
            q.setNext(first);
            first = q;
        } else {
            q.setNext(p.getNext());
            p.setNext(q);
        }
        
        return q;
    }
    
    /*������ ������ �� ������ p �� ������ ������� �� ������ ���� �����
    �� ����� ������ ������� ������ ������ ����� null
    ����: ������ p ����� ������*/
    public Node<T> remove(Node<T> p) {
        if (first == p) {
            first = p.getNext();
            return first;
        } else {
            Node<T> prev = first;
            while (prev.getNext() != p)
                prev = prev.getNext();
            prev.setNext(p.getNext());
            return prev.getNext();
        }
    }
    
    /* ������ ������ '���' �� ������ ����, ������� '���' ���� **/
    public boolean isEmpty() {
        return first == null;
    }
    
    /* ������ ������ ������ ������ �� ������ */
    public String toString() {
        String s = "[";
        Node<T> p = this.first;
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