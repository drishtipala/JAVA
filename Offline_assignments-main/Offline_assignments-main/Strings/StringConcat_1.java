package drishti;

import java.util.Scanner;

public class StringConcat_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter strings: ");
		s1 = sc.next();
		s2 = sc.next();
		String s3 = (new StringBuilder()).append(s1).append(s2).toString();
		System.out.println(s3);

	}

}
