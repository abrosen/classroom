package trees;

public class BinaryTree<E extends Comparable<E>> {

	private Node<E> root;
	private E returnVal;
	private int size;

	
	public BinaryTree() { 
		this.size = 0;
	}



	public boolean add(E item) {
		this.root = add(this.root, item);
		size++;
		return true;
	}

	public boolean contains(E item) {
		return contains(this.root, item);
	}

	public boolean contains(Node<E> root, E item) {
		if(root==null) {
			return false;
		}

		if(item.compareTo(root.item) == 0) {
			return true;
		} else if(item.compareTo(root.item) < 0) {
			return contains(root.left, item);
		} else {
			return contains(root.right, item);
		}
	}


	public int size() {
		return size(root);
	}

	public int size(Node<E> root) {
		if(root== null) {
			return 0;
		}
		int leftSize = size(root.left);
		int rightSize= size(root.right);
		int mySize  = 1;

		return leftSize +rightSize + mySize;

	}

	private Node<E> add(Node<E> root, E item) {
		if(root == null) {
			return new Node<E>(item);
		}
		else if(item.compareTo(root.item) <= 0 ) { // item is < what's in root
			root.left = add(root.left, item);
			return root;
		} /*else if(item.compareTo(root.item) == 0 ) {

		}*/ else { // item is > what's in root
			root.right = add(root.right, item);
			return root;
		}

	}

	//public String toString() {
	//	return toString(this.root);
	//}




	public void delete(E item) {
		this.root = delete(this.root, item);
	}


	public Node<E> delete(Node<E> root, E item) {
		if(root == null) {
			return null;
		}

		if(item.compareTo(root.item) < 0 ) {
			root.left = delete(root.left, item);
			return root;
		}
		else if(item.compareTo(root.item) > 0 ) {
			root.right = delete(root.right, item);
			return root;
		} else {  // the node holding the item we want to get rid of is me

			if(root.left  == null && root.right == null) {
				return null;
			} else if(root.left != null && root.right == null) {
				return root.left;

			} else if(root.left == null && root.right != null) {
				return root.right;
			} else {
				if(root.left.right == null) {
					Node<E> pred = root.left;
					pred.right = root.right;
					return pred;
				} else {

					Node<E> parent = root.left;
					Node<E> pred = parent.right;
					while(pred.right != null) {
						pred = pred.right;
						parent= parent.right;
					}

					root.item = pred.item;
					parent.right = pred.left;
					return root;
				}
			}


		}

	}


	public String toString() {
		StringBuilder sb = new StringBuilder();
		preOrderTraverse(root, 1, sb);
		return sb.toString();
	}


	private void preOrderTraverse(Node<E> root, int depth, StringBuilder sb) {
		for (int i = 1; i < depth; i++) {
			sb.append("  "); // indentation
		}
		if (root == null) {
			sb.append("null\n");
		} else {
			sb.append(root.toString());
			sb.append("\n");
			preOrderTraverse(root.left, depth + 1, sb);
			preOrderTraverse(root.right, depth + 1, sb);
		}
	}






	public String toString(Node<E> root) {
		if(root == null) {
			return "";
		}

		String leftSide = toString(root.left);
		String rightSide = toString(root.right);
		String mySide = root.item.toString();

		return  mySide +"\n" +leftSide +"\n" + rightSide;

	}











	public static void main(String[] args) {

		BinaryTree<String> tree = new BinaryTree<String>();
		tree.add("Hello");
		tree.add("world");
		tree.add("dog");
		tree.add("cat");
		tree.add("ant");
		tree.add("bird");
		tree.add("a");
		tree.add("B");
		tree.add("C");
		tree.add("A");
		tree.delete("Hello");
		System.out.println(tree);


	}

}










