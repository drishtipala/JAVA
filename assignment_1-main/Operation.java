import java.util.Scanner;

public class Operation{
    public static void main(String args[]){
	    {
		    int first, second, add, sub, mul;
			float div;
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter two numbers: ");
			first = scanner.nextInt();
			second = scanner.nextInt();
			
			add = first + second;
			sub = first - second;
			mul = first * second;
			div = (float)first / second;
			
			System.out.println("Addition:" + add);
			System.out.println("Subtraction:" + sub);
			System.out.println("Multiplication:" + mul);
			System.out.println("Divison:" + div);
			
		}
	}
}