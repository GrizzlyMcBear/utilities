using MOE;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MOE {
	public class Queue<T> {
		// תכונות

		// מצביע לראש התור
		private Node<T> first;

		// מצביע לחוליה האחרונה
		private Node<T> last;

		// פעולה בונה
		public Queue() {
			this.first = null;
			this.last = null;
		}

		// פעולה המחזירה אמת אם התור ריק ושקר אחרת
		public bool IsEmpty() {
			return this.first == null; // return this.last == null; 
		}

		// פעולה המחזירה את האיבר שבראש התור מבלי להוציאו
		// הנחה: התור אינו ריק
		public T Head() {
			return this.first.GetValue();
		}

		// פעולה המכניסה איבר לסוף התור
		public void Insert(T x) {
			if (this.last != null) { // התור לא ריק -> הוספה בסוף
				this.last.SetNext(new Node<T>(x));
				this.last = this.last.GetNext();
			}
			else { // first הוספת חוליה ראשונה בתורת מחייב עדכון של
				this.last = new Node<T>(x);
				this.first = this.last;
			}
		}

		// פעולה המוציאה ומחזירה את האיבר שנמצא בראש התור
		// הנחה: התור לא ריק
		public T Remove() {
			T x = this.first.GetValue();
			this.first = this.first.GetNext();
			if (this.first == null)
				this.last = null;

			return x;
		}

		// פעולה המחזירה מחרוזת המתארת את מצב התור
		public override string ToString() {
			string str = "[";
			Node<T> pos = this.first;

			while (pos != null) {
				str += pos.GetValue();
				if (pos.HasNext())
					str += ", ";

				pos = pos.GetNext();
			}

			str += "]";

			return str;
		}
	}
}
