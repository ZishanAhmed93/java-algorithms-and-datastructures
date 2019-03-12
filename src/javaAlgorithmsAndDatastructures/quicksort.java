package javaAlgorithmsAndDatastructures;

public class quicksort {
	int partition(int arr[], int start, int end) {
		int pivot = arr[end];
		int i = (start-1);
		
		for(int j=start; j<end; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr[i], arr[j]);
			}
		}
		swap(arr[i+1], arr[end]);
		return i+1;
	}
	
	void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}
	
	public static void sort(int arr[], int start, int end) {
		if(start < end) {
			int par = partition(arr, start, end);
			
			sort(arr, start, par-1);
			sort(arr, par+1, end);
		}
	}
	
	static void main(String args[]) {
		arrayHelpers arrHelp = new arrayHelpers();
		int arr[] = arrHelp.newRandomArray();
		
		arrHelp.printArrayWithMessage("Unsorted Array: ", arr);
		sort(arr, 0, arr.length);
		arrHelp.printArrayWithMessage("Sorted Array: ", arr);
		
		
	}
}
