package assignment_work;

import java.util.Scanner;

public class Sum_prod_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		int i,sum=0,prod=1;
		System.out.print("Enter numbers:\n");
		a = new int[4];
		for(i=0;i<4;i++)
		{	
			
		    a[i]=sc.nextInt();
		    sum = sum + a[i] ;
	        prod = prod * a[i] ;
			
		}
	    System.out.print("Sum of Array Elements are:\n" + sum);
	    
	    System.out.print("\nProduct of Array Elements are:\n" + prod);
	    
	}

}
