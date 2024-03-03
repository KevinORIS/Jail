package by.itstep.oris.workspace.taskdop.controller;

import by.itstep.oris.workspace.taskdop.logic.MatrixWorker;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 3, 0, 0}, 
				{ 3, 3, 0}, 
				{ 4, 2, 1} };
		System.out.print(MatrixWorker.isTriangular(matrix));
	}
}
