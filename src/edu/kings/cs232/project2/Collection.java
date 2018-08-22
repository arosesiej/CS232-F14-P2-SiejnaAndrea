package edu.kings.cs232.project2;

/**
 * Generic interface for any ADT which contains a collection of objects. This serves as the superinterface of nearly
 * every data structure developed over the year.
 * 
 * @author Matthew Hertz
 */
public interface Collection {
  /**
   * Return the number of elements in the collection.
   * 
   * @return Number of elements in the collection.
   */
  public int size();

  /**
   * Return whether the collection is empty.
   * 
   * @return True if the collection is empty, false otherwise.
   */
  public boolean isEmpty();
}
