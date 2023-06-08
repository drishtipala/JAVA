package drishti;

import java.util.Scanner;

public class String_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("Enter strings: ");
		s1 = sc.next();
		System.out.println("Original String: "+s1);
		System.out.println("Substring index from: "+s1.substring(5));
		System.out.println("Substring index from : "+s1.substring(0,4));
	}
}
