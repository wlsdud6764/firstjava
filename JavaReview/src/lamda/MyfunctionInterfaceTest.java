package lamda;

class MyfunctionImpl implements MyfunctionInterface{
	@Override
	public void method(int X) {
		System.out.println("result:" + X);
	}

}
public class MyfunctionInterfaceTest {
	public static void main(String[] args) {
		//구현클래스
		MyfunctionImpl myfunction = new MyfunctionImpl();
		myfunction.method(10);
		//익명클래스
		MyfunctionInterface myfunction2 = new MyfunctionInterface(){//상속 받아서 만들겠다
			@Override
			public void method(int X) {
				System.out.println("result:" + X);
			}
		};
		myfunction2.method(20);
		MyfunctionInterface myfunction3 = (int X) ->{//추상메소드에 매개변수(int 생략가능)와 바디만 가져오면됨
			System.out.println("람다 result:" + X);
		};
		myfunction3.method(0);
	}
}
