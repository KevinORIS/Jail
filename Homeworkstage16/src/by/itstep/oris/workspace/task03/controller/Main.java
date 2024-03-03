package by.itstep.oris.workspace.task03.controller;

import by.itstep.oris.workspace.logic.MatrixManager;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 0, -5, 3}, 
				{ 1, 4, 5}, 
				{ 3, 10, 6} };

		int max = MatrixManager.findMaxFromSequenceColumn(matrix);

		System.out.print(max);
	}
}
