package drishti;

public class Sbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1 = new StringBuilder("Drishti");
		StringBuilder s2 = new StringBuilder(" Pala");
		StringBuilder s3 = s1.append(s2);
		System.out.println(s3);
	}
}
