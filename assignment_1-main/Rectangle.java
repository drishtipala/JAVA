import java.util.Scanner;

public class Rectangle{
	public static void main(String args[]){
		{
			int l, b, AR, PR;
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter length of Rectangle:");
			System.out.print("Enter breadth of Rectangle:");
			
			l = scanner.nextInt();
			b = scanner.nextInt();
			AR = l*b;
			PR = 2*(l+b);
			System.out.println("Area of Rectangle is:" + AR);
			System.out.println("Perimeter of Rectangle is:" + PR);
		}
	}
}
			
    