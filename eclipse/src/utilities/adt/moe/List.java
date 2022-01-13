package utilities.adt.moe;

public class List<T> {
	
    private Node<T> first;
    
    /* הפעולה בונה ומחזירה רשימה ריקה */
    public List() {
        this.first = null;
    }
    
    /*הפעולה מחזירה את החוליה הראשונה ברשימה 
      אם הרשימה ריקה הפעולה מחזירה null*/
    public Node<T> getFirst() {
    	return first;
    }
    
    /*הפעולה מכניסה לרשימה חוליה חדשה שהערך שלה הוא value  אחרי החוליה p 
    הפעולה מחזירה את החוליה החדשה שהוכנסה
    כדי להכניס איבר ראשון לרשימה הערך של הפרמטר p צריך להיות null
    הנחה: החוליה next קיימת ברשימה   */
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
    
    /*הפעולה מוציאה את החוליה p מן הרשימה ומחזירה את החוליה הבאה אחריה
    אם הוצאה החוליה האחרונה ברשימה הפעולה תחזיר null
    הנחה: החוליה p קיימת ברשימה*/
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
    
    /* הפעולה מחזירה 'אמת' אם הרשימה ריקה, ומחזירה 'שקר' אחרת **/
    public boolean isEmpty() {
        return first == null;
    }
    
    /* הפעולה מחזירה מחרוזת המתארת את הרשימה */
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