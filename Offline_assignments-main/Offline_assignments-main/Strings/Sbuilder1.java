package drishti;

import java.util.Scanner;

public class Sbuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1,s2; 
		System.out.println("Enter strings: ");
		s1=sc.next();
		s2=sc.next();
		StringBuilder sb=new StringBuilder(s1);
		StringBuilder sb1=new StringBuilder(s2);
		StringBuilder s3 = sb.append(sb1);
		System.out.println(s3.toString());
	}
}
