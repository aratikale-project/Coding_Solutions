package com.in;
// first take a number and & with 15 then left shift by 4  or right shift by 4
import java.util.Scanner;

public class Swap_nibbles {
	

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a=sc.nextInt();
		System.out.println("Original value :" + Integer.toBinaryString(a));
		
		int swapped=(((a & 15) << 4) | (a >> 4));
		System.out.println(swapped);
		System.out.println("Swapped Value :" +Integer.toBinaryString(swapped));

	}

}
