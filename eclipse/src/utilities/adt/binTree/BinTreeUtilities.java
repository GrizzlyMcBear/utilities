package utilities.adt.binTree;

import utilities.adt.moe.BinTreeNode;

public class BinTreeUtilities {
	
	public static void main(String[] args) {
		BinTreeNode<Integer> currTree = createSpecificBinTree();
		System.out.println("Pre-Order:");
		printPreOrder(currTree);
		System.out.println("\n");
		System.out.println("In-Order:");
		printInOrder(currTree);
		System.out.println("\n");
		System.out.println("Post-Order:");
		printPostOrder(currTree);
	}
	
	public static BinTreeNode<Integer> createSpecificBinTree() {
		BinTreeNode<Integer> l6n1 = new BinTreeNode<Integer>(1);
		BinTreeNode<Integer> l6n2 = new BinTreeNode<Integer>(2);
		
		BinTreeNode<Integer> l5n1 = new BinTreeNode<Integer>(l6n1, 3, l6n2);
		BinTreeNode<Integer> l5n2 = new BinTreeNode<Integer>(4);
		
		BinTreeNode<Integer> l4n1 = new BinTreeNode<Integer>(l5n1, 5, null);
		BinTreeNode<Integer> l4n2 = new BinTreeNode<Integer>(6);
		BinTreeNode<Integer> l4n3 = new BinTreeNode<Integer>(null, 7, l5n2);
		BinTreeNode<Integer> l4n4 = new BinTreeNode<Integer>(8);
		
		BinTreeNode<Integer> l3n1 = new BinTreeNode<Integer>(9);
		BinTreeNode<Integer> l3n2 = new BinTreeNode<Integer>(l4n1, 10, l4n2);
		BinTreeNode<Integer> l3n3 = new BinTreeNode<Integer>(11);
		BinTreeNode<Integer> l3n4 = new BinTreeNode<Integer>(l4n3, 12, l4n4);
		
		BinTreeNode<Integer> l2n1 = new BinTreeNode<Integer>(l3n1, 13, l3n2);
		BinTreeNode<Integer> l2n2 = new BinTreeNode<Integer>(l3n3, 14, l3n4);
		
		BinTreeNode<Integer> l1n1 = new BinTreeNode<Integer>(l2n1, 15, l2n2);
		
		return l1n1;
	}

	/**
	 * This method prints the given tree using a <b>Pre-Order</b> scan:</br>
	 * 	<ol>
	 * 		<li>The <b>root</b> of the sub-tree.</li>
	 * 		<li>The <b>left</b> sub-tree.</li>
	 * 		<li>The <b>right</b> sub-tree.</li>
	 * 	</ol>
	 * @param tree
	 */
	public static void printPreOrder(BinTreeNode<Integer> tree) {
		if (tree != null)
			System.out.print(String.format("%s, ", tree.getValue().toString()));
		
		if (tree.hasLeft())
			printPreOrder(tree.getLeft());
		
		if (tree.hasRight())
			printPreOrder(tree.getRight());
	}
	
	/**
	 * This method is almost the same as {@link BinTreeUtilities#printPreOrder(BinTreeNode)} only with slightly different implementation.
	 * @param tree
	 */
	public static void printPreOrder2(BinTreeNode<Integer> tree) {
		if (tree != null) {
			System.out.print(String.format("%s, ", tree.getValue().toString()));
			printPreOrder(tree.getLeft());
			printPreOrder(tree.getRight());
		}
	}
	
	/**
	 * This method prints the given tree using an <b>In-Order</b> scan:</br>
	 * 	<ol>
	 * 		<li>The <b>left</b> sub-tree.</li>
	 * 		<li>The <b>root</b> of the sub-tree.</li>
	 * 		<li>The <b>right</b> sub-tree.</li>
	 * 	</ol>
	 * @param tree
	 */
	public static void printInOrder(BinTreeNode<Integer> tree) {
		if (tree.hasLeft())
			printInOrder(tree.getLeft());
		
		if (tree != null)
			System.out.print(String.format("%s, ", tree.getValue().toString()));
		
		if (tree.hasRight())
			printInOrder(tree.getRight());
	}
	
	/**
	 * This method is almost the same as {@link BinTreeUtilities#printInOrder(BinTreeNode)} only with slightly different implementation.
	 * @param tree
	 */
	public static void printInOrder2(BinTreeNode<Integer> tree) {
		if (tree != null) {
			printInOrder(tree.getLeft());
			System.out.print(String.format("%s, ", tree.getValue().toString()));
			printInOrder(tree.getRight());
		}
	}
	
	/**
	 * This method prints the given tree using a <b>Post-Order</b> scan:</br>
	 * 	<ol>
	 * 		<li>The <b>left</b> sub-tree.</li>
	 * 		<li>The <b>right</b> sub-tree.</li>
	 * 		<li>The <b>root</b> of the sub-tree.</li>
	 * 	</ol>
	 * @param tree
	 */
	public static void printPostOrder(BinTreeNode<Integer> tree) {
		if (tree.hasLeft())
			printPostOrder(tree.getLeft());
		
		if (tree.hasRight())
			printPostOrder(tree.getRight());

		if (tree != null)
			System.out.print(String.format("%s, ", tree.getValue().toString()));
	}
	
	/**
	 * This method is almost the same as {@link BinTreeUtilities#printPostOrder(BinTreeNode)} only with slightly different implementation.
	 * @param tree
	 */
	public static void printPostOrder2(BinTreeNode<Integer> tree) {
		if (tree != null) {
			printPostOrder(tree.getLeft());
			printPostOrder(tree.getRight());
			System.out.print(String.format("%s, ", tree.getValue().toString()));
		}
	}
}
