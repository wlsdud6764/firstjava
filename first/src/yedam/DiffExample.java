package yedam;

public class DiffExample {

	public static void main(String[] args) {
		// 메소드의 유용성
		int a,b,c,d;
		a= 3;
		b=5;
		c=7;
		d=9;
		diff(a,b);
		sum(10);
		summ(20);
	}
	static void diff(int x, int y) {
		if(x>y) {
			System.out.println(x -y);
		}
		else {
			System.out.println(y - x);
		}
	}
	static void sum(int x) {
		int sum =0;
		int i=1;
		while(i<=x) {
			sum+=i;
			i++;
		}System.out.println("1~10의 합:" + sum);
	}
	
	static void summ(int x) {
		int sum;
		sum=0;
		int i=1;
		while(i<=x) {
			sum+=i;
			i++;
		}System.out.println("1~20의 합:" + sum);
		
	}

}
