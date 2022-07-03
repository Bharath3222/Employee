package com.assignment.submit;

import java.util.Scanner;

public class LineComparison 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first line coordinates : ");
		int x1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int y2 = scanner.nextInt();
		System.out.println(
				"entered coordinates for line1 are : " + "(" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")");
		int Line = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
		double LengthOfLine = Math.sqrt(Line);

		System.out.println("Length of Line 1 is : " + LengthOfLine);
		
		System.out.println("Enter second line coordinates : ");
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int b1 = scanner.nextInt();
		int b2 = scanner.nextInt();
		System.out.println(
				"entered coordinates for line1 are : " + "(" + a1 + "," + b1 + ") and (" + a2 + "," + b2 + ")");
		int Line2 = ((a2 - a1) * (a2 - a1)) + ((b2 - b1) * (b2 - b1));
		double LengthOfLine_2 = Math.sqrt(Line2);

		System.out.println("Length of Line 2 is : " + LengthOfLine_2);
		// uc2
		if (LengthOfLine == LengthOfLine_2)
			System.out.println("Both lines are equal");
		else 
			System.out.println("Both lines are not equal");
			
	}

	}
