package api;

public class ObjectClass {
	String name;

	public ObjectClass() {
	}

	public static void main(String[] args) {
		Object obj = new Object();
		Object obj2 = new Object();
//		boolean result = obj1.equals(obj2);

		boolean result = (obj == obj2);
	}

	
}
