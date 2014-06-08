
/*Given an array of integers and a number x, find the smallest subarray with sum greater than the given value.*/

import java.util.HashMap;


public class First {

	public static void main(String[] a)
	{
		int input[]={4, 2, -3, 1, 6};
		int length = input.length;
	 System.out.println(SubArrayWithZeroSum(input,length));
	}
	
	public static boolean SubArrayWithZeroSum(int arr[],int length)
	{
		int sum = 0;
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		for (int j =0;j<length;j++)
		{
			
			sum += arr[j];
			
			// if sum i in list that means there are some elements in betwwen they have 0 sum
			if(arr[j]==0 ||sum == 0 || hash.containsKey(sum))
			{
				return true;
			}
			else
			{
				hash.put(sum,arr[j]);
			}
		}
		
		
	return false;
	}
	
}

