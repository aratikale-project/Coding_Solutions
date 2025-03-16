package com.in;

public class Code_Recursion17 {

	public static void main(String[] args) {
		int n =123;
		System.out.println(isPalindrome(n));

	}

	private static boolean isPalindrome(int n) {
		int rev =0;
		int rem = 0;
		
		if(n != rev)
		{
			return false;
		}
		
		return  isPalindrome(n/10);
		//(rev * 10 + rem) +
		
	}

}
