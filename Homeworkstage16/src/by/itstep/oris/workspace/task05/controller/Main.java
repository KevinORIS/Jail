package by.itstep.oris.workspace.task05.controller;

import by.itstep.oris.workspace.logic.MatrixManager;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 0, 5, 3}, 
				{ 1, 7, 9}, 
				{ 3, 10, 6} };

		int longestSequence = MatrixManager.getLongestSequenceInMatrix(matrix);
		
		System.out.print(longestSequence);
	}
}
