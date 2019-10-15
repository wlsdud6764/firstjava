package lamda;

public class ReturnTest {

	public static void main(String[] args) {
		//클래스구현
		RetutnImpl returnimpl = new RetutnImpl();
		int total = returnimpl.sum(10, 20);
		System.out.println("클래스구현" +total );
		
		//익명객체
		ReturnInterface r2 = new ReturnInterface(){
			@Override
			public int sum(int a, int b) {
				return a+b;
			}
		};
		total = r2.sum(100, 200);
		System.out.println("익명구현" +total );
		
		//람다식
		ReturnInterface r3 =((int a, int b)->{
			return a+b;
		});
		total = r3.sum(500, 600);
		System.out.println("람다식" +total );
	}//main
}//class
