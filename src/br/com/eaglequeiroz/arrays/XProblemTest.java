package br.com.eaglequeiroz.arrays;

/**
 * 
 * @author Igor Queiroz
 * 
 * The problem is to change the value of the [X] values to 1 and the NEXT values at the same row and same column as well. 
 *
 */
public class XProblemTest {
	
	public static void main(String[] args) {
		
		String[][] bidArray = new String[5][5];
		
		bidArray[0][0] = "0";
		bidArray[0][1] = "X";
		bidArray[0][2] = "0";
		bidArray[0][3] = "0";
		bidArray[0][4] = "0";
		
		bidArray[1][0] = "0";
		bidArray[1][1] = "0";
		bidArray[1][2] = "0";
		bidArray[1][3] = "0";
		bidArray[1][4] = "0";
		
		bidArray[2][0] = "0";
		bidArray[2][1] = "0";
		bidArray[2][2] = "0";
		bidArray[2][3] = "X";
		bidArray[2][4] = "0";
		
		bidArray[3][0] = "0";
		bidArray[3][1] = "0";
		bidArray[3][2] = "0";
		bidArray[3][3] = "0";
		bidArray[3][4] = "X";
		
		bidArray[4][0] = "0";
		bidArray[4][1] = "X";
		bidArray[4][2] = "0";
		bidArray[4][3] = "0";
		bidArray[4][4] = "0";
		
		printArray(bidArray);
		changeBidArrayXValuesToOne(bidArray);
		printArray(bidArray);
		
	}

	private static void changeBidArrayXValuesToOne(String[][] bidArray) {
		for (int rows = 0; rows < bidArray.length; rows ++){
			for(int columns = 0; columns < bidArray[rows].length ; columns++){
				if( bidArray[rows][columns] == "X"){
				  bidArray[rows][columns] = "1";
				  
				  int c = columns;
				  int r = rows;
				  
				  while(c < bidArray[rows].length && bidArray[rows][c] != "X") {
					  bidArray[rows][c] = "1";
					  c++;
				  }
					
				  while(r < bidArray.length && bidArray[r][columns] != "X") {
					  bidArray[r][columns] = "1";
					  r++;
				  }
				}
			}

		}
	}

	private static void printArray(String[][] bidArray) {
		for (int i = 0; i < bidArray.length; i++) {
			for (int j = 0; j < bidArray[i].length; j++) {
				System.out.print("[" + bidArray[i][j] +"]");
				if(j+1 > bidArray[j].length-1) {
					System.out.println("");
				}
			}
		}
		System.out.println("");
	}

}
