package by.itstep.oris.workspace.logic;

public class MatrixManager {
	public static int getSumBetweenPositives(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
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
		if (matrix == null || matrix.length == 0) {
			return "Error";
		}
		StringBuilder builder = new StringBuilder();

		for (int j = 0; j < matrix[0].length; j++) {

			if (isSequence(matrix, j)) {
				builder.append(j + " ");
			}
		}

		return builder.toString();
	}

	private static boolean isSequence(int[][] matrix, int j) {
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

		return isIncreasing || isDecreasing;
	}

	public static int findMaxFromSequenceColumn(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return -1;
		}
		int max = Integer.MIN_VALUE;

		for (int j = 0; j < matrix[0].length; j++) {

			if (isSequence(matrix, j)) {
				for (int i = 0; i < matrix.length; i++) {
					if (matrix[i][j] > max) {
						max = matrix[i][j];
					}
				}
			}
		}

		return max;
	}
	public static int findRowWithLongestSeries(int[][] matrix) {
        int longestSeriesRow = 0;
        int longestSeriesLength = 0;

        for (int i = 0; i < matrix.length; i++) {
            int currentSeriesLength = 1;
            int currentElement = matrix[i][0];
          
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == currentElement) {
                    currentSeriesLength++;
                } else {
                    if (currentSeriesLength > longestSeriesLength) {
                        longestSeriesLength = currentSeriesLength;
                        longestSeriesRow = i;
                    }
                    currentElement = matrix[i][j];
                    currentSeriesLength = 1;
                }
            }
          
            if (currentSeriesLength > longestSeriesLength) {
                longestSeriesLength = currentSeriesLength;
                longestSeriesRow = i;
            }
        }

        return longestSeriesRow;
    }
}
