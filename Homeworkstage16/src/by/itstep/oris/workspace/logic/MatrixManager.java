package by.itstep.oris.workspace.logic;

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

	public int[] getColumNumbersWithSequence(int[][] matrix) {
		int[] columnNumbers = new int[matrix.length];

        for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
            boolean isAscending = true;
            boolean isDescending = true;

            for (int i = 0; i < matrix.length - 1; i++) {
                if (matrix[i][columnIndex] > matrix[i + 1][columnIndex]) {
                    isAscending = false;
                }
                if (matrix[i][columnIndex] < matrix[i + 1][columnIndex]) {
                    isDescending = false;
                }
            }

            if (isAscending) {
                columnNumbers[columnIndex] = 1;
            } else if (isDescending) {
                columnNumbers[columnIndex] = -1;
            } else {
                columnNumbers[columnIndex] = 0;
            }
        }

        return columnNumbers;
    }


}
