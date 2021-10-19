package com.practice.linecomparision;

import java.util.*;

public class LineComparision {

	public static void main(String[] args) {

		Scanner endpoints= new Scanner(System.in); 

		//Taking start and end coordinates of line from user

		System.out.print("Enter x1 ");  
		double x1= endpoints.nextInt();

		System.out.print("Enter y1 ");  
		double y1= endpoints.nextInt();  

		System.out.print("Enter x2 ");  
		double x2= endpoints.nextInt();  

		System.out.print("Enter y2 ");  
		double y2= endpoints.nextInt();

		System.out.println("Entered values are x1="+x1+"; y1="+y1+"; x2="+x2+"; y2="+y2);

		//Calculating length of line

		double length=Math.sqrt(Math.pow((x2-x1),2) +Math.pow((y2-y1),2));

		System.out.println("The length of line is "+length);



	}

}