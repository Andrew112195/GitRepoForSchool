/*--------------------------------------------------------------------
Name: Andrew Shapiro
Student ID: 4000225501
COP 2805C - Java Programming 2
Summer / 2022
Assignment # X
Plagiarism Statement
I certify that this assignment is my own work and that I have not copied in part or whole or otherwise plagiarized the work of other students and/or persons.
--------------------------------------------------------------------*/

import java.lang.Runnable;
import java.util.concurrent.*;

public class TestSynchronizedSum {
	// Implementation of addition object
	static  SyncThreadAddOne sync = new SyncThreadAddOne();
	
	//runnable class overridden with increment method in Thread add one class
	public static class MyRunnable implements Runnable{
		@Override
		public  void run() {
			sync.increment(1);
		}
	}

	public static void main(String[] args) {
		//executor object creating a pool of 1000 threads
		ExecutorService executor = Executors.newFixedThreadPool(1000);
		
		//loop will call my runnable which will then call increment
		for(int i = 0; i < 1000; i++) {
			
			executor.execute(new MyRunnable());
		}
		//terminates after all tasks
		executor.shutdown();
				//while loop prints final sum after checking for shutdown
			    while (!executor.isTerminated()) {
			    }

			    System.out.println("Synched sum: " + sync.sum);
			  }
	}

class SyncThreadAddOne{
	public Integer sum = 0;
	/**
	 * This method will increment one to the sum from each of the 1000 threads
	 * will sleep for 5 milliseconds to prove synchronization
	 * @param 1 is passed through from runnable class
	 */
	//synchronized key word used in method will facilitate in the threads waiting before execution
	public synchronized void increment(int one) {

		try {
			Thread.sleep(5);
		}
		catch(InterruptedException ex) {
			
		}
			sum++;
		}
}
