package generic;

import java.applet.Applet;

class Box<T>{
	private T object;
	public void set(T object) {
		this.object=object;
	}
	public T get() {
		return this.object;
	}
}
class Apple{
	
}
class Orange{
	
}
public class BoxExample {
	public static void main(String[] args) {
		
		Box<String>box = new Box<String>();
		box.set("Hello");
		String restr = box.get();
		
		Box<Integer> boxInt = new Box<Integer>();
		boxInt.set(new Integer(10));
		Integer retInt = boxInt.get();
		
		Box<Apple> boxApple = new Box<Apple>();
		boxApple.set(new Apple());
		Apple retApple = boxApple.get();
		
//		Box box = new Box;
//		box.set("hello");
//		String reStr = (String) box.get();
//		box.set(new Integer(10));
//		Integer retInt = (Integer) box.get();
//		box.set(new Apple());
//		Apple retApple = (Apple)
	}

}
