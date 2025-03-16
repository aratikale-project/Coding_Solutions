package com.in;

public class Code_17 {

	public static void main(String[] args) {
		int n =121;
		
		System.out.println(isPalindrome(n));

	}

	private static boolean isPalindrome(int n) {
		int rev=0;
		int rem =0;
		int x = n;
		
		while(x > 0)
		{
			rem = x % 10;
			rev = rev * 10 + rem;
			x = x /10;
			
		}
		if(rev == n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
