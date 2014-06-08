
/*Given an array of integers and a number x, find the smallest subarray with sum greater than the given value.*/

import javax.swing.text.StyleContext.SmallAttributeSet;


public class First {

	public static void main(String[] a)
	{
		int input[]={0,1,2,3,4,5,6,7};
	 System.out.println(SmallestSubArrayWithSum(input,8,8));
	}
	
	
	public static int SmallestSubArrayWithSum(int arr[],int lengthOfArray,int criticalSum)
	{
		int currentSum = 0;
		int minLen = lengthOfArray + 1;
		int start = 0;
		int end = 0;
		
		while(end < lengthOfArray)
		{
		while(currentSum<=criticalSum && end < lengthOfArray)
		{
			currentSum+=arr[end++];
		}
		while(currentSum>criticalSum && start<lengthOfArray)
		{
			if(end - start < minLen)
			{
				minLen= end - start;
			}
			currentSum -= arr[start++];
		}
		}
		return minLen;
	}
}

