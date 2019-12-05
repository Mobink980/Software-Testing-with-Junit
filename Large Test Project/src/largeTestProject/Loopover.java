package largeTestProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*This program takes a board, and apply some moves to the board and returns the result*/
public class Loopover {
	
	//##################################################################################################
	public static void main(String[] args) {
		char[][] initialBoard = { { 'A', 'B', 'C', 'D', 'E' }, { 'F', 'G', 'H', 'I', 'J' }, { 'K', 'L', 'M', 'N', 'O' },
				{ 'P', 'Q', 'R', 'S', 'T' }, { 'U', 'V', 'W', 'X', 'Y' } };
        //List 1
        List<String> list = Arrays.asList("L1", "U2", "D1", "U0", "R1", "U3", "L1", "R4", "D1", "D2", "D3");
         
        
        //List 2
        ArrayList<String> moves = new ArrayList<>(); //the moves should be performed
         
       //Adding the elements to the moves
        moves.addAll(list); 
		
        //System.out.println(moves);
		//the board that we will return after performing the moves on the initial board 
		char[][] finalBoard = new char [initialBoard.length][initialBoard.length];
		
		for (int i = 0; i < initialBoard.length; i++) {
			for (int j = 0; j < initialBoard.length; j++) {
				System.out.print(initialBoard[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		Loopover loop = new Loopover();		
		finalBoard = loop.loopover(initialBoard, moves);//calling the solver function on the initalBoard
		
		for (int i = 0; i < finalBoard.length; i++) {
			for (int j = 0; j < finalBoard.length; j++) {
				System.out.print(finalBoard[i][j]);
			}
			System.out.println();
		}
		

	}

	//##################################################################################################
	//This method takes a board, and apply given moves to the board and returns the result
	public char[][] loopover(char[][] initialBoard, ArrayList<String> moves) {
		
		//Performing the move operations
		String move;
		for(int i=0; i < moves.size(); i++) {//looping over ArrayList moves
			 move = moves.get(i);
			
			if(move.charAt(0) == 'L') {
				//System.out.println("L");
				initialBoard = left(initialBoard, move);
			}
		
			else if(move.charAt(0) == 'R') {
				//System.out.println("R");
				initialBoard = right(initialBoard, move);
			}
			
			else if(move.charAt(0) == 'U') {
				//System.out.println("U");
				initialBoard = up(initialBoard, move);
			}
			
			else{
				//System.out.println("D");
				initialBoard = down(initialBoard, move);
			}
		}
		return initialBoard;
	}
	
	//##################################################################################################
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//taking the board in an specific position up
	public static char[][] up(char[][] initialBoard, String move) {
				
		int number = Integer.parseInt(move.substring((move.length()/2)));//the column number
		//System.out.println("up"+ " " + number);
		char []positions = new char[initialBoard.length]; //the positions that should be shifted
		
		for(int i=0; i < initialBoard.length; i++) { //fetching the elements
			positions[i] = initialBoard[i][number];
			
		}
		
		shiftUp(positions); //shifting the selected positions up
	
		for(int i=0; i < initialBoard.length; i++) { //Replacement
			initialBoard[i][number] = positions[i] ;
			
		}
		
//		for(int i=0; i < initialBoard.length; i++) {//printing 
//			System.out.print(positions[i] + " ");
//		}
		
		return initialBoard;
		
	}
	
	//shifting the selected positions up
	static char []shiftUp(char []positions){

		char first = positions[0];
		for(int i=1; i < positions.length; i++) {//shifting
			positions[i - 1] = positions[i];
		}
		positions [positions.length - 1] = first;
		return positions;		
	}
	
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	
	//taking the board in an specific position down
	public static char[][] down(char[][] initialBoard, String move) {
		
		int number = Integer.parseInt(move.substring((move.length()/2)));//the column number
//		System.out.println("down"+ " " + number);
		
		char []positions = new char[initialBoard.length]; //the positions that should be shifted
		
		for(int i=0; i < initialBoard.length; i++) { //fetching the elements
			positions[i] = initialBoard[i][number];
			
		}
		
		shiftDown(positions); //shifting the selected positions down
		
		for(int i=0; i < initialBoard.length; i++) { //Replacement
			initialBoard[i][number] = positions[i] ;
			
		}
		
//		for(int i=0; i < initialBoard.length; i++) {//printing 
//			System.out.print(positions[i] + " ");
//		}
		
		return initialBoard;
	}
	
	//shifting the selected positions down
	static char []shiftDown(char []positions){
		
		char last = positions[positions.length - 1];
		for(int i = positions.length - 2; i >= 0 ; i--) {//shifting
			positions[i + 1] = positions[i];
		}
		positions [0] = last;
		return positions;		
	}
	
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//taking the board in an specific position left
	public static char[][] left(char[][] initialBoard, String move) {

		int number = Integer.parseInt(move.substring((move.length()/2)));//the row number
		//System.out.println("left"+ " " + number);
		char []positions = new char[initialBoard.length]; //the positions that should be shifted
		
		for(int i=0; i < initialBoard.length; i++) { //fetching the elements
			positions[i] = initialBoard[number][i];
			
		}
		
		shiftLeft(positions); //shifting the selected positions left
		
		for(int i=0; i < initialBoard.length; i++) { //Replacement
			initialBoard[number][i] = positions[i] ;
			
		}
		
//		for(int i=0; i < initialBoard.length; i++) {//printing 
//			System.out.print(positions[i] + " ");
//		}
		
		return initialBoard;
	}
	
	//shifting the selected positions left (works like shiftUp)
	static char []shiftLeft(char []positions){
		
		char first = positions[0];
		for(int i=1; i < positions.length; i++) {//shifting
			positions[i - 1] = positions[i];
		}
		positions [positions.length - 1] = first;
		return positions;		
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//taking the board in an specific position right
	public static char[][] right(char[][] initialBoard, String move) {

		int number = Integer.parseInt(move.substring((move.length()/2)));//the row number
		//System.out.println("right"+ " " + number);
		char []positions = new char[initialBoard.length]; //the positions that should be shifted
		
		for(int i=0; i < initialBoard.length; i++) { //fetching the elements
			positions[i] = initialBoard[number][i];
			
		}
		
		shiftRight(positions); //shifting the selected positions right
		
		for(int i=0; i < initialBoard.length; i++) { //Replacement
			initialBoard[number][i] = positions[i] ;
			
		}
		
//		for(int i=0; i < initialBoard.length; i++) {//printing 
//			System.out.print(positions[i] + " ");
//		}
		
		return initialBoard;
	}
	
	//shifting the selected positions right (works like shiftDown)
	static char []shiftRight(char []positions){
		
		char last = positions[positions.length - 1];
		for(int i = positions.length - 2; i >= 0 ; i--) {//shifting
			positions[i + 1] = positions[i];
		}
		positions [0] = last;
		return positions;		
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

}