public class LinkedList implements List {
	// reference to the head of the linked list
	private Node head;

	// number of elements in the list
	private int numberOfElements;

	public LinkedList() {
		head = null;
	}

	/** 
	 * Inner class representing a node in the linked list
	 */

	private class Node
	{
		private Object data;
		private Node next;

		private Node(Object data) {
			this(data,null);
		}

		private Node (Object data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	// Methods

	@Override
	public void add(Object item) {

		// adds (appends) an item to the rear of the list

		Node newNode = new Node(item);
		Node current = head;

		if (isEmpty()) {
			// special case - first element being added to the list
			head = newNode;
		}
		else {
			while (current.next != null) {
				current = current.next;
			}

			// current now references the last item in the list
			current.next = newNode;
		}

		newNode.next = null;
		++numberOfElements;
	}

	@Override
	public boolean add(Object item, int index) {
		// TO DO
		
		return false;
	}

	@Override
	// Tells us if the current item is found 
	// inside the linked list and returns it
	public boolean contains(Object item) {
		Node current = head;
		boolean found = false;

		while (current != null && !found) {
			if (current.data.equals(item)) {
				found = true;
			}

			current = current.next;
		}

		return found;

	}

	@Override
	// This method returns the data in the specified position
	public Object get(int index) {
		Node current = head;
		
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		if (current == null) {
			return null;
		}
		
		return current.data;
	}

	@Override
	public boolean remove(Object item) {
		// TO DO

		return false;
	}

	@Override
	public Object remove(int index) {
		Object rv = null;

		if (isEmpty() || index >= numberOfElements) {
			rv = null;
		}
		else if (index == 0) {
			// special case - first element in the list
			rv = head.data;
			head = head.next;
			numberOfElements--;
		}
		else {
			int currentIndex = 0;
			Node current = head;

			while (currentIndex < (index - 1)) {
				current = current.next;
				currentIndex++;
			}

			// current references the node we want to remove
			rv = current.next.data;
			current.next = current.next.next;
			numberOfElements--;
		}

		return rv;
	}

	@Override
	// This method will return false if the list is empty
	public int getLength() {
		int length = 0;
		Node current = head;

		while (current != null) {
			length ++;
			
			current = current.next;
		}

		return length;
	}

	@Override
	// Tells you if there are no objects in the list
	public boolean isEmpty() {
		if (numberOfElements == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	// Tells you the number of times the object occurs
	public int getFrequency(Object item) {
		int count = 0;
		Node current = head;

		while (current != null) {
			if (current.data .equals(item)) {
				count ++;
			}
			current = current.next;
		}

		return count;
	}

	@Override
	// Makes the list inaccessible (Clears it)
	public void clear() {
		head = null;
		numberOfElements = 0;
	}

}
