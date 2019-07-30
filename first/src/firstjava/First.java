package firstjava;

public class First {
	public static void main(String[] args) {        //메소드(매개값)
		System.out.println("Hellow world");
		/*자바로 만든 첫번째 프로그램입니다
		 * 2019/07/17*/
		System.out.println("  *");
		System.out.println(" ***");
		System.out.println("*****");
		System.out.println();
		System.out.println(3*5);
		for(int i=0; i<5; i++) {
			//System.out.println("i의값은:" + i);
			startProgram(i+1); 
		}
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum = sum +i;
		}
		System.out.println(sum);
		
		introduce("복진영",25,158.5);
		mod(3,2);
		div(3,2);
		sum(2,3);
		System.out.println("End of Program");
		
		sum2(3,10);
		}
	
	
	static void sum2 (int x, int y) {
		int sum = 0;
		for(int i=x; i<=y; i++) {
			sum = sum +i; 
		}
		System.out.println("sum2:" + sum);
	}
	
	static void introduce ( String name, int age, double hight) {
		System.out.println("이름은:" +name + "나이는:" + age + "키는:" +hight) ;
		}
	
	static void mod ( int a, int b) {
		System.out.println("mod result:" + (a%b)) ;
	}
	static void div ( int a, int b) {
		System.out.println("div result:"+((double)a/(double)b));
	}
	static void sum(int x, int y) {
		System.out.println("sum result:"+(x+y));
	}
	static void startProgram(int x) { //메소드
		int a,b,c; // - 정수 ,double, short, byte, long
		a=1;
		b=2;
		c=(a+b)* x ;
		System.out.println("Result:"+c);
	}
}
