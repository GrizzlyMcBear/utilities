using System;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MOE.Queue {
	// todo: introduce the <T> into this class
	//public class Utilities <T> {
	public class Utilities {
		// <summary>
		// Creates a queue of items by the given csv. Direction of insertion to the queue is Left to Right.
		// </summary>
		// <param name="data">A csv of stringified values.</param>
		// <param name="type">The type of the data items.</param>
		// <returns></returns>
		//public static Queue<T> Create(string data, Type type) {
		//	Queue<T> queue = new Queue<T>();
		//	string[] items = data.Split(',');
		//	T parsedItem;

		//	foreach (string item in items) {
		//		if (String.IsNullOrEmpty(item)) continue;
		//		// todo: find a way to convert `item` into an object/primitive of type `type`
		//		/* todo: implement the command
		//		 queue.Insert(parsedItem);
		//		*/
		//	}

		//	return queue;
		//}

		public static bool IsValid(string data) {
			return (data != null && data.Length > 0);
		}
		public static bool IsValid(char separator) {
			bool result = false;

			if ((separator >= 32 && separator <= 47) || (separator >= 58 && separator <= 64) ||
				(separator >= 91 && separator <= 96) || (separator >= 123 && separator <= 126))
					result = true;

			return result;
		}

		/// <summary>
		/// Creates a queue of numbers by the given data and separator.
		/// </summary>
		/// <remarks>
		/// Direction of items in the queue is Left to Right (of the string).
		/// </remarks>
		/// <param name="data">The items to insert, between each 2 - a separator char.</param>
		/// <param name="separator">The char which comes between each 2 items.</param>
		/// <returns>A queue of integer numbers.</returns>
		public static Queue<int> Create(string data, char separator) {
			Queue<int> queue = new Queue<int>();

			if (!IsValid(data) || !IsValid(separator)) return queue;

			string[] items = data.Split(separator);
			int number;

			foreach (string item in items) {
				if (String.IsNullOrEmpty(item)) continue;
				if (!int.TryParse(item, out number)) continue;
				queue.Insert(number);
			}

			return queue;
		}

		public static int Count(Queue<int> queue) {
			int count = 0;
			Queue<int> temp = new Queue<int>();

			while (!queue.IsEmpty()) {
				count++;
				temp.Insert(queue.Remove());
			}
			while (!temp.IsEmpty())
				queue.Insert(temp.Remove());

			return count;
		}

		public static void ReverseRecursive(Queue<int> queue) {

			// Stopping conditions:
			if (queue == null) return;
			if (queue.IsEmpty()) return;// Either from the start of after recursive calls.

			int firstNumber = queue.Remove();
			ReverseRecursive(queue);
			queue.Insert(firstNumber);

			return;
		}

		/// <summary>
		/// Sorts a queue, assuming its items are non-negative integers.
		/// </summary>
		/// <param name="queue"></param>
		public static MOE.Queue<int> SortIncreasing(MOE.Queue<int> queue) {
			if (queue == null || queue.IsEmpty()) return queue;

			// Remove and insert all items from original queue into an aid-queue
			MOE.Queue<int> sortedQueue = new MOE.Queue<int>();
			while (!queue.IsEmpty()) {
				sortedQueue.Insert(RemoveSmallest(queue));
			}

			// Return all items into the original queue
			while (!sortedQueue.IsEmpty())
				queue.Insert(sortedQueue.Remove());

			return queue;
		}

		/// <summary>
		/// Removes the smallest item in a queue.
		/// </summary>
		/// <param name="queue"></param>
		/// <returns></returns>
		public static int RemoveSmallest(MOE.Queue<int> queue) {
			if (queue == null || queue.IsEmpty()) return -1;

			queue.Insert(-1);
			int smallest = queue.Remove();

			while (queue.Head() != -1) {
				if (queue.Head() < smallest) {
					queue.Insert(smallest);
					smallest = queue.Remove();
				}
				else {
					queue.Insert(queue.Remove());
				}
			}

			queue.Remove();

			return smallest;
		}
	}
}
