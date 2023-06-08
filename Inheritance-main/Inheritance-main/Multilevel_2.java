package inheritance;

import java.util.Scanner;

public class Multilevel_2 extends Multilevel_1{
	public static void SOD(int num) {
		int sum=0,digit;
		while(num > 0)  
		{  
			//finds the last digit of the given number    
			digit = num % 10;  
			//adds last digit to the variable sum  
			sum = sum + digit;  
			//removes the last digit from the number  
			num = num / 10;  
		}  
		//prints the result  
		System.out.println("Sum of Digits: "+sum);  
	}
	

}
