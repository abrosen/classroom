package treeEvening;

public class BinaryTree<E extends Comparable<E>> {
	
	private Node<E> root;
	private int size;
	
	
	public BinaryTree() {
		this.size = 0;
	}
	
	
	public boolean contains(E item) {
		return contains(this.root, item);
	}
	
	private boolean contains(Node<E> root, E item) {
		if(root == null) {
			return false;
		}
		int compareResult = item.compareTo(root.item);
		if(compareResult == 0) {
			return true;
		} else if(compareResult < 0) {
			return contains(root.left, item);
		} else {
			return contains(root.right, item);
		}
		
	}
	
	
	public boolean add(E item) {
		this.root = add(this.root, item);
		size++;
		return true;
	}
	
	public int size() {
		return size(root);
	}
	
	private int size(Node<E> root) {
		if(root == null) {
			return 0;
		}
		int leftSize = size(root.left);
		int rightSize = size(root.right);
		return leftSize + 1 + rightSize;
		
	}
	
	
	private Node<E> add(Node<E> root, E item) {
		if(root == null) {
			return new Node<E>(item);
		}
		if(item.compareTo(root.item) <= 0  ) {
			root.left = add(root.left, item);
			return root;
		} else {
			root.right = add(root.right, item);
			return root;
		}		
	}
	
	public String toString() {
		return toString(root);
	}
	
	public String toString(Node<E> root) {
		if(root == null) {
			return "";
		}
		
		return toString(root.left) + " " + root 
				+ " " + toString(root.right);
	}
	
	
	public static void main(String[] args) {
		BinaryTree<Integer> tree =  new BinaryTree<Integer>();
		tree.add(55);
		tree.add(20);
		tree.add(200);
		tree.add(1);
		tree.add(-1234);
		tree.add(17);
		System.out.println(tree);
	}
	
}
