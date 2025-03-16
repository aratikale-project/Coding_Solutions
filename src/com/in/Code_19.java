package com.in;

public class Code_19 {

	public static void main(String[] args) {
		int n =123;
		System.out.println(sum(n));

	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		int rem,sum=0;
		while(n > 0)
		{
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
			
		}
		return sum;
	}

}
