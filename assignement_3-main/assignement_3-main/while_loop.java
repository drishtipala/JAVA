package loop;

import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fact = 1,num,i=1;
		System.out.print("Enter a number:");
		num = sc.nextInt();
		
		while(i<=num)
		{
			fact = fact*i;
			i++;
			
		}
		System.out.println("Factorial of number is:"+fact);
		
		

	}

}
