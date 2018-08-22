package edu.kings.cs232.project2;

/**
 * Exception that occurs when user inputs an invalid form of a number such as
 * one that is not a proper base (b, o, h, d).
 * 
 * @author Andrea Siejna
 * @version 11.6.14
 * 
 */

public class InvalidNumberFormatException extends RuntimeException {

    /**
     * ID
     */
    private static final long serialVersionUID = 2525900782706581630L;

    /**
     * Constructor for the NoSuchTextException class
     * @param string 
     */
    public InvalidNumberFormatException(String string) {
        super(string);
    }



}
