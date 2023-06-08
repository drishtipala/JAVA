package drishti;

import java.util.Scanner;

public class String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1,s2,s3,s4;
		System.out.println("Enter strings:");
		s1 = sc.next();
		s2 = sc.next();
		s3 = sc.next();
		s4 = sc.next();
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));

	}

}
