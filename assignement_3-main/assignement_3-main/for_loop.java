package loop;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,sp,ep,num;
		System.out.print("Enter starting point:");
		sp = sc.nextInt();
		System.out.print("Enter ending point:");
		ep = sc.nextInt();
		
		
		if(sp<ep)
		{
		
		   for(i=sp;i<=ep;i++)
		   {
			System.out.println("\t"+i);
		   }
		}
	    else
		 {
			for(i=sp;i>=ep;i--)
			{
				System.out.println("\t"+i);
			}
		 }
		

	}

}
