using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MOE.BinNode {

	/// <summary>
	/// This class represents a node which stores a (generic) value and 2 children<br/>
	/// which are similar nodes.<br/>
	/// <br/>
	/// We can use this class to represent a bi-directional (doubly) linked list or a binary tree.
	/// </summary>
	public class BinNode<T> {
		
		/// <summary>
		/// Reference to the left child (or `prev` in a bi-directional linked list).
		/// </summary>
		private BinNode<T> left;
	
		/// <summary>
		/// The value stored in this node.
		/// </summary>
		private T value;
		
		/// <summary>
		/// Reference to the left child (or `prev` in a bi-directional linked list).
		/// </summary>
		private BinNode<T> right;
		
		/// <summary>
		/// A c'tor which creates a tree node (instance of this class),
		/// its `left` and `right` properties refer to null.
		/// </summary>
		/// <param name="x">The value of the created instance.</param>
		public BinNode(T x) {
			this.left = null;
			this.value = x;
			this.right = null;
		}
		
		/// <summary>
		/// A c'tor which creates a tree node (instance of this class),
		/// its properties would get the values of the arguments.
		/// </summary>
		/// <param name="left"></param>
		/// <param name="x"></param>
		/// <param name="right"></param>
		public BinNode(BinNode<T> left, T x, BinNode<T> right) {
			this.left = left;
			this.value = x;
			this.right = right;
		}
		
		/// <summary>
		/// Returns the value stored in this tree node.
		/// </summary>
		/// <returns></returns>
		public T GetValue() {
			return this.value;
		}
		
		/// <summary>
		/// Updates the value stored in the current tree node.
		/// </summary>
		/// <param name="x"></param>
		public void SetValue(T x) {
			this.value = x;
		}
		
		/// <summary>
		/// Returns this node's left child.
		/// </summary>
		/// <returns></returns>
		public BinNode<T> GetLeft() {
			return this.left;
		}
		
		/// <summary>
		/// Returns this node's right child.
		/// </summary>
		/// <returns></returns>
		public BinNode<T> GetRight() {
			return this.right;
		}
		
		/// <summary>
		/// Updates the left child of the current tree node.
		/// </summary>
		/// <param name="left"></param>
		public void SetLeft(BinNode<T> left) {
			this.left = left;
		}
		
		/// <summary>
		/// Updates the right child of the current tree node.
		/// </summary>
		/// <param name="right"></param>
		public void SetRight(BinNode<T> right) {
			this.right = right;
		}
		
		/// <summary>
		/// Returns if the current node has a left child.
		/// </summary>
		/// <returns></returns>
		public bool HasLeft() {
			return this.left != null;
		}
		
		/// <summary>
		/// Returns if the current node has a right child.
		/// </summary>
		/// <returns></returns>
		public bool HasRight() {
			return this.right != null;
		}
		
		/// <summary>
		/// Returns the string representation of the property `value` in the current node.
		/// </summary>
		/// <returns></returns>
		public override string ToString() {
			return this.value.ToString();
		}
	}
}