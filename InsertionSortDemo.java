//Home work assignment 1 Andrew Shapiro

import java.util.Random;


public class InsertionSortDemo {

	/**
	 * This method is used to pass in an array as an argument and return a sorted array using insertion sort algorithm.
	 * @param a is passed as a presumably unsorted array
	 * @return returns the new sorted array
	 */
	public static int[] insertionSort(int[] a) {
		
		for (int i = 1; i < a.length; i++)
		{// insert a[i] into a[0:i-1]
		   
			int t = a[i];
		   int j;
		   for (j = i - 1; j >= 0 && t < a[j]; j--)
		       a[j + 1] = a[j];
		   a[j + 1] = t;
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		//init of rand int
		Random rand = new Random();
		
		//init of initial unsorted array
		int[] unsortArr = new int[20];
		
		//for loop for creating random ints and adding it to the array. also prints to show unsorttedness
		for(int i = 0; i < unsortArr.length; ++i) {
			unsortArr[i] = rand.nextInt(100);
			System.out.println(unsortArr[i]);
		}
		//init of sorted array and calls insertion sort method for assigning
		int[] sortArr = insertionSort(unsortArr);
		
		
		//print sorted array
		for(int i = 0; i < sortArr.length; ++i) {
			System.out.println(sortArr[i]);
		}
	}

}
