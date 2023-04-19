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

		/// <summary>
		/// Returns the position of the value in the given node's list.
		/// </summary>
		/// <remarks>
		/// The position (1 to N) or -1 if value doesn't exist.
		/// </remarks>
		/// <param name="node"></param>
		/// <param name="value"></param>
		/// <returns></returns>
		public static int Find(Node<int> node, int value) {
			int index = 0;
			bool found = false;

			while (node != null && !found) {
				index++;
				if (node.GetValue() == value)
					found = true;

				node = node.GetNext();
			}

			return found ? index : -1;
		}

		/// <summary>
		/// Returns the amount of times `value` appears in the given list.
		/// </summary>
		/// <param name="node"></param>
		/// <param name="value"></param>
		/// <returns></returns>
		public static int Count(Node<int> node, int value) {
			int amount = 0;

			while (node != null) {
				if (node.GetValue() == value) amount++;

				node = node.GetNext();
			}

			return amount;
		}
	}
}
