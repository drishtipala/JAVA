package inheritance;

import java.util.Scanner;

public class Multi_result extends Multilevel_2 {
        public static void main(String[] args) {
        	// TODO Auto-generated method stub
        	Multi_result obj = new Multi_result();
        	obj.process();
        }
		public static void process() {
		   Scanner sc = new Scanner(System.in);
		   int n;
		   System.out.print("Enter numbers:\n");
		   n = sc.nextInt();
		   reverse_no(n);
		   SOD(n);
	}
}
