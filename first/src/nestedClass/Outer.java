package nestedClass;

public class Outer {
	class B {
		B() {// 메소드
			System.out.println("B객체가 생성됨");
		}

		int fieldB;

		void methodB() {
			System.out.println("B메소드 호출");
		}
	}

	static class C {
		C() {
			System.out.println("C객체가 생성됨");
		}

		int fieldC;
		static int ieldCC;

		void methodC() {
			System.out.println("CC메소드 호출");
		}

		void methodCC() {
			System.out.println("CC메소드 호출");
		}

	}

}

interface D {
	int fieldd;
	static int ieldCd;
	 void method() {
		class F{
			F(){
				System.out.println("F객체가 생성");
	}
		int fieldF;
		void methodF() {
			System.out.println("F메소드 호출");
		}
	F f = new F();
	f.fieldF=10;
	f.methodF();
		}
	}

}
