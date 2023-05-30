using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MOE.BinNode.Scan {

	/// <summary>
	/// This class contains utility methods which scan a binary tree.
	/// </summary>
	public class Scan {

		/// <summary>
		/// Scan the tree with the given root with a pre-order scan<br/>
		/// (Parent, Left child, Right child)
		/// </summary>
		/// <typeparam name="T"></typeparam>
		/// <param name="root"></param>
		public static void PreOrderScan<T>(BinNode<T> root) {
			if (root == null) return;

			Console.Write($"{root.GetValue()},");
			PreOrderScan<T>(root.GetLeft());
			PreOrderScan<T>(root.GetRight());
		}

		/// <summary>
		/// Scan the tree with the given root with an in-order scan<br/>
		/// (Left child, Parent, Right child)
		/// </summary>
		/// <typeparam name="T"></typeparam>
		/// <param name="root"></param>
		public static void InOrderScan<T>(BinNode<T> root) {
			if (root == null) return;

			InOrderScan<T>(root.GetLeft());
			Console.Write($"{root.GetValue()},");
			InOrderScan<T>(root.GetRight());
		}

		/// <summary>
		/// Scan the tree with the given root with a post-order scan<br/>
		/// (Left child, Right child, Parent)
		/// </summary>
		/// <typeparam name="T"></typeparam>
		/// <param name="root"></param>
		public static void PostOrderScan<T>(BinNode<T> root) {
			if (root == null) return;

			PostOrderScan<T>(root.GetLeft());
			PostOrderScan<T>(root.GetRight());
			Console.Write($"{root.GetValue()},");
		}
	}
}
