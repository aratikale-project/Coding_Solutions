package com.in;

public class Code_45 {
	private static int sumOfDigit(int num) {
//		int sum=0;
//		while(num > 0)
//		{
//			sum = sum + num % 10;
//			num = num / 10;
//		}
//		return sum;
		
		if(num == 0)
		{
			return 0;
		}
		return num % 10 +sumOfDigit(num/10);
	}


	public static void main(String[] args) {
		int num = 12345;
		System.out.println(sumOfDigit(num));

	}
}
