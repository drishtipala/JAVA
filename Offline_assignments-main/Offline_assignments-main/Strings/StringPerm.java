package drishti;

import java.util.Locale;
import java.util.Scanner;

public class StringPerm {
	Scanner sc = new Scanner(System.in);
	String s1;
	int i;
	char ch;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPerm obj = new StringPerm();
		obj.reverse();
		obj.permutation();
		obj.palindrome();
	}
	public void reverse()
	{
		System.out.println("Enter string to reverse: ");
		String rev="";
		s1 = sc.next();
		for(i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
	}
	public void permutation()
	{
		String per="";
		System.out.println("Enter string to permute: ");
		s1 = sc.next();
		if(s1.length()==0)
		{
			System.out.println(per);
		}
		for(i=0;i<s1.length();i++)
		{
			ch = s1.charAt(i);
			String s2 = s1.substring(0,i);
			String s3 = s1.substring(i+1);
			String s4 = s2+s3;
			System.out.println(s4+per+ch);
		}
	}
	public void palindrome()
	{
		String pali="";
		System.out.println("Enter string to check its palindrome: ");
		s1 = sc.next();
		s1=s1.toLowerCase();
		for(i=0;i<s1.length();i++)
		{
			ch = s1.charAt(i);
		    pali = ch+pali;
		}
		if(s1.equals(pali))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
	}
}
