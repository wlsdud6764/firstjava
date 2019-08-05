package nestedClass;

public class LocalClassExample3 {
	interface HelloWirld{
	public void greet();
	public void greetSomeone(String someone); 
	
public void sayHello() {
	class EnglishGreeting implements HelloWirld{
		String name ="world";

		@Override
		public void greet() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void greetSomeone(String someone) {
			name=someone;
			System.out.println("Hello" + name);
			
		}
	}
		
		HelloWirld englishGreeting = new EnglishGreeting();
		englishGreeting.greet();
		
		HelloWirld frenchGreeting = new HelloWirld();
		String name = "tout le monde"
		
	}
	
}
public static void main(String[] args) {
	LocalClassExample3 myExe = new LocalClassExample3();
	myExe.sayHello();
	
}
}
