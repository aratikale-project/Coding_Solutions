package com.in;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int n=1234;
		int r;
		while(n>0)
		{
			r=n%10;
			System.out.print(r);
			n=n/10;
			
		}
			
		

	}

}
