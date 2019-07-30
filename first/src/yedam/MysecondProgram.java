package yedam;

public class MysecondProgram {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i < 11; i++) {
			 sum+=i;//sum+=i			
		}System.out.println("1~10의 합:" + sum);
		
		
		 sum=0;
		for (int i = 0; i < 11; i++) {
			i = i+2; //i+=2
			sum+=i;
		}System.out.println("짝수의 합:" + sum);
		
		sum=0;
		int i=1;
		while(i<11) {
			sum+=i;
			i++;
		}System.out.println("1~10의 합:" + sum);
		
		sum=0;
		i=1;
		while(i<11) {		
			sum+=i;
			i = i+2;
		}System.out.println("홀수의 합:" + sum);
		
		
		
		
		
	}

}
