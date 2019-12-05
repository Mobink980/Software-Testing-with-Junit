package meduimTestProject;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.fail;

public class WierdSortTest {
	
	//Testing sortItOut method against the null values
	@Test(expected=NullPointerException.class)
	public void testSortItOutWithNullArgument() {
		Double []test6 = null;
		try {
		WierdSort.sortItOut(test6); //calculate the result using implemented method
		
		fail("expected NullPointerException");
		}catch(NullPointerException e) {
			System.out.println("The method works correctly. Because it doesn't fail to throw the exception");
		}	    
	}

	@Test
	public void sumTest(){
		//Test samples
		Double[] test0 = { 12.13, 13.14, 16.23, 64.23, 49.7, 16.0, 12.9, 11.875 }; //test number 0
		Double[] test1 = { 13.13, 64.14, 51.00, 61.11, 23.7, 16.0, 32.9 }; //test number 0
		Double[] test2 = { 12.13}; //test number 0
		Double[] test3 = { 12.13, 13.14, 16.23, 64.23, 49.7, 16.0, 12.9, 11.875, 39.13 }; //test number 0
		Double[] test4 = { 12.13, 13.14, 16.23, 64.23, 49.7, 10.0, 50.9 }; //test number 0
		Double[] test5 = { 12.13, 99.14 }; //test number 0

		
		//The calculation of the values, returned by the implemented method
		Double[] result0 = WierdSort.sortItOut(test0); //calculate the result using implemented method
		Double[] result1 = WierdSort.sortItOut(test1); //calculate the result using implemented method
		Double[] result2 = WierdSort.sortItOut(test2); //calculate the result using implemented method
		Double[] result3 = WierdSort.sortItOut(test3); //calculate the result using implemented method
		Double[] result4 = WierdSort.sortItOut(test4); //calculate the result using implemented method
		Double[] result5 = WierdSort.sortItOut(test5); //calculate the result using implemented method

		//Actual answers
		Double[] answer0 = {11.875, 13.14, 49.7, 64.23, 16.23, 16.0, 12.9, 12.13};  
		Double[] answer1 = {13.13, 23.7, 51.0, 61.11, 64.14, 32.9, 16.0};
		Double[] answer2 = { 12.13};
		Double[] answer3 = {11.875, 13.14, 39.13, 49.7, 64.23, 16.23, 16.0, 12.9, 12.13};
		Double[] answer4 = {13.14, 49.7, 64.23, 50.9, 16.23, 12.13, 10.0};
		Double[] answer5 = {99.14, 12.13};

		
		//checking the validity of the implemented function by comparing its return values to the actual results
		assertArrayEquals(answer0, result0); //Comparing the result of the method with real answer
		assertArrayEquals(answer1, result1); //Comparing the result of the method with real answer
		assertArrayEquals(answer2, result2); //Comparing the result of the method with real answer
		assertArrayEquals(answer3, result3); //Comparing the result of the method with real answer
		assertArrayEquals(answer4, result4); //Comparing the result of the method with real answer
		assertArrayEquals(answer5, result5); //Comparing the result of the method with real answer

	}
	

}
