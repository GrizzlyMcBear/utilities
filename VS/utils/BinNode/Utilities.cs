using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MOE.BinNode {
	public class Utilities {

		public static void PreOrderScan<T>(BinNode<T> root) {
			if (root == null) return;

			Console.Write($"{root.GetValue()},");
			PreOrderScan<T>(root.GetLeft());
			PreOrderScan<T>(root.GetRight());
		}
		public static void InOrderScan<T>(BinNode<T> root) {
			if (root == null) return;

			InOrderScan<T>(root.GetLeft());
			Console.Write($"{root.GetValue()},");
			InOrderScan<T>(root.GetRight());
		}
		public static void PostOrderScan<T>(BinNode<T> root) {
			if (root == null) return;

			PostOrderScan<T>(root.GetLeft());
			PostOrderScan<T>(root.GetRight());
			Console.Write($"{root.GetValue()},");
		}
		/// <summary>
		/// Builds a binary tree by the given pre-order and in-order scans
		/// </summary>
		/// <remarks>Not finished yet!</remarks>
		/// <typeparam name="T"></typeparam>
		/// <param name="preOrder"></param>
		/// <param name="inOrder"></param>
		/// <returns></returns>
		public static BinNode<T> BuildTreeByPreAndIn<T>(string preOrder, string inOrder) {
			int[] preOrderValues = GetIntValues(preOrder.Split(','));
			int[] inOrderValues = GetIntValues(inOrder.Split(','));

			return null;
		}
		private static int[] GetIntValues(string[] values) {
			int[] result = new int[values.Length];

			for (int q = 0; q < result.Length; q++) {
				result[q] = int.Parse(values[q]);
			}

			return result;
		}
	}
}
