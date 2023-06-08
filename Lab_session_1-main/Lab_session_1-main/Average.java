package assignment_work;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,num;
		float avg=0;
		System.out.print("Enter numbers:\n");
		for(i=0;i<10;i++)
		{
			num = sc.nextInt();
			avg += num;
			System.out.println();
		}
		avg = avg/10;
		System.out.println("Average:\n"+avg);	
	}
}
