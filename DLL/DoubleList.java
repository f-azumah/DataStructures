import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Doubly-linked list class (UNFINISHED).
 *
 * @Fiona Azumah
 *
 */
public class DoubleList<E> implements Iterable<E> {

  private Link<E> head; // Pointer to list header
  private Link<E> tail; // Pointer to last node
  private int listSize; // Size of list

  /**
   * Create an empty LList.
   */
   DoubleList() {
     clear();
   }

  /**
   * Return the element at the provided index. This method will iterate from the
   * head or the tail depending on which will require fewer steps.
   */
  public E get(int pos) {
    if (pos < 0 || pos >= listSize) {
      throw new IndexOutOfBoundsException();
    }

    if (pos < listSize / 2) {
      return forward(pos).element();
    } else {
      return backward(pos).element();
    }
  }

  /**
   * Helper method for iterating forward from the head.
   */
  private Link<E> forward(int pos) {
    Link<E> current = head.next();
    for (int i = 0; i < pos; i++) {
      current = current.next();
    }
    return current;
  }

  /**
   * Helper method for iterating backward from the tail.
   */
  private Link<E> backward(int pos) {
    Link<E> current = tail.prev();
    for (int i = 0; i < (listSize - 1) - pos; i++) {
      current = current.prev();
    }
    return current;
  }

  /**
   * Remove the provided link from the list.
   */
  private void removeHelper(Link<E> link) {
    Link<E> prev = link.prev();
    Link<E> next = link.next();
    prev.setNext(link.next());
    next.setPrev(link.prev());
    listSize--;

  }

  /**
   * Return the number of elements stored in the list.
   */
  public int size() {
    return listSize;
  }
  

/****************** COMPLETE the following 5 methods **********************************/


/**
   * Remove all elements in this list.
   */
  public void clear() {
    tail = new Link<E>(null,null);
    head = new Link<E>(null,tail); 
             
    tail.setPrev(head);
    listSize = 0;
   } 
  /**
   * Append item to the end of the list.
   */
   public void append(E item) {
    Link<E> newLink = new Link<E>(item, null, null); 
    newLink.setNext(tail);
    newLink.setPrev(tail.prev());
    tail.prev().setNext(newLink);
    tail.setPrev(newLink);
    listSize++;
   }
     
 
  /**
   * Add the item at the specified index.
   */
  public void add(int index, E item) {
      Link<E> current;
      if (index < 0 || index > size()){
         throw new IndexOutOfBoundsException("Invalid index: " + index);
      }
      else if (index == size()-1){
      Link<E> newLink = new Link<E>(item, tail.prev(), tail);
         tail.prev().setNext(newLink);
         tail.setPrev(newLink);
         tail = newLink;
         listSize++;;
      }
      else {
        current = forward(index); 
        Link<E> link = new Link<E>(item, current.prev(), current);
        current.prev().setNext(link);
        current.setPrev(link);
        listSize++;
        
      }  
  }

  /**
   * Remove and return the item at the specified index.
   */
  public E remove(int index) {
   Link <E> current;
   E el = get(index);
  
   if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index + " does not exist");
   }
   else if (index >= 0 && index <= size()/2){
      current = forward(index);
      current.prev().setNext(current.next());
      current.next().setPrev(current.prev());
      listSize--;
   }
   else if (index > size()/2){
      current = backward(index);
      current.prev().setNext(current.next());
      current.next().setPrev(current.prev());
      listSize--;
   }     
    return el;
  }

  /**
   * Reverse the list
   */
  public void reverse() {
    Link<E> current = head.next();
    while (current != null){
      current.setNext(current.prev());
      current.setPrev(current.next());
      current = current.next();     
    } 
    head.setNext(tail.prev());
    tail.setPrev(head.next());
  }

/******************** Your methods ENDS here ***********************/


  /**
   * Iterates forward through the list. Remove operation is supported.
   */
  @Override
  public Iterator<E> iterator() {
    return new DoubleIterator();
  }
  
  private class DoubleIterator implements Iterator<E> {

    private Link<E> current;
    private boolean canRemove;

    public DoubleIterator() {
      current = head;
      canRemove = false;
    }

    @Override
    public boolean hasNext() {
      return current.next() != tail;
    }

    @Override
    public E next() {
      if (hasNext()) {
        current = current.next();
        canRemove = true;
        return current.element();
      } else {
        throw new NoSuchElementException();
      }
    }

    @Override
    public void remove() {
      if (!canRemove) {
        throw new IllegalStateException();
      }
      removeHelper(current);
      canRemove = false;
    }

  }

}
