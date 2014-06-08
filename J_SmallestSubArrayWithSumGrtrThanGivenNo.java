import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S1P1 {

	/*
	 * Given an array of integers and number x, find the smallest subarray with
	 * sum greater than the given value
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		long x = sc.nextLong();
		Arrays.sort(ar);
		List<Integer> out = new ArrayList<Integer>();
		long sum = 0;
		int ptr = ar.length - 1;
		while (sum <= x) {
			sum += ar[ptr];
			out.add(ar[ptr--]);
		}
		for (int i : out) {
			System.out.println(i);
		}
	}
}
