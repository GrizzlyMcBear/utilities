using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MOE.Stack {
	//public class Utilities<T> {
	public class Utilities {
		public static Stack<int> Create(string data, char separator) {
			Stack<int> result = new Stack<int>();
			string[] items = data.Split(separator);

			foreach (string item in items) {
				result.Push(int.Parse(item));
			}

			return result;
		}
	}
}
