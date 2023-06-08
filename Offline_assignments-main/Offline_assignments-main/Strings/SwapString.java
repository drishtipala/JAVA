package drishti;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter two strings: ");
		s1 = sc.next();
		s2 = sc.next();
		System.out.println("Strings before swapping: "+s1+" "+s2);
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("Strings after swapping: "+s1+" "+s2);
	}
}
