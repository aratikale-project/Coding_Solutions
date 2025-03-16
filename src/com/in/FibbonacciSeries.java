package com.in;

public class FibbonacciSeries {

	public static void main(String[] args)
	{
		int n =10;
		int firstterm=0,secondterm=1;
		int thirdterm;
		for(int i=0;i<10;i++)
		{
			System.out.print(firstterm + ",");
			thirdterm=firstterm + secondterm;
			firstterm=secondterm;
			secondterm=thirdterm;
			
			
		}

	}

}
