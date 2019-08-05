package generic;

import java.util.Scanner;

public class NumvberExample {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int result = Utill.Compare(30, 20);
		System.out.println(result);
		System.out.println("두개의 값을입력하세요");
//		compareStr(null, null);
//		st1=sc.nextline();
//		st2=sc.nextline();	
//		String result1=compareStr("agg", "ssd");
//		System.out.println(result1);
		
	}

	static String compareStr(String st1, String st2) {
		
			
		String same="같다";
//		if (st1.length() > st2.length()) {
//			return st1;
////			System.out.println(st1);
//		} else if(st1.length() < st2.length()){
//			return st2;
////			System.out.println(st2);
//		}
//		else	return same;
		 int a= Integer.compare(st1.length(), st2.length());
		 if(a==1)
			 return st1;
		 else if(a==-1)
			 return st2;
		 else return same;
					 
		
	}

}
