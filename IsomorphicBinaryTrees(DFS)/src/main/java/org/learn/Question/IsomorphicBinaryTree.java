package org.learn.Question;

public class IsomorphicBinaryTree {

	public static boolean isIsomorphicBinaryTree(Node tree1, Node tree2) {

		if (tree1 == null && tree2 == null) {
			return true;
		}

		if (tree1 == null || tree2 == null) {
			return false;
		}

		if (false == isIsomorphicBinaryTree(tree1.left, tree2.left))
			return false;

		if (false == isIsomorphicBinaryTree(tree1.right, tree2.right))
			return false;

		return true;
	}
}
