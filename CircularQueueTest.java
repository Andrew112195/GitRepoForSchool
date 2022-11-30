//Class for testing out circular queue functions
//Andrew Shapiro
public class CircularQueueTest {

	
	public static void main(String[] args) {
		
		MyCircularQueue test = new MyCircularQueue(6);

		
		for(int i = 0; i < test.capacity(); i++) {
			test.enqueue(i);
		}
		test.printQueue();

		test.delete(4);
		test.printQueue();
		test.enqueue(6);
		test.printQueue();
		test.dequeue();
		test.printQueue();
		System.out.println(test.peek());
	}

}
