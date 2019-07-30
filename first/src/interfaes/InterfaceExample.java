package interfaes;

public class InterfaceExample {

	public static void main(String[] args) {
		ImplementC imp1 = new ImplementC();
		IntefaceA ia = imp1;
		ia.methodA();
		
		InterfaceB ib = imp1;
		ib.methodB();
		
		InterfaceC ic = imp1;
		ic.methodC();

	}

}
