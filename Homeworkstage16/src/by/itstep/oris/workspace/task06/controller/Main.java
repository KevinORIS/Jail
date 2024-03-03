package by.itstep.oris.workspace.task06.controller;

import java.util.Arrays;

import by.itstep.oris.workspace.task06.logic.VectorManager;
import by.itstep.oris.workspace.task06.util.ArrayCreator;

public class Main {
	public static void main(String[] args) {
		int[] a = new int[1000];
		int[] b = new int[1000];
		
		ArrayCreator.fullArray(a);
		ArrayCreator.altFullArray(b);
		
		int[] c = VectorManager.mergeSortedVectors(a, b);
		
		System.out.print(Arrays.toString(c));
	}
}
