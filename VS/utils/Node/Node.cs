using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MOE {

	/// <summary>
	/// This class is the implementation for the Node, as written by the MOE (Ministry Of Education)
	/// </summary>
	public class Node<T> {

		/// <summary>
		/// The value of the current node.
		/// </summary>
		private T value;

		/// <summary>
		/// The reference to the next node.
		/// </summary>
		private Node<T> next;

		/// <summary>
		/// C'tor which creates a node with a `value` field and no next node.
		/// </summary>
		/// <param name="value">
		/// The value (of the specified type T) the node would be initialized with.
		/// </param>
		public Node(T value) {
			this.value = value;
			this.next = null;
		}

		/// <summary>
		/// C'tor which creates a node with both a `value` field and a next node.
		/// </summary>
		/// <param name="value">
		/// The value (of the specified type {@link T}) the node would be initialized with.
		/// </param>
		/// <param name="next">
		/// The node following this one (this node is linked to the next node).
		/// </param>
		public Node(T value, Node<T> next) {
			this.value = value;
			this.next = next;
		}

		/// <summary>
		/// This method returns the value of the current node.
		/// </summary>
		/// <returns>
		/// The value of the current node.
		/// </returns>
		public T GetValue() {
			return value;
		}

		/// <summary>
		/// This method returns the node which follows the current node.
		/// </summary>
		/// <returns>
		/// The reference to the next node.
		/// </returns>
		public Node<T> GetNext() {
			return next;
		}

		/**
		 * This method sets (updates) the value stored in the current node to `value`.
		 * @param value
		 */
		public void SetValue(T value) {
			this.value = value;
		}

		/**
		 * This method sets the node which follows the current node to be `next`.
		 * @param next
		 */
		public void SetNext(Node<T> next) {
			this.next = next;
		}

		/// <summary>
		/// This method checks if the current node has a next node.
		/// </summary>
		/// <returns>
		/// `true` if a next node exists and `false` otherwise.
		/// </returns>
		public bool HasNext() {
			return this.next != null;
		}

		/**
		 * This method returns a {@link String} which describes the current node (and any nodes which follow it).
		 */
		override public String ToString() {
			//return this.value + "  " + next;
			return String.Format("-> [ {0} ] {1}",
				GetValue(), GetNext() == null ? "-|" : GetNext().ToString());
		}
	}
}