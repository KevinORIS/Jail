package by.itstep.oris.workspace.task01.controller;

import by.itstep.oris.workspace.logic.MatrixManager;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 1, -5, 3 }, 
				{ -1, 2, 3 }, 
				{ 3, -5, 2 } };

		int sum = MatrixManager.getSumBetweenPositives(matrix);

		System.out.print(sum);
	}
}
