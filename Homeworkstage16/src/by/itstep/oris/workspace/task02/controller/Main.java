package by.itstep.oris.workspace.task02.controller;


import by.itstep.oris.workspace.logic.MatrixManager;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 0, -5, 3}, 
				{ 1, -2, 5}, 
				{ 3, 5, 8} };

		String columnNumbers = MatrixManager.getColumNumbersWithSequence(matrix);

		System.out.print(columnNumbers);
	}
}
