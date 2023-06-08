package inheritance;

import java.util.Scanner;

public class Palin_result extends Single_pali{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palin_result obj = new Palin_result();
		obj.palin();
	}
	public static void palin() {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter Number:\n");
		n = sc.nextInt();
		palindrome(n);

	}

}
