package com.in;

public class BinaryNumber 
{
	/*private static void isBinary(int num)
	{
		boolean binary=true;
		int copynumber = num;
		while(copynumber != 0 )
		{
			int rem = copynumber % 10;
			if(rem > 1)
			{
				binary=false;
				break;
			}
			else
			{
				copynumber=copynumber/10;
			}
		}
		if(binary)
		{
			System.out.println(num + "is a Binary Number");
		}
		else
		{
			System.out.println(num + "is Not Binary Number");
		}
	}*/
	public static void main(String[] args)
	{
		int num=101678;
		//isBinary(num);
		if(String.valueOf(num).matches("[0,1]+"))
		{
			System.out.println(num + " Number is Binary");
		}
		else
		{
			System.out.println(num + " Number is not binary");
		}

	}

	

}
