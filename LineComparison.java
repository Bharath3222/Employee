package com.assignment.submit;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
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
		
	}

}
