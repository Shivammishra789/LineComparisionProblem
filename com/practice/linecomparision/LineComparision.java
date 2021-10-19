package com.practice.linecomparision;

import java.util.*;

public class LineComparision {
	static double x1, x2, x3, x4, y1, y2, y3, y4;
	static double length1, length2;

	public static void main(String[] args) {
		input();
		calculateLength();
		checkEquality();
		compareLength();
	}
	public static void input() {
		Scanner endpoints= new Scanner(System.in); 

		//Taking start and end coordinates of line1 from user
		System.out.println("Enter coordinates for Line1 ");

		System.out.print("Enter x1 ");  
		x1= endpoints.nextInt();

		System.out.print("Enter y1 ");  
		y1= endpoints.nextInt();  

		System.out.print("Enter x2 ");  
		x2= endpoints.nextInt();  

		System.out.print("Enter y2 ");  
		y2= endpoints.nextInt();

		//Taking start and end coordinates of line2 from user
		System.out.println();

		System.out.println("Enter coordinates for Line2");

		System.out.print("Enter x3 ");
		x3= endpoints.nextInt();

		System.out.print("Enter y3 ");
		y3= endpoints.nextInt();

		System.out.print("Enter x4 ");
		x4= endpoints.nextInt();

		System.out.print("Enter y4 ");
		y4= endpoints.nextInt();

		System.out.println();

		System.out.println("Line1 coordinates are x1="+x1+"; y1="+y1+"; x2="+x2+"; y2="+y2);

		System.out.println("Line2 coordinates are x3="+x3+"; y3="+y3+"; x4="+x4+"; y4="+y4);
	}

	public static void calculateLength() {

		//Calculating length of lines		
		length1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

		length2 = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));

		System.out.println();

		System.out.println("The length of line1 is "+length1);

		System.out.println("The length of line2 is "+length2);
	}

	public static void checkEquality() {

		Double len1=length1;
		Double len2=length2;
		boolean result=len1.equals(len2);		//Using equals method to compare two length
		System.out.println();

		if(result==true){
			System.out.println("Length of both lines is same");
		}
		else
			System.out.println("Length of two lines are different");
	}

	public static void compareLength() {

		//Using CompareTo method to check greater equal or less than
		Double len1=length1;
		Double len2=length2;

		int result=len1.compareTo(len2);    //comparing line1 with line2

		System.out.println();

		if(result<0){
			System.out.println("Length of line1 is less than line2 ");
		}

		else if(result>0){
			System.out.println("Length of line1 is greater than line2 ");
		}
		else
			System.out.println("Both lines are of same length");
	}

}