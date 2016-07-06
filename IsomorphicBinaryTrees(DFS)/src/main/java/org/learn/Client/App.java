package org.learn.Client;

import org.learn.Question.IsomorphicBinaryTree;
import org.learn.Question.Node;

public class App 
{
	public static void main( String[] args )
    {		
		Node tree1 = Node.createNode(100);
		tree1.left = Node.createNode(20);
		tree1.right = Node.createNode(115);
		// left sub tree
		tree1.left.left = Node.createNode(170);
		tree1.left.right = Node.createNode(140);

		// right subtree
		tree1.right.left = Node.createNode(30);
		tree1.right.right = Node.createNode(40);
		
		Node tree2 = Node.createNode(200);
		tree2.left = Node.createNode(100);
		tree2.right = Node.createNode(50);
		// left sub tree
		tree2.left.left = Node.createNode(99);
		tree2.left.right = Node.createNode(101);

		// right subtree
		tree2.right.left = Node.createNode(30);
		tree2.right.right = Node.createNode(40);

		boolean isSame = IsomorphicBinaryTree.isIsomorphicBinaryTree(tree1, tree2);
		if(isSame) {
			System.out.println("Binary Trees are Isomorphic");
		} else {
			System.out.println("Binary Trees are not Isomorphic");
		}
    }
}
