package com.in;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args)
	{
		int n;
		int count=0;
		System.out.println("Enter Any Number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n % i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println("Number is Prime");
		}
		else 
		{
			System.out.println("Number is not Prime");
		}

	}

}
