package by.itstep.oris.workspace.task04.controller;

import by.itstep.oris.workspace.logic.MatrixManager;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 0, 1, 1}, 
				{ 1, 3, 1}, 
				{ 1, 1, 1} };

		int row = MatrixManager.findRowWithLongestSeries(matrix);

		System.out.print(row);
	}
}
