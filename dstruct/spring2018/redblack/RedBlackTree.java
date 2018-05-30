package redblack;
/*
 * Updated 11/2
 * 
 * I will update with more comments
 * 
 * Your assignment is to program a Red-Black Binary tree
 * Details of the construction can be found here
 * http://en.wikipedia.org/wiki/Red%E2%80%93black_tree


 * I only care about the add method
 * So this means:
 * - Tree Insertion  **
 * - 5 Methods to conform to the red black rules
 * - Rotate Left **
 * - Rotate Right **
 * 
 * 
 * I reccomend working on tree insertion and rotate first, as those can be tested without the red black properties
 * 
 * 
 * RULES
 * 1) Nodes are Red or Black 
 * 2) The root is black.
 * 3) Nodes point to null children by default, and null is counted as black.  These nulls are leaves
 * 4) Both children of every red node are black.
 * 5) Every simple path from a given node to any of its descendant leaves contains the same number of black nodes.
 */


public class RedBlackTree<E extends Comparable<? super E>> {



	private Node<E> root;


	//Constructor
	//Provided:  Sets up an empty tree
	public RedBlackTree() {
		root = null;
	}


	// Insertion starts with binary insertion of a new red node and then adjusting the tree to make sure none of the rules are violated
	// Adjustments are handled by the insert case methods, as the rules are threatened only under certain conditions.
	// These conditions are discussed in detail below
	// The insertion cases start with the node we are currently inserting
	// but they can recursively apply to other nodes up the tree.
	public void insert(E e) {
		Node<E> node;
	}
	
	
	
	public E delete(E e) {
		return null;
	}

	
	// http://en.wikipedia.org/wiki/Tree_rotation
	private void rotateRight(Node<E> n) {

	}
	
	// http://en.wikipedia.org/wiki/Tree_rotation
	private void rotateLeft(Node<E> n) {

	}
	
	
	
	//On insertion: 
	/*
	 * Rules 1 and 3 describe the tree and thus are always true
	 * Rule 2 (root is black) can only be broken by when a red node becomes the root
	 * Rule 4 (red nodes only have black children) can be violated by adding a red node, changing a black node to a red node, and by rotating the tree
	 * Rule 5 (all paths from x to it's leaves have same number of black nodes) is only compromised by adding black node, switching a red to a black, and rotation
	 * 
	 * All the cases below concern adding the the red node n to the tree
	 */
	
	
	// Your first case check to see if the node is the root
	// A node is the root if it has no parent.
	// if your node is root, then we've gone all the way to the top 
	// and the only thing left is to make sure the root is black	
	// else the node is not the root, so we need to do more checks
	private void insertCase1(Node<E> n) {
	}

	
	// If our parent is black, then we're good
	// as black nodes can have red children
	// Otherwise, our parent must be red, which is a problem
	private void insertCase2(Node<E> n) {
	}

	// Okay, our parent is red and so our we.  Reds can't have red children
	// If I change to black, I change the number of black nodes in paths for my area, so that's not good. We can't do that.
	// So what to do?
	// If my parent is red and so is my uncle, 
	//	we can change them to black and my grandparent to red.
	// Because they both change to black, then the number black nodes from my grandparent down is consistent. 
	// However, because I changed my grandparent to red, we may have changed the root to red or changed the child of a red node to red
	// So we have to start over the cases with the grandparent as n
	// But if my uncle isn't red, we have to try something else
	private void insertCase3(Node<E> n) {

	}
	
	// Something else is rotating around my parent and recoloring
	// Which rotation is accomplished depends on which child is being rotated.
	// Then go to case 5
	private void insertCase4(Node<E> n) {

	}
	
	// More rotation and we're done
	private void insertCase5(Node<E> n) {

	}
	
	

	private void deleteCase1(Node<E> n) {

	}

	private void deleteCase2(Node<E> n) {

	}

	private void deleteCase3(Node<E> n) {

	}

	private void deleteCase4(Node<E> n) {

	}

	private void deleteCase5(Node<E> n) {

	}

	private void deleteCase6(Node<E> n) {

	}

	private static  class Node<E>{
		private boolean isBlack;
		private Node<E> left;
		private Node<E> right;
		private E data;

	}

}
