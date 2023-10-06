
public interface queueInterface<T> 
{
	/**
	 * Adds a new item at the front of the queue
	 * @param item 
	 */
	public void enqueue(T item);
	
	/**
	 * Removes and returns the element in the front of the queue
	 * @return
	 */
	public T dequeue();
	
	/**
	 * Fetches the object at the front of the queue
	 * @return
	 */
	public T getFront();
	
	/**
	 * Fetches the object at the back of the queue
	 * @return
	 */
	public T getBack();
	
	/**
	 * Adds a new item at the front of the queue
	 * @param item
	 */
	public void addToFront(T item);
	
	/**
	 * Adds a new item to the back of the queue
	 * @param item
	 */
	public void addToBack(T item);
	
	/**
	 * Removes the element at the head of the queue
	 * @return
	 */
	public T removeFront();
	
	/**
	 * Removes the element at the back of the queue
	 * @return
	 */
	public T removeBack();
	
	/**
	 * Adds a new item to the front of the queue
	 * @param item
	 */
	public void add(T item);
	
	/**
	 * Removes the element at the front of the queue
	 * @return
	 */
	public T remove();
	
	/**
	 * Converting linked list to an array
	 * @return
	 */
	public T[] toArray();
}
