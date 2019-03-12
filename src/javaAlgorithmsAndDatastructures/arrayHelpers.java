package javaAlgorithmsAndDatastructures;

import java.util.Random;

public class arrayHelpers {
	static void printArrayWithMessage(String message, int arr[]) {
		System.out.println(message);
		
		System.out.print("{");
		int length = arr.length;
		for(int i=0; i<length; i++) {
			if(i != length)
				System.out.print(arr[i] + ", ");
			if(i == length-1)
				System.out.print(arr[i] + "}");
		}
		System.out.println("");
		System.out.println("");
	}
	
	//returns an array of random length<100 with random values<100
	static int[] newRandomArray(){
		Random random = new Random();
		int length = random.nextInt(100);
		
		int[] arr = new int[length];
		
		for(int i=0; i<length; i++) {
			arr[i] = random.nextInt(100);
		}
		
		return arr;
	}
	
	//returns an array of given length with random values<100
	static int[] newRandomArray(int length){
		Random random = new Random();
		int[] arr = new int[length];
		
		for(int i=0; i<length; i++) {
			arr[i] = random.nextInt(100);
		}
		
		return arr;
	}
}
