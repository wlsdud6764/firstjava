package yedam;

public class ReturnExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];
		for(int i = 0; i <=9; i++) {
			num[i] = i*5+5;
			System.out.println("배열" +i + "번째의 값은:" + num[i]);
		}
		
		int sum = 0;
		int[] num2 = new int[10];
		for(int i = 0; i <=9; i++) {
			sum+=num[i];
		}System.out.println("총합은 " + sum + "평균은" + (sum/10));
		
		int[] intArry = {1,2,3,45,7};
		int maxvalue = 0;
		for (int i =1; i< intArry.length; i++) {
			if(maxvalue < intArry[i])
				maxvalue = intArry[i];
		}
		System.out.println("최대값은 :" + maxvalue );
		
		

}
}

