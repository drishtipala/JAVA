package drishti;

import java.util.Scanner;

public class Sbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("Enter string: ");
		s1 = sc.next();
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse());
	}
}
