

import java.util.LinkedList;


public class Queue<T> implements queueInterface<T>
{
	LinkedList<T> myList;
	
	public Queue()
	{
		myList = new LinkedList<T>();
	}
	
	//enqueue
	public void enqueue(T item)
	{
		myList.add(item);
	}
	
	//dequeue
	public T dequeue()
	{
		return myList.remove();
	}
	
	//getFront
	public T getFront()
	{
		return myList.getFirst();
	}
	
	//getBack
	public T getBack()
	{
		return myList.getLast();
	}
	
	//addToFront
	public void addToFront(T item)
	{
		myList.addFirst(item);
	}
	
	//addToBack
	public void addToBack(T item)
	{
		myList.addLast(item);
	}
	
	//removeFront
	public T removeFront()
	{
		return myList.removeFirst();
	}
	
	//removeBack
	public T removeBack()
	{
		return myList.removeLast();
	}
	
	//add
	public void add(T item)
	{
		myList.add(item);
	}
	
	//remove
	public T remove()
	{
		return myList.remove();
	}
	//toArray
	public T[] toArray()
	{
		return (T[]) myList.toArray();
	}

}