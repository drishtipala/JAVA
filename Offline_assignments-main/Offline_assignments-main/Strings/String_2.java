package drishti;

import java.util.Scanner;

public class String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1,s2,s3;
		System.out.println("Enter a String:");
		s1=sc.next();
		System.out.println("Enter a String to concatenate:");
		s2 = sc.next();
		s3=s1.concat(s2);
		System.out.println("After concatenation:");
		System.out.println(s3);
	}
}
