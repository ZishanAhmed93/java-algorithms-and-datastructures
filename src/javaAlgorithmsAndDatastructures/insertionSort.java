package javaAlgorithmsAndDatastructures;

public class insertionSort {
	
	public static void sort(int array[]) {
		
		int len = array.length;
		for(int i=1; i<len; i++) {
			
			int key = array[i];
			int j = i-1;
			
			while(j>=0 && array[j] > key) {
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1]=key;
		}
	}
	
	public static void main(String args[]) {
		arrayHelpers arrHelpers = new arrayHelpers();
		insertionSort sorter = new insertionSort();
		
		int[] arr = arrHelpers.newRandomArray();
		
		arrHelpers.printArrayWithMessage("New unsorted array", arr);
		sorter.sort(arr);
		arrHelpers.printArrayWithMessage("Sorted array", arr);
	}
		
}
