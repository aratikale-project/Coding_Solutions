package com.in;

public class EquilibriumIndex {

	private static int equilibrium(int[] array, int n) 
	{
		int totalsum = 0;
		int leftsum = 0;
		for(int i=0;i<n;i++)
		{
			totalsum=totalsum + array[i];
		}
		for(int i=0; i<n ;i++)
		{
			int rightsum = totalsum - leftsum -array[i];
			if(leftsum == rightsum)
			{
				return i;
			}
			leftsum =leftsum + array[i];
			
		}
		return -1;
	}

	public static void main(String[] args)
	{
		int array[]= {1,3,5,2,2};
		int n=array.length;
		int result=equilibrium(array,n);
		System.out.println("The equilibrium index is " + result);
	}

	
}
