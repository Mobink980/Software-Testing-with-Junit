package test;

import java.util.Arrays;

public class Matrix {
//	public static void main(String[] args) {
//		Matrix mat = new Matrix();
//		int [][]a = {{1,2,5}, {2,3,6},{1,1,1}};
//		int [][]b = {{1,2,6}, {2,3,1},{0,0,0}};
//		mat.matrixAdder(a, b);
////		System.out.println(countProvider(a));
//	}
	
	
	// a method to assure the number of elements in each row
	public static boolean countProvider(int [][]a){
		int[] flata = Arrays.stream(a) //flattening array a
		        .flatMapToInt(Arrays::stream)
		        .toArray();
		//make sure the number of elements in each row is 3
		for(int i = 0; i < a.length; i++) { 
			if(a[i].length != 3)
				return false;
		}
		//make sure that we have 3 rows, and 9 elements in total
		if(a.length != 3 || flata.length != 9)
			return false;
		
		return true;
	}
	//A method for adding two matrices.
	public int [][]matrixAdder(int[][] a, int[][] b) {
		if (a == null || b == null) 
			throw new java.lang.NullPointerException("The input array cannot be null.");
		
		if(!countProvider(a) || !countProvider(b))
			throw new java.lang.ArrayIndexOutOfBoundsException("The size of the matrices aren't correct.");
		
		int c[][]=new int[3][3];
		
	    for(int i = 0; i<3; i++){ //Performing the summation
	         for(int j = 0; j<3; j++){
	            c[i][j] = a[i][j]+b[i][j];	            
	         }
	      }
		return c;	    
	}
	
	//A method for minus of two matrices.
	public int[][] matrixMinus(int[][] a, int[][] b) {
		int c[][]=new int[3][3];
		
	    for(int i = 0; i<3; i++){ //Performing the summation
	         for(int j = 0; j<3; j++){
	            c[i][j] = a[i][j]-b[i][j];	            
	         }
	      }
		return c;	    
	}
}
