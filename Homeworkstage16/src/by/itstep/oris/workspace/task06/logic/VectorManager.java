package by.itstep.oris.workspace.task06.logic;

public class VectorManager {
	public static int[] mergeSortedVectors(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int i = 0, j = 0, index = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                merged[index] = a[i];
                i++;
            } else {
                merged[index] = b[j];
                j++;
            }
            index++;
        }

        while (i < a.length) {
            merged[index] = a[i];
            i++;
            index++;
        }

        while (j < b.length) {
            merged[index] = b[j];
            j++;
            index++;
        }

        return merged;
    }
}
