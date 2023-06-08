package drishti;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Drishti" + " Pala";
		String s2 = (new StringBuilder()).append("Drishti").append(" Pala").toString();
        System.out.println(s2);
	}
}
