package loop;

import java.util.Scanner;

public class multi_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, i,res;
		System.out.print("Enter a number:");
		num = sc.nextInt();
		for(i=1;i<=10;i++)
		{
			res = num * i;
			
			System.out.println(" " +num+ " x " +i+ " = " +res);
		}

	}

}
