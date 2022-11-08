package com.selenium.practice;

import java.util.Scanner;

public class Test {

	
	
	public static void main(String[] args) {

		int a;
		int b;
		int c;
		
		Scanner s = new Scanner(System.in);
		
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		System.out.println(a+" "+b+" "+c);
		
	
		//int sMin1 = Math.min(Math.max(a, b), c);
		
		//System.out.println(sMin1);
		
		if( a > b )
		{
			if( a < c)
			{
				System.out.println("second smallest is "+a);
			}
			else
			{
				System.out.println("second smallest is "+c);
			}
		}
		else
		{
			if( b < c)
			{
				System.out.println("second smallest is "+b);
			}
			else
			{
				System.out.println("second smallest is "+c);
			}
		}
		
		
			
		}
		
		
		
		
		

	}


