package by.itstep.oris.workspace.task06.util;


public class ArrayCreator {
	
	
	public static void fullArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}
	public static void altFullArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
	}
}
