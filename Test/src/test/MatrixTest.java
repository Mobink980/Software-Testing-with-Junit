package test;


import static org.junit.Assert.*;
import org.junit.Test;


public class MatrixTest {
	
	Matrix matrix = new Matrix();

	@Test
	public void sumTest(){
			
		int a0[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b0[][]={{1,1,1},{1,1,1},{1,1,1}};
		int [][]result0 = matrix.matrixAdder(a0, b0);
		int [][]answer0 = {{2,3,4},{5,6,7},{8,9,10}}; //wrong 
		//assertEquals() is used for single elements not arrays
		assertArrayEquals(answer0, result0); //Comparing the result of the method with real answer
		
//		int a1[][]=null;
//		int b1[][]=null;
//		int [][]result1 = matrix.matrixAdder(a1, b1);
//		int [][]answer1 = {{2,3,4},{5,6,7},{8,9,10}}; //wrong 
//		//assertEquals() is used for single elements not arrays
//		assertArrayEquals(answer1, result1); //Comparing the result of the method with real answer
		
//		int a2[][]={{1,2},{4,5}};
//		int b2[][]={{1,1},{1,1}};
//		int [][]result2 = matrix.matrixAdder(a2, b2);
//		int [][]answer2 = {{2,3,4},{5,6,7},{8,9,10}}; //wrong 
		//assertEquals() is used for single elements not arrays
//		assertArrayEquals(answer2, result2); //Comparing the result of the method with real answer
	}
	
}
