/**
 * Binary search tree implementation.
 * 
 * We do not allow duplicates.
 * 
 * @author Greg Gagne
 */
import java.util.Iterator;

import bridges.base.BSTElement;

public class BinarySearchTree <K extends Comparable<? super K>> implements SearchTreeInterface<K> 
{
	// the root of the binary search tree
	private BSTElement<K, String> root;

	/**
	 * Create an empty binary search tree
	 */
	public BinarySearchTree() {
		root = null;
	}

	/**
	 * This method has nothing to do with a binary search tree,
	 * but is necessary to provide the bridges visualization.
	 */
	public BSTElement<K, String> getRoot() {
		return root;
	}

	public boolean isEmpty() {
		/* TO BE COMPLETED */

		return false;
	}

	/**
	 * Solution that uses recursive helper method.
	 * We disallow duplicate elements in the tree. 
	 */
	public K add(K key) {
		if (contains(key))
			return null;
		else {
			root = add(key, root);

			return key;
		}
	}


	/**
	 * private helper method for adding a node to the binary search tree
	 * @param key
	 * @param subtree
	 * @return the root of the tree
	 */
	private BSTElement<K, String> add(K key, BSTElement<K,String> subtree) {
		if (subtree == null) {
			// we have found the spot for the addition

			// create the new node
			// parameters are (1) label (2) key (3) empty string [not used]
			BSTElement<K, String> newNode = new BSTElement<K, String>(key.toString(), key, "");

			// we also set the color of a new node to red
			newNode.getVisualizer().setColor("red");

			return newNode;
		}

		int direction = key.compareTo(subtree.getKey());

		if (direction < 0) {
			subtree.setLeft( add(key, subtree.getLeft()) );
		}
		else if (direction > 0) {
			subtree.setRight( add(key, subtree.getRight()) );
		}

		return subtree;
	}


	/**
	 * Non-recursive algorithm for addition
	 * This only serves the purpose of demonstrating the
	 * differences between the recursive and non-recursive approaches.
	 */
	/*
	public K add(K key) {
		// we disallow duplicates
		if (contains(key))
			return null;

		// create the new node
		// parameters are (1) label (2) key (3) null [not used]
		BSTElement<K, String> newNode = new BSTElement<K, String>(key.toString(), key, "");
		newNode.getVisualizer().setColor("red");

		// if the tree is empty, set the root to the new node
		if (isEmpty()) {
			root = newNode;
		}
		else {
			// else treat it like an unsuccessful search
			BSTElement<K, String> node = root;
			boolean keepLooking = true;

			while (keepLooking) {
				int direction = key.compareTo(node.getKey());

				if (direction < 0) {
					// go left
					if (node.getLeft() == null) {
						// we found the place for the insert
						node.setLeft(newNode);
						keepLooking = false;
					}
					else
						node = node.getLeft();
				}
				else if (direction > 0) {
					// go right
					if (node.getRight() == null) {
						// we found the place for the insert
						node.setRight(newNode);
						keepLooking = false;
					}
					else
						node = node.getRight();
				}
			}
		}

		return key;
	}
	 */

	public K getLargest() {
		/* TO BE COMPLETED */

		return null;
	}

	public K getSmallest() {
		/* TO BE COMPLETED */

		return null;
	}

	public boolean contains(K key) {		
		/* TO BE COMPLETED */

		return false;
	}

	public K remove(K key) {
		/* TO BE COMPLETED */

		return null;
	}

	public int size() {
		/* TO BE COMPLETED */

		return -1;
	}

	public Iterator<K> iterator() {
		/* TO BE COMPLETED */

		return null;
	}
}
