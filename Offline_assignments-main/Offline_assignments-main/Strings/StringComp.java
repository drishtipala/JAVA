package drishti;

public class StringComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Drishti";
		String s2 = "Drishti";
		String s3 = new String("Pala");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
	}
}
