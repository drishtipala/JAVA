package inheritance;

public class Single_pali {
	public static void palindrome(int a) {
		int num=0,n,r,t;
		t = a;
		while(a>0)
		{
			r = a%10;
			num = (num*10)+r;
			a=a/10;
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
