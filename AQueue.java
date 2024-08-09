class AQueue<E> implements Queue<E> {

  // Keep this non-private for testing purposes!
  E queueArray[]; // Array holding queue elements

  private static final int defaultSize = 10;
  private int front; // Index of front element
  private int size; // Number of elements stored.


  // Constructors
  @SuppressWarnings("unchecked") // Generic array allocation
  AQueue(int capacity) {
    //COMPLETE THIS
    front = 0;// Initialize front and size variable to 0
    size = 0;
    queueArray = (E[]) new Object[capacity]; // Create queueArray with capacity as the size of the array

  }


  AQueue() {
    this(defaultSize);
  }

  // Reinitialize the entire queue to be empty
  public void clear() {
  front = 0;
  size = 0;
    for (int i = 0; i < queueArray.length; i++){
    queueArray[i] = null;
    }
  }

  // Put "it" in queue, make sure to update appropriate index and size
  public boolean enqueue(E it) {
   if (size == queueArray.length){
       return false;
   }
   
   int rear = (front + size) % queueArray.length;
   queueArray[rear] = it;
   size++;
   return true;
  }

  // Remove and return front value, make sure to update appropriate index and size
  public E dequeue() {
   if (isEmpty()){
      return null;
   }
   E frontEl = queueArray[front];
   front = (front + 1) % queueArray.length;
   size--;
   return frontEl;
  }

  // Return front value
  public E frontValue() {
   if (isEmpty()){
      return null;
   }
   return queueArray[front];
  }

  // Return queue size
  public int length() {
    return size;
  }
  
  //Check if the queue is empty
  public boolean isEmpty() {
    return length() == 0;
  }
}
