using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MOE {
	public class Stack<T> {

		// תכונת המחלקה
		private Node<T> first;

		// פעולה בונה היוצרת ומחזירה מחסנית ריקה
		public Stack() {
			this.first = null;
		}

		// פעולה המחזירה `אמת` אם המחסנית ריקה ו-`שקר` אחרת
		public bool IsEmpty() {
			return this.first == null;
		}

		// דחיפה למחסנית - פעולה הדוחפת איבר לראש המחסנית
		public void Push(T x) {
			this.first = new Node<T>(x, this.first);
		}

		// שלוף ממחסנית - פעולה המוציאה ומחזירה את האיבר שבראש המחסנית
		// הנחה: המחסנית אינה ריקה
		public T Pop() {
			T x = this.first.GetValue();
			this.first = this.first.GetNext();
			return x;
		}

		// הצץ למחסנית - פעולה המחזירה את האיבר שבראש המחסנית מבלי להוציאו
		// הנחה: המחסנית לא ריקה
		public T Top() {
			return this.first.GetValue();
		}

		// פעולה המחזירה מחרוזת המתארת את מצב המחסנית באופן הבא
		// [x1, x2, ..., xn]
		// x1 כאשר בראש המחסנית נמצא האיבר
		// xn ואילו בסוף המחסנית נמצא האיבר
		public override string ToString() {
			string str = "[";
			Node<T> pos = this.first;

			while (pos != null) {
				str += pos.GetValue().ToString();
				if (pos.HasNext())
					str += ", ";

				pos = pos.GetNext();
			}

			str += "]";

			return str;
		}
	}
}
