package yedam;

public class Test {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(3 + "*" + (i) + "=" + (3 * (i)));
		}
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print((i * 5) + j + "\t");
			}
			System.out.println();
		}
		/* 첫번째 for은 세로, 두번째 for은 가로개수 결정 */
		System.out.println();
		
		
	}
}
