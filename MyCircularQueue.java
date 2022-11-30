//Andrew Shapiro
//Circular queue implementation
public class MyCircularQueue 
{
private int arr[];                              // array to store queue elements
private int front;                              // front points to front element in the queue
private int rear;                               // rear points to last element in the queue
private int capacity;                           // maximum capacity of the queue
private boolean lastOperationIsEnqueue = false;//used to indicate the last enqueue/dequeue operation
private int length;                              //current amount of elements in queue
// Constructor to initialize circular queue front and rear start at 0

MyCircularQueue(int size)
{
	arr = new int[size];
	capacity = size;
	front = 0;
	rear = 0;
	lastOperationIsEnqueue = false;
	length = 0;
}


public void dequeue()throws QueueEmptyException
{
	if (isEmpty())
	{
		throw new QueueEmptyException("Queue Empty");
	}
	else 
	{
		front = (front + 1) % capacity;
		lastOperationIsEnqueue = false;
		length--;
	}
}
// Utility function to add an item to the queue
public void enqueue(int item)throws QueueFullException
{
	// check for queue overflow
	if (isFull())
	{
		throw new QueueFullException("Queue Full");
	}
	else 
	{
		rear = (rear + 1) % capacity;
		arr[rear] = item;
		lastOperationIsEnqueue = true;
		length++;
	}
}
// method for deleting index k. Shifts all values from k to rear counter clockwise
public void delete(int k)throws QueueEmptyException
{	
	if (isEmpty())
	{
		throw new QueueEmptyException("Queue Empty");
	}
	else {
		k = (k+1) % capacity;
		while(k != rear) {
			arr[(k) % capacity] = arr[(k + 1) % capacity];
			k = (k+1) % capacity;
		}
		rear = (rear - 1) % capacity;
		lastOperationIsEnqueue = false;
		length--;
	}
}
// Utility function to return front element in the queue
public int peek()throws QueueEmptyException
{
	if (isEmpty())
	{
		throw new QueueEmptyException("Queue Empty");
	}
	else {
		return arr[(front + 1) % capacity];
	}
}
// Utility function to return the size of the queue

public int at(int i)throws QueueEmptyException
{	
	if (isEmpty())
	{
		throw new QueueEmptyException("Queue Empty");
	}
	else {
		return arr[i];
	}
}
//method for returning the amount of elements that exist in queue
public int size() 
{

		return length;
}
//method for returning the capacity or total amount that can be present in circular queue
public int capacity() 
{

		return capacity;
}
// Utility function to check if the queue is empty or not
public Boolean isEmpty()
{
	if (front == rear && !lastOperationIsEnqueue) {
		return true;
	}
	else {
		return false;
	}
}
// Utility function to check if the queue is empty or not
public Boolean isFull()
{	
		if (front == rear && lastOperationIsEnqueue) {
			return true;
		}
		else {
			return false;
		}
		
}
//method for printing the queue each element is with a space and front and rear is indicated.
public void printQueue()throws QueueEmptyException
{	
	if (isEmpty())
	{
		throw new QueueEmptyException("Queue Empty");
	} 
	int index = (front + 1) % capacity;
	System.out.print("Front --> ");
	do {
		System.out.print(arr[index] + " ");
		index = (index + 1) % capacity;
		
	}while (index != (rear + 1) % capacity);
	System.out.println(" <-- Rear");
}

}
