using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MOE.Node {
	public class Utilities {
		public static Node<int> CreateList(string rawNumbers) {
			
			// Edge cases for the empty list
			if (rawNumbers == null || rawNumbers.Length == 0) return null;

			// The returned node has at least 1 node:
			Node<int> list = new Node<int>(0);
			Node<int> currNode = list;
			Node<int> lastNode = currNode;
			string[] numbers = rawNumbers.Split('\u002C');
			int currNum = 0;

			for (int i = 0; i < numbers.Length; i++) {
				if (int.TryParse(numbers[i], out currNum)) {
					currNode.SetValue(currNum);
					currNode.SetNext(new Node<int>(0));
					lastNode = currNode;
					currNode = currNode.GetNext();
				}
			}

			lastNode.SetNext(null);
			return list;
		}
	}
}
