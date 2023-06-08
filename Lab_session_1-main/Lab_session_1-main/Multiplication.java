package assignment_work;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplication obj = new Multiplication();
		obj.Multiplication_first();
		obj.Multiplication_second();
		obj.Multiplication_third();
	}
	//Mutilpication Table of 24
	public void Multiplication_first()
	{
		int num = 24,mul;
		System.out.println("Multiplication table of 24:");
        for(int i = 1; i <= 10;i++)
        {
        	mul = num*i;
        	System.out.println(" " +num+ " x " +i+ " = " +mul);   
        }
	}
	//Mutilpication Table of 50
	public void Multiplication_second()
	{
		int num = 50,mul;
		System.out.println("\n\nMultiplication table of 50:");
        for(int i = 1; i <= 10; ++i)
        {
        	mul = num*i;
        	System.out.println(" " +num+ " x " +i+ " = " +mul);
        }
	}
	//Mutilpication Table of 29
	public void Multiplication_third()
	{
		int num = 29,mul;
		System.out.println("\n\nMultiplication table of 29:");
        for(int i = 1; i <= 10; ++i)
        {
        	mul = num*i;
        	System.out.println(" " +num+ " x " +i+ " = " +mul);
        }
	}
}