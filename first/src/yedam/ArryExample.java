package yedam;

public class ArryExample {
	public static void main(String[] args) {
		int arry[][] = new int[5][5];
		int a = 1;
//=========================================================================================================================================================
		System.out.println("입력,출력 for문 따로");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arry[i][j] = a++;	
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("[%d][%d]=%2d ",i,j,arry[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("거꾸로 출력");
		for (int j = 4; j >=0; j--) {
			for (int i = 0; i < 5; i++) {
				System.out.printf("[%d][%d]=%2d ",i,j,arry[i][j]);
			}System.out.println();
		}
		
		//=========================================================================================================================================================		
		System.out.println();
		System.out.println("입력,출력 for문 같이 하나로");
		a=1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {				
				arry[i][j] = a++;	
				System.out.printf("[%d][%d]=%2d ",i,j,arry[i][j]);
			}System.out.println();
		}

	}
}

