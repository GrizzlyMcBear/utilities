using MOE.BinNode;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MOE.BinNode.Create {
	// todo: add a generic class for creating a binary tree from an array.
	public class FromArray {

		public static readonly int NoChild = 0;

		/// <summary>
		/// This method creates a binary tree from a given array (both contain int values).
		/// </summary>
		/// <param name="numbers"></param>
		/// <returns></returns>
		public static BinNode<int> Create(int[] numbers) {
			BinNode<int> root = null;

			if (numbers == null || numbers.Length == 0) return root;

			root = new BinNode<int>(numbers[0]);

			return CreateChildren(root, numbers, 0);
		}

		/// <summary>
		/// A helper (recursive) method which is used in <see cref="Create(int[])"/> in order to create a tree
		/// from the values in an array.
		/// </summary>
		/// <param name="tree"></param>
		/// <param name="numbers"></param>
		/// <param name="i"></param>
		/// <returns></returns>
		private static BinNode<int> CreateChildren(BinNode<int> tree, int[] numbers, int i) {
			int leftChildIndex = i * 2 + 1;
			int rightChildIndex = i * 2 + 2;

			if (leftChildIndex >= numbers.Length || rightChildIndex >= numbers.Length) return tree;

			if (numbers[leftChildIndex] != NoChild) {
				tree.SetLeft(new BinNode<int>(numbers[leftChildIndex]));
				CreateChildren(tree.GetLeft(), numbers, leftChildIndex);
			}

			if (numbers[rightChildIndex] != NoChild) {
				tree.SetRight(new BinNode<int>(numbers[rightChildIndex]));
				CreateChildren(tree.GetRight(), numbers, rightChildIndex);
			}

			return tree;
		}
	}
}
