package nestedClass;

public class OuterExample {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method();
		
		Outer.B b = outer.new B();
		b.fieldB = 10;
		b.methodB();
		
		
		Outer.C c = new outer.C();
		c.fieldB = 10;
		c.methodB();
		
		
		Outer.C fieldCC = 10;
		Outer.C.methodCC()
		
		
	}

}
