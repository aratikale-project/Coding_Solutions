package com.in;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Write a program for counting the number of every character of a given text file.

public class Code31 
{
	private static void createFile(String inputfile, String text) {
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(inputfile));
			
			
			
		}
		catch(IOException e || FileN)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		String inputfile = "E://input6.txt";
		String text = "Arati Kale";
		createFile(inputfile,text);
		
	}
}
