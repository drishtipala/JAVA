package inheritance;

import java.util.Scanner;

public class Multilevel_1 {
	public static void reverse_no(int n) {
		int rem,rev=0;
		while(n!=0)
		{
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		System.out.println("Reverse number of the given number is:" + rev);
	}
}
