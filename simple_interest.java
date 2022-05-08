import java.util.Scanner;

public class simple_interest{
    public static void main(String args[]){
	    {
		    int p, r, n;
			float simple_interest;
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter principal:" );
			System.out.print("Enter rate:");
			System.out.print("Enter number:");
			
			p = scanner.nextInt();
			r = scanner.nextInt();
			n = scanner.nextInt();
			
			
			
			simple_interest = (float)p*r*n/100;
			
			System.out.println("Simple Interest is:" + simple_interest);
		}
	}
}
			
			