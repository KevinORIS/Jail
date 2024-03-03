package by.itstep.oris.workspace.logic;

public class MatrixManager {
	public static int getSumBetweenPositives(int[][] matrix) {
		if(matrix == null || matrix.length == 0) {
			return -1;
		}
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

	public static String getColumNumbersWithSequence(int[][] matrix) {
		if(matrix == null || matrix.length == 0) {
			return "Error";
		}
		 StringBuilder builder = new StringBuilder();

		 for (int j = 0; j < matrix[0].length; j++) {
	            boolean isIncreasing = true;
	            boolean isDecreasing = true;

	            for (int i = 1; i < matrix.length; i++) {
	                if (matrix[i][j] > matrix[i - 1][j]) {
	                    isDecreasing = false;
	                } else if (matrix[i][j] < matrix[i - 1][j]) {
	                    isIncreasing = false;
	                }
	                if (!isIncreasing && !isDecreasing) {
	                    break;
	                }
	            }

	            if (isIncreasing || isDecreasing) {
		            builder.append(j + " ");
		        }
		    }

		    return builder.toString();
	}
}
