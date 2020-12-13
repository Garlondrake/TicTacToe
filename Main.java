public boolean ticTacToe(int[][] board) { // It receives a 2D array who simulates a board at any dimension, I did it to be completely resizable. It do not count diagonal ones 
		
	boolean victory = false; // Boolean who indicates if the actual player won the round
	int verticalCounter = 0; // Counter for vertical Tic Tac Toe
	int horizontalCounter = 0; // Counter for horizontal Tic Tac Toe
	int verticalSwitcher = 0; // It is a simple pivot who switches the value if next box is not the same as old one
	int horizontalSwitcher = 0; // Same here
	int empty = 0; // The value assigned in 2D array to difference an empty box of each others
	int player1 = 1; // The same but with player one
	int player2 = 2; // The same but with player two
		
	for (int i = 0; i < board.length; i++) { // For loop to select rows / columns
			
	        for (int j = 0; j < board[0].length; j++) { // The next loop to select the box in the row / column -> [i][j] = column - [j][i] = row
	        	
	        	if (verticalSwitcher == empty) { // Checker for vertical Tic Tac Toe - If box is empty, resets counter to 0
	        		verticalSwitcher = board[i][j];
	        		verticalCounter = 0;
	        	} else if (verticalSwitcher == player1 && board[i][j] == player2 || verticalSwitcher == player1 && board[i][j] == empty) { // If empty or different than switcher value, resets counter to 0
	        		verticalSwitcher = board[i][j];
	        		verticalCounter = 0;
	        	} else if (verticalSwitcher == player2 && board[i][j] == player1 || verticalSwitcher == player2 && board[i][j] == empty) { // Same as above
	        		verticalSwitcher = board[i][j];
	        		verticalCounter = 0;
	        	}
	        	
	        	if (horizontalSwitcher == empty) { // Checker for horizontal Tic Tac Toe - If box is empty, resets counter to 0
	        		horizontalSwitcher = board[j][i];
	        		horizontalCounter = 0;
	        	} else if (horizontalSwitcher == player1 && board[j][i] == player2 || horizontalSwitcher == player1 && board[j][i] == empty) { // If empty or different than switcher value, resets counter to 0
	        		horizontalSwitcher = board[j][i];
	        		horizontalCounter = 0;
	        	} else if (horizontalSwitcher == player2 && board[j][i] == player1 || horizontalSwitcher == player2 && board[j][i] == empty) { // Same as above
	        		horizontalSwitcher = board[j][i];
	        		horizontalCounter = 0;
	        	}
	        	
	        	verticalCounter++; // For counting successive kind of boxes at vertical orientation
			horizontalCounter++; // Same as above but the horizontal one
				
	        	if (verticalCounter == 3) victory = true; // If counter count 3 times, you are the winner
	        	if (horizontalCounter == 3) victory = true; // Same as above
	        }
		
		verticalSwitcher = 0; // For reseting switcher to 0
		horizontalSwitcher = 0; // Same as above
	        
	}
    return victory; // Returns the victory value, true if you reach Tic Tac Toe or false if you do not
}
