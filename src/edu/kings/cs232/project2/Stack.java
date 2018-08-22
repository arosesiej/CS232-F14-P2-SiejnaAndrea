package edu.kings.cs232.project2;

/**
 * A collection of objects that are inserted and removed according to the
 * last-in first-out principle. Although similar in purpose, this interface
 * differs from java.util.Stack.
 * 
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 * @author Maria Jump
 * @param <E>
 *            Type of data stored for this entry
 */
public interface Stack<E> extends Collection {

    /**
     * Inserts an element at the top of the stack.
     * 
     * @param e
     *            The element to be inserted.
     */
    void push(E e);

    /**
     * Returns, but does not remove, the element at the top of the stack.
     * 
     * @return top element in the stack (or null if empty)
     */
    E top();

    /**
     * Removes and returns the top element from the stack.
     * 
     * @return element removed (or null if empty)
     */
    E pop();
}
