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

	
	
	public void delete(E item) {
		this.root= delete(this.root , item);
	}
	
	
	public Node<E> delete(Node<E> root, E item) {
		if(root == null) {
			return null;
		}
		
		if(item.compareTo(root.item)  < 0) {
			root.left = delete(root.left, item);
			return root;
		} else if(item.compareTo(root.item) > 0) {
			root.right = delete(root.right, item);
			return root;
		} else { //  I'm the one they want to get rid of ;_;
			if(root.left == null && root.right == null) {
				return null;
			} 
			else if(root.left != null && root.right == null) {
				return root.left;
			}
			else if(root.left == null && root.right != null) {
				return root.right;
			} else { // I have two kids
				
				if(root.left.right == null) {
					Node<E> pred = root.left;
					root.item = pred.item;
					root.left = pred.left;
					return root;
				}
				
				Node<E> parent = root.left;
				Node<E> pred = parent.right;
				while(pred.right != null) {
					pred = pred.right;
					parent = parent.right;
				}
				
				root.item = pred.item;
				parent.right = pred.left;
				return root;
			}
			
			
			
			
		}
	}
	
	
	/*
	// Change to E later
	public void delete(E item) {
		this.root = delete(root,item);

	}

	public Node<E> delete(Node<E> root, E item){
		if(root == null) {
			return root;
		}
		if(item.compareTo(root.item) < 0) {
			root = delete(root.left, item);

			return root;		
		}
		if(item.compareTo(root.item) > 0) {	
			root = delete(root.right, item);
			return root;		
		}

		else {	// the root of problems in the tree  is ... me ;_;
			// four cases
			// I am a leaf and have no children
			if(root.left == null && root.right == null) {
				return null;
			} 
			else if(root.left != null && root.right == null) {
				return root.left;
			} else if(root.left == null && root.right != null) {
				return root.right;
			} else {
				if(root.left.right == null) {
					root.item = root.left.item;
					root.left = root.left.left;
					return root;
				} 
				else {
					Node<E> parent = root.left;
					Node<E> pred = root.left.right;
					while(pred.right != null) {
						parent = parent.right;
						pred = pred.right;
					}
					root.item = pred.item;
					parent.right = pred.left;
					return root;
					// may hack delete pred.item, but doesn't work in chains of idenitcals

					// my hack: I break the tree for a bit;				
	
					// breaks in the following
					//tree.add(55);tree.add(20);tree.add(200);tree.add(1);tree.add(-1234);tree.add(17);tree.add(55);tree.add(55);tree.add(55);tree.delete(55);

				}


			}
			

		}


	}*/


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
		tree.add(55);
		tree.add(55);
		tree.add(55);
		tree.delete(55);
		tree.delete(55);

		System.out.println(tree);
		tree.delete(55);

		System.out.println(tree);
		tree.delete(55);
		System.out.println(tree);
		
	}

}
