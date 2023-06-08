package drishti;

import java.util.Scanner;

public class CharCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		int i;
		boolean s;
		System.out.println("Enter two strings: ");
		s1 = sc.next();
		s2 = sc.next();
		if(s1.length()==s2.length())
		{
			for(i=0;i<s1.length();i++)
			{
				s = true;
				if(s1.charAt(i)==s2.charAt(i))
				{
				   s = false;
				}
			}
			System.out.println("String character are same");
		}else
		{
			System.out.println("String lengths are different");
		}	
	}
}
