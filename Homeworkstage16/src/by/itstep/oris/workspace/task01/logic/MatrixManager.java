package by.itstep.oris.workspace.task01.logic;

public class MatrixManager {
	public static int getSumBetweenPositives(int[][] matrix) {
		int sum = 0;
		
	    for (int[] row : matrix) {
	        boolean foundFirstPositive = false;
	        int partialSum = 0;
	        
	        for (int num : row) {
	            if (num > 0) {
	                if (foundFirstPositive) {
	                    sum += partialSum;
	                    break;
	                } else {
	                    foundFirstPositive = true;
	                }
	            } else if (foundFirstPositive) {
	                partialSum += num;
	            }
	        }
	    }
	    
	    return sum;
    }
}
