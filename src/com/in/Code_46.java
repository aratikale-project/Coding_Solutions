package com.in;

public class Code_46 {

	public static void main(String[] args) {
		int[] arr = {10,20,20,30,40,50,60,60};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int k : arr)
		{
			if(k > largest)
			{
				secondLargest = largest;
				largest = k;
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);

	}

}
