import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class S1P2 {

	/**
	 * Given an array of 1s and 0s which has all 1s first followed by all 0s.
	 * Count the number of zeroes in the given array
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println(countZeroes(ar, ar.length / 2));
	}

	private static int countZeroes(int[] ar, int mid) {
		if (ar[mid] != ar[mid - 1]) {
			return ar.length - mid;
		} else if (ar[mid] == 0) {
			return countZeroes(ar, mid - mid / 2);
		} else {
			return countZeroes(ar, mid + mid / 2);
		}
	}
}
