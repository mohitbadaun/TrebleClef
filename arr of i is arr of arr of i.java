/*Given an array arr[] of size n where every element is in range from 0 to n-1. Rearrange the given array so that arr[i] becomes arr[arr[i]].
 * space complexity can not be more that O(1)*/

import java.util.HashMap;

public class First {

	public static void main(String[] a) {
		int input[] = { 4, 0, 3, 1, 2 };
		int length = input.length;
		ShuffleArray(input,length);
		for (int i = 0; i < length; i++) {
			System.out.print(input[i]);
		}
	}

	public static void ShuffleArray(int arr[], int length) {
		int i;
		for (i = 0; i < length; i++) {
			arr[i] = arr[i] + (arr[arr[i]] % length) * length;
		}
		for (i = 0; i < length; i++) {
			arr[i] /= length;
		}
		
	}

}
