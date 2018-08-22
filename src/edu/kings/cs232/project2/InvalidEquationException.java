package edu.kings.cs232.project2;

/**
 * Exception that occurs when user inputs an invalid form of an equation such as
 * one that is not in Reverse Polish Notation.
 * 
 * @author Andrea Siejna
 * @version 11.6.14
 * 
 */
public class InvalidEquationException extends Exception {

    /**
     * ID
     */
    private static final long serialVersionUID = 7221579275230739479L;

    /**
     * Constructor for the InvalidOperationException class
     * @param string 
     */
    public InvalidEquationException(String string) {
        super(string);
    }

}
