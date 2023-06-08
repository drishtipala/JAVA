package drishti;

import java.util.Scanner;

public class StringComp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter two strings: ");
		s1 = sc.next();
		s2 = sc.next();
		if(s1.compareTo(s2)==s2.compareTo(s1))
		{
			System.out.println("Both strings are same");
		}
		else
		{
			System.out.println("Both strings are different");
		}	
	}
}
