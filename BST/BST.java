import java.util.NoSuchElementException;
/*
 * OpenDSA Project 
 * 
 * 
 */

// Unfinished Binary Search Tree implementation
class BST<E extends Comparable<E>> {
  protected BSTNode<E> root; // Root of the BST
  protected int nodecount; // Number of nodes in the BST

  // constructor
  BST() {
    root = null;
    nodecount = 0;
  }

  // Reinitialize tree
  public void clear() {
    root = null;
    nodecount = 0;
  }

  // Insert a record into the tree.
  // Records can be anything, but they must be Comparable
  // e: The record to insert.
  public void insert(E e) {
    root = inserthelp(root, e);
    nodecount++;
  }

  private BSTNode<E> inserthelp(BSTNode<E> rt, E e) {
    if (rt == null)
      return new BSTNode<E>(e);
    if (rt.element().compareTo(e) >= 0)
      rt.setLeft(inserthelp(rt.left(), e));
    else
      rt.setRight(inserthelp(rt.right(), e));
    return rt;

  }


  // Return the record with key value k, null if none exists
  // key: The key value to find
  public E find(E key) {
    return findhelp(root, key);
  }

  private E findhelp(BSTNode<E> rt, E key) {
    if (rt == null)
      return null;
    if (rt.element().compareTo(key) > 0)
      return findhelp(rt.left(), key);
    if (rt.element().compareTo(key) == 0)
      return rt.element();
    else
      return findhelp(rt.right(), key);

  }

  // Return the number of records in the dictionary
  public int size() {
    return nodecount;
  }


  // UNFINISHED METHODS BELOW THIS POINT**************************
  /**
   * Recursively calculate the number of nodes in this BST.
   */
  public int recursiveSize() {
    return nodeCount(root);
  }
    private int nodeCount(BSTNode<E> rt){
    int count = 0;
      if (rt == null){
         return 0;
      }
      else{
         count++;            
         nodeCount(rt.left());
         nodeCount(rt.right());
      }
      return count;
    }

    
  /**
   * Return the smallest element in the tree.
   */
  public E minElement() {
   if (root == null){
      throw new NoSuchElementException("Emptry tree");
   }
      BSTNode<E> current = root;
         while (current.left() != null){
            current = current.left();
         }
            return current.element();

         
  }

  /**
   * Return the largest element in the tree.
   */
  public E maxElement() {
    if (root == null){
      throw new NoSuchElementException("Empty tree");
    }
      BSTNode<E> current = root;
         while (current.right() != null){
            current = current.right();
         }
      return current.element();
  }

  /**
   * Return an ordered linked list containing all of the elements from the tree.
   */
  public LList<E> makeOrderedList() { 
   return inOrder(root);
  }

   public LList<E> inOrder(BSTNode<E> rt){ // recursive helper method
    LList<E> list = new LList<E>(nodecount);
      if (rt != null){
         inOrder(rt.left());
         list.append(rt.element());
         inOrder(rt.right());
       }
       return list;
   }
   
  /**
   * Return true if this BST actually has the BST property and false if it does
   * not.
   * 
   * (Note that this method would typically not be necessary. It a correctly
   * coded BST there will be no possibility of violating the BST property.)
   * 
   */
  public boolean isValidBST() {
   return isValid(root);
  }
   private boolean isValid(BSTNode<E> rt){
      if (rt == null){
         return true;
      }
      if ((rt.left() != null && rt.element().compareTo(rt.left().element()) < 0) || (rt.right() != null && rt.element().compareTo(rt.right().element()) > 0)){
         return true;
      }
      return isValid(rt.left()) && isValid(rt.right());
      
   }
 
}

