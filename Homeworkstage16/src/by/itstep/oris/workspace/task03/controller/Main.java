package by.itstep.oris.workspace.task03.controller;

import by.itstep.oris.workspace.logic.MatrixManager;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 0, -5, 3}, 
				{ 1, -2, 5}, 
				{ 3, 5, 6} };

		int max = MatrixManager.findMaxInOrderedRows(matrix);

		System.out.print(max);
	}
}
