package smallTestProject;

import static org.junit.Assert.*;
import org.junit.Test;


public class MatrixTest {
	
	Matrix matrix = new Matrix();

	@Test
	public void sumTest(){
		
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{1,1,1},{1,1,1},{1,1,1}};
		int [][]result = matrix.matrixAdder(a, b);
		int [][]answer = {{2,3,4},{5,6,7},{8,9,10}}; //wrong 
		//assertEquals() is used for single elements not arrays
		assertArrayEquals(answer, result); //Comparing the result of the method with real answer
	}
	
	@Test
	public void minusTest(){	
		
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{1,1,1},{1,1,1},{1,1,1}};
		int [][]result = matrix.matrixMinus(a, b);
		int [][]answer = {{0,1,2},{3,4,5},{6,7,8}}; //wrong 
		//assertEquals() is used for single elements not arrays
		assertArrayEquals(answer, result); //Comparing the result of the method with real answer
	}
	
	@Test
	public void primeTest(){

		//4 and 0 and -5 are not prime, so this method has implementation problems (first one)
		//negative integers cannot be prime by the definition.
		//The function also works very slow and is not time efficient  (should use sqrt)
		int []results = {12, 13, 14, 23, 64, 15, 16, 19, 43, 54, 4, 0, -5}; 
		boolean []actualResults = {false, true,false, true, false, false,false, true, true, false, false, false, false};
		
		
		for(int i= 0; i < results.length; i++) {
			assertEquals(actualResults[i], Matrix.isPrime(results[i]));//Comparing the result of the method with real answer
			
		}
		
	}
}
