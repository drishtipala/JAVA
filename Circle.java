import java.util.Scanner;

public class Circle{
      
    public static void main(String args[]){
	    {
		    float radius;
			double AC, CC;
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter radius of the circle:");
			
			radius = scanner.nextInt();
			
			AC = 3.14*radius*radius;
            CC = 2*3.14*radius;
            
			System.out.println("Area of circle is:" + AC);
			System.out.println("Circumference of circle is:" + CC);
		}
	}
}
    