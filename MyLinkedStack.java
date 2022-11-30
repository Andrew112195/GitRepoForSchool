
public class MyLinkedStack<E>{

	//initialization of head tail generic data as well as the size integer amount of the structure
	Node<E> head, tail;
	private int size;
	
	/*
	 * method for adding an element to the end of the linked stack structure
	 */
	public void push(E data) {
		
		Node<E> newNode = new Node<>(data); 
	    if (tail == null) {
	      head = tail = newNode; 
	    }
	    else {
	      tail.next = newNode; 
	      tail = newNode; 
	    }
	    size++; 
	}
	/*
	 * method for returning the value of a specified element in the linked stack
	 */
	public E getNode(int index) {
		Node<E> node = head;
		if(head == null) {
			return null;
		}
		for(int i =0; i <= index; ++i) {
			if(i == index) {
				return node.data;
			}
				node = node.next;
			}
		return null;
		}
	
	public int sizeOf() {
		return size;
	}
	public boolean isEmpty() {	
		if(size == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	/*
	 * will remove and return the value of the last element of the linked stack
	 */
	public E pop() {
		if (size == 0) {
		      return null;
		    }
		    else if (size == 1) {
		      E temp = head.data;
		      head = null;
		      tail = null;
		      size = 0;
		      return temp;
		    }
		    else {
		      Node<E> current = head;
		      for (int i = 0; i < size - 2; i++) {
		        current = current.next;
		      }
		      E temp = tail.data;
		      tail = current;
		      tail.next = null;
		      size--;
		      return temp;
		    }
		  }	
	/*
	 * method for making linked stack into string with brackets and commas for user readability
	 */
	 public String toString() {
		    StringBuilder result = new StringBuilder("[");
		    Node<E> current = head;
		    if (head == null){
		    	return "Empty";
		    }
		    for (int i = 0; i < size; i++) {
		      result.append(current.data);
		      current = current.next;
		      if (current != null) {
		        result.append(", "); 
		      }
		      else {
		        result.append("]"); 
		      }
		    }
		    return result.toString();
		  }
	 /*
	  * method for peeking at last element in linked stack
	  */
	  public E peek() {
		    if (size == 0) {
		      return null;
		    }
		    else {
		      return tail.data;
		    }
		  }
	}

