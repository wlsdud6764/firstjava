package employee.control;

import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("iiii");
//		int tel = 0;
//		try {
//			 tel = Integer.parseInt(sc.nextLine());
//		} catch (Exception e) {
//			tel = 0;
//		}
//		System.out.println("tel => " + tel);
		EmpProc proc = new EmpProc();
		proc.execute();
	}
}
