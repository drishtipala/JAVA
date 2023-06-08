package assignment_work;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=0,n,r,t;
		System.out.print("Enter Number:\n");
		n = sc.nextInt();
		t = n;
		while(n>0)
		{
			r = n%10;
			num = (num*10)+r;
			n=n/10;
		}
		if(t==num)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not a Palindrome");
		}

	}

}
