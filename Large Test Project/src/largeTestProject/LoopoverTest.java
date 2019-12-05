package largeTestProject;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class LoopoverTest {
	
	Loopover loop = new Loopover();

	@Test
	public void loopoverTest(){
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%Initial Boards
		char[][] initialBoard0 = { { 'A', 'B', 'C', 'D', 'E' }, { 'F', 'G', 'H', 'I', 'J' }, { 'K', 'L', 'M', 'N', 'O' },
				{ 'P', 'Q', 'R', 'S', 'T' }, { 'U', 'V', 'W', 'X', 'Y' } };
		char[][] initialBoard1 = { { 'A', 'B', 'C', 'D', 'E' }, { 'F', 'G', 'H', 'I', 'J' }, { 'K', 'L', 'M', 'N', 'O' },
				{ 'P', 'Q', 'R', 'S', 'T' }, { 'U', 'V', 'W', 'X', 'Y' } };
		char[][] initialBoard2 = { { 'A', 'B', 'C', 'D', 'E' }, { 'F', 'G', 'H', 'I', 'J' }, { 'K', 'L', 'M', 'N', 'O' },
				{ 'P', 'Q', 'R', 'S', 'T' }, { 'U', 'V', 'W', 'X', 'Y' } };
		char[][] initialBoard3 = { { 'A', 'B', 'C', 'D', 'E' }, { 'F', 'G', 'H', 'I', 'J' }, { 'K', 'L', 'M', 'N', 'O' },
				{ 'P', 'Q', 'R', 'S', 'T' }, { 'U', 'V', 'W', 'X', 'Y' } };
		char[][] initialBoard4 = { { 'A', 'B', 'C', 'D', 'E' }, { 'F', 'G', 'H', 'I', 'J' }, { 'K', 'L', 'M', 'N', 'O' },
				{ 'P', 'Q', 'R', 'S', 'T' }, { 'U', 'V', 'W', 'X', 'Y' } };
		char[][] initialBoard5 = { { 'A', 'B', 'C', 'D', 'E' }, { 'F', 'G', 'H', 'I', 'J' }, { 'K', 'L', 'M', 'N', 'O' },
				{ 'P', 'Q', 'R', 'S', 'T' }, { 'U', 'V', 'W', 'X', 'Y' } };

		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Different Moves
        //List of moves
        List<String> list0 = Arrays.asList( "L1", "U2", "D1", "U0", "R1", "U3", "L1", "R4");        
       //The moves should be performed 
        ArrayList<String> moves0 = new ArrayList<>();        
       //Adding the elements to the moves
        moves0.addAll(list0); 
        
        //List of moves
        List<String> list1 = Arrays.asList( "U2", "U2", "U2", "U2", "U2");        
       //The moves should be performed 
        ArrayList<String> moves1 = new ArrayList<>();        
       //Adding the elements to the moves
        moves1.addAll(list1); 
        
        //List of moves
        List<String> list2 = Arrays.asList( "L1", "L2", "L1","L2", "U4");        
       //The moves should be performed 
        ArrayList<String> moves2 = new ArrayList<>();        
       //Adding the elements to the moves
        moves2.addAll(list2); 
        
        //List of moves
        List<String> list3 = Arrays.asList( "L1", "L2", "R1","R2", "U4");        
       //The moves should be performed 
        ArrayList<String> moves3 = new ArrayList<>();        
       //Adding the elements to the moves
        moves3.addAll(list3); 
        
        //List of moves
        List<String> list4 = Arrays.asList( "L1", "U2", "D1", "U0", "R1", "U3", "L1", "R4", "D1", "D2", "D3");        
       //The moves should be performed 
        ArrayList<String> moves4 = new ArrayList<>();        
       //Adding the elements to the moves
        moves4.addAll(list4); 
        
        //List of moves
        List<String> list5 = Arrays.asList();  //NO MOVE      
       //The moves should be performed 
        ArrayList<String> moves5 = new ArrayList<>();        
       //Adding the elements to the moves
        moves5.addAll(list5); 
        		
      //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Initializing final boards
        
		//the board that we will return after performing the moves on the initial board 
		char[][] finalBoard0 = new char [initialBoard0.length][initialBoard0.length];
		//the board that we will return after performing the moves on the initial board 
		char[][] finalBoard1 = new char [initialBoard1.length][initialBoard1.length];
		//the board that we will return after performing the moves on the initial board 
		char[][] finalBoard2 = new char [initialBoard2.length][initialBoard2.length];
		//the board that we will return after performing the moves on the initial board 
		char[][] finalBoard3 = new char [initialBoard3.length][initialBoard3.length];
		//the board that we will return after performing the moves on the initial board 
		char[][] finalBoard4 = new char [initialBoard4.length][initialBoard4.length];
		//the board that we will return after performing the moves on the initial board 
		char[][] finalBoard5 = new char [initialBoard5.length][initialBoard5.length];
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Applying moves on the boards
		finalBoard0 = loop.loopover(initialBoard0, moves0);//calling the solver function on the initalBoard
		finalBoard1 = loop.loopover(initialBoard1, moves1);//calling the solver function on the initalBoard
		finalBoard2 = loop.loopover(initialBoard2, moves2);//calling the solver function on the initalBoard
		finalBoard3 = loop.loopover(initialBoard3, moves3);//calling the solver function on the initalBoard
		finalBoard4 = loop.loopover(initialBoard4, moves4);//calling the solver function on the initalBoard
		finalBoard5 = loop.loopover(initialBoard5, moves5);//calling the solver function on the initalBoard
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Actual Answers
		char[][] answer0 = { { 'G', 'V', 'I', 'M', 'E' }, { 'K', 'B', 'N', 'J', 'F' }, { 'P', 'H', 'R', 'S', 'O' },
				{ 'U', 'L', 'W', 'X', 'T' }, { 'Y', 'A', 'Q', 'C', 'D' } };
		char[][] answer1 = { { 'A', 'B', 'C', 'D', 'E' }, { 'F', 'G', 'H', 'I', 'J' }, { 'K', 'L', 'M', 'N', 'O' },
				{ 'P', 'Q', 'R', 'S', 'T' }, { 'U', 'V', 'W', 'X', 'Y' } };
		char[][] answer2 = { { 'A', 'B', 'C', 'D', 'G' }, { 'H', 'I', 'J', 'F', 'L' }, { 'M', 'N', 'O', 'K', 'T' },
				{ 'P', 'Q', 'R', 'S', 'Y' }, { 'U', 'V', 'W', 'X', 'E' } };
		char[][] answer3 = { { 'A', 'B', 'C', 'D', 'J' }, { 'F', 'G', 'H', 'I', 'O' }, { 'K', 'L', 'M', 'N', 'T' },
				{ 'P', 'Q', 'R', 'S', 'Y' }, { 'U', 'V', 'W', 'X', 'E' } };
		char[][] answer4 = { { 'G', 'A', 'Q', 'C', 'E' }, { 'K', 'V', 'I', 'M', 'F' }, { 'P', 'B', 'N', 'J', 'O' },
				{ 'U', 'H', 'R', 'S', 'T' }, { 'Y', 'L', 'W', 'X', 'D' } };
		char[][] answer5 = { { 'A', 'B', 'C', 'D', 'E' }, { 'F', 'G', 'H', 'I', 'J' }, { 'K', 'L', 'M', 'N', 'O' },
				{ 'P', 'Q', 'R', 'S', 'T' }, { 'U', 'V', 'W', 'X', 'Y' } };
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% Comparing the actual results with the results of the method 
		//Comparing the result of the method with real answer
		assertArrayEquals(answer0, finalBoard0); 
		//Comparing the result of the method with real answer
		assertArrayEquals(answer1, finalBoard1); 
		//Comparing the result of the method with real answer
		assertArrayEquals(answer2, finalBoard2); 
		//Comparing the result of the method with real answer
		assertArrayEquals(answer3, finalBoard3); 
		//Comparing the result of the method with real answer
		assertArrayEquals(answer4, finalBoard4); 
		//Comparing the result of the method with real answer
		assertArrayEquals(answer5, finalBoard5); 
	}
	

	

}

