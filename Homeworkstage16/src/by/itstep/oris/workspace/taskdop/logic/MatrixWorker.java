package by.itstep.oris.workspace.taskdop.logic;

public class MatrixWorker {
	public static String isTriangular(int[][]matrix) {
		if (matrix == null || matrix.length == 0) {
			return "Error";
		}
		String result = "is not triangular";
		
		if(isUpperTriangular(matrix)) {
			result = "is upper triangular";
		}
		if(isLowerTriangular(matrix)) {
			result = "is lower triangular";
		}
		return result;
	}
	
	private static boolean isUpperTriangular(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
	private static boolean isLowerTriangular(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
