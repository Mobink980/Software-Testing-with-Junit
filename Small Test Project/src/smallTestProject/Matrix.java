package smallTestProject;



public class Matrix {
	
	//A method for adding two matrices.
	public int [][]matrixAdder(int[][] a, int[][] b) {
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


//	//checking prime numbers (very bad implementation. The tests fail.)
//	public boolean isPrime(int num) {
//		for (int i = 2; i < (num / 2); i++) {
//			if (num % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}

	//checking prime numbers (a good implementation. All of the tests pass for this method)
	  public static boolean isPrime(int num) {
		  
		    if ( num <= 0 || num == 1) return false;		    		    
		    int a = (int) Math.sqrt(num);		    
		    for (int i = 2; i <= a ; i++){		    
		      if ( num % i == 0) {		      
		      return false;		      
		      }
		  }		  
		  return true;
		}


}
