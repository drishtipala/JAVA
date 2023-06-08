package assignment_work;

import java.util.Scanner;

public class Second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);   
        int a[] = new int[10];
        int  i,j,temp;
        System.out.println("Enter numbers:");
        for ( i = 0; i < 10; i++) 
        {
            a[i] = s.nextInt();
        }
        for ( i = 0; i < 10; i++) 
        {
            for ( j = i + 1; j < 10; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+a[10-2]);				
	}
}
