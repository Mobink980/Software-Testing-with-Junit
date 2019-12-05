package meduimTestProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WierdSort {
	/*This method, will take a Double array and sort them in a way that the odd numbers will be sorted
	 * in ascending order, and the even numbers will be sorted afterwards in descending order. 
	 * This is an example of how it works:
	 * input: {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
	 * output:{1, 3, 5, 7, 9, 8, 6, 4, 2, 0}
	 * If there are decimal numbers, then the number must be rounded down to the closest integer.*/
	public static Double[] sortItOut(Double[] array) {
		
		//Throw an exception if the input value is null.
		if(array == null)
			throw new java.lang.NullPointerException("The input array cannot be null.");
		
		Double[] sortedArray = new Double[array.length]; // keeping the sorted array
		sortedArray = array;
		Arrays.sort(sortedArray);

		int[] arr = new int[array.length]; // keeping the integer values of the array

		for (int i = 0; i < array.length; i++) { // flooring sorted elements to add to array arr
			arr[i] = (int) Math.floor(sortedArray[i]);
		}

//		for(int i = 0; i < arr.length; i++) { //printing the array arr
//			System.out.println(arr[i]);
//			}

		ArrayList<Double> oddNumbers = new ArrayList<Double>(); // Holding the odd numbers
		ArrayList<Double> evenNumbers = new ArrayList<Double>();// Holding even numbers

		for (int i = 0; i < arr.length; i++) { // adding the even numbers from the sortedArray to evenNumbers
			oddNumbers.add(sortedArray[i]);
			if (arr[i] % 2 == 0) { // adding even numbers
				evenNumbers.add(sortedArray[i]);
				oddNumbers.remove(oddNumbers.size() - 1); //if the number is even, then remove it from the oddNumbers
				
			}
		}

		Collections.reverse(evenNumbers);


//		for (int i = 0; i < evenNumbers.size(); i++) { // printing the evenNumbers
//			System.out.println(evenNumbers.get(i));
//		}


//		for (int i = 0; i < oddNumbers.size(); i++) { // printing the oddNumbers
//			System.out.println(oddNumbers.get(i));
//		}
		

	

		int k = 0;
		Double []result = new Double[oddNumbers.size() + evenNumbers.size()];
		for(int i=0; i < oddNumbers.size(); i++) {
			result[i] = oddNumbers.get(i);
			k++;
		}
		for(int i=0; i < evenNumbers.size(); i++) {
			result[k] = evenNumbers.get(i);
			k++;
		}
		return result;
	}
}
