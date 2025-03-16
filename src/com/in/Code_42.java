package com.in;

public class Code_42 {
	private static void subString(String str) {
		int n = str.length();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}
	public static void main(String[] args) {
		String str = "abc";
		subString(str);

	}
}
