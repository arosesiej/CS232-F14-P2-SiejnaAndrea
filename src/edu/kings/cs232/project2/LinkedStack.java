package edu.kings.cs232.project2;

/**
 * Realization of a stack implemented as a singly linked list. All operations
 * are performed in constant time.
 *
 * @author Maria Jump
 *
 * @param <E>
 *            Type of data stored for this entry
 */
public class LinkedStack<E> implements Stack<E> {

    // ---------------- nested Node class ----------------
    /**
     * Node of a linked stack, which stores a reference to its element and
     * to the subsequent node in the list (or null if this is the last node).
     */
    protected static class Node<E> {

        /** The element stored at this node */
        private E element;

        /** A reference to the subsequent node in the list */
        private Node<E> next;

        /**
         * Creates a node with the given element and next node.
         *
         * @param e
         *            the element to be stored
         * @param n
         *            reference to a node that should follow the new node
         */
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        // Accessor methods
        /**
         * Returns the element stored at the node.
         * 
         * @return the element stored at the node
         */
        public E getElement() {
            return element;
        }

        /**
         * Returns the node that follows this one (or null if no such node).
         * 
         * @return the following node
         */
        public Node<E> getNext() {
            return next;
        }

        // Modifier methods
        /**
         * Sets the node's next reference to point to Node n.
         * 
         * @param n
         *            the node that should follow this one
         */
        public void setNext(Node<E> n) {
            next = n;
        }
    } // ----------- end of nested Node class -----------

    // instance variables of the LinkedStack
    /** The head node of the stack (or null if empty) */
    private Node<E> top;

    /** Number of nodes in the stack */
    private int size;

    /** Constructs an initially empty stack. */
    public LinkedStack() {
        top = null;
        size = 0;
    }

    /**
     * Returns the number of elements in the stack.
     * 
     * @return number of elements in the stack
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Tests whether the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
    	boolean isEmpty = false;
        
    	if (top == null || size == 0) {
    		isEmpty = true;
    	}
    	else {
    		isEmpty = false;
    	}
    	
    	return isEmpty;
    }

    /**
     * Inserts an element at the top of the stack.
     * 
     * @param element
     *            the element to be inserted
     */
    @Override
    public void push(E element) {
        top = new Node<>(element, top); // create and link a new node
        size++;
    }

    /**
     * Returns, but does not remove, the element at the top of the stack.
     * 
     * @return top element in the stack (or null if empty)
     */
    @Override
    public E top() {
        
    	E element = null;
    	
    	if (isEmpty()) {
    		element = null;
    	}
    	else {
    		element = top.element;
    	}
    	
    	return element;
    	
    }

    /**
     * Removes and returns the top element from the stack.
     * 
     * @return element removed (or null if empty)
     */
    @Override
    public E pop() {
    	
    	E removedTop = null;
        
    	if (isEmpty()) {
    		removedTop = null;
    	}
    	else{
    		removedTop = top.element;
    		top = top.getNext();
    		size--;
    	}
    	
    	return removedTop;
    	
    }

    /**
     * Produces a string representation of the contents of the stack. (ordered
     * from top to bottom)
     *
     * This exists for debugging purposes only.
     *
     * @return textual representation of the stack
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        Node<E> walk = top;
        while (walk != null) {
            sb.append(walk.getElement());
            if (walk.getNext() != null) {
                sb.append(", ");
            }
            walk = walk.getNext();
        }
        sb.append(")");
        return sb.toString();
    }
}
