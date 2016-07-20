package org.learn.Client;

import org.learn.Question.IsomorphicBinaryTree;
import org.learn.Question.Node;

public class App 
{
	public static void main( String[] args )
    {		
		Node tree1 = Node.createNode(50);
		tree1.left = Node.createNode(30);
		tree1.right = Node.createNode(30);
		// left sub tree
		tree1.left.left = Node.createNode(40);
		tree1.left.right = Node.createNode(10);

		// right subtree
		tree1.right.left = Node.createNode(30);
		tree1.right.right = Node.createNode(60);
		
		Node tree2 = Node.createNode(10);
		tree2.left = Node.createNode(40);
		tree2.right = Node.createNode(20);
		// left sub tree
		tree2.left.left = Node.createNode(50);
		tree2.left.right = Node.createNode(15);

		// right subtree
		tree2.right.left = Node.createNode(70);
		tree2.right.right = Node.createNode(60);

		boolean isSame = IsomorphicBinaryTree.isIsomorphicBinaryTree(tree1, tree2);
		if(isSame) {
			System.out.println("Binary trees are Isomorphic");
		} else {
			System.out.println("Binary trees are not Isomorphic");
		}
    }
}
