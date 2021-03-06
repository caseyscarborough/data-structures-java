/**
 * Holds the current position of a LinkedList object.
 * @author Casey Scarborough
 * @version 1.0.1
 * @since 2013-05-04
 * @see LinkedList, Node
 */
class LinkedListIterator {
	/**
	 * Constructor for the list iterator.
	 * @param n any node in the list
	 */
	LinkedListIterator(Node n) {
		current = n;
	} 

	/**
	 * Test if the position is valid.
	 * @return true if the current position is valid
	 */
	public boolean isValid() {
		return current != null;
	}

	/**
	 * Retrieve data from the list.
	 * @return the data if the position is valid, otherwise null
	 */
	public Object retrieve() {
		return isValid() ? current.data : null;
	}

	/**
	 * Advance to the next node in the list.
	 */
	public void advance() {
		if (isValid()) {
			current = current.next;
		}
	}

	Node current;
}