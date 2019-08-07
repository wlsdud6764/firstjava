
package Animall;
abstract class Animall{
//	추상클래스
	public String kind;
	public void breathe() {
		System.out.println("숨을쉰다");
	}
	
	public abstract void sound();
	
}
class Cat extends Animall{
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}
	
}
class Dog extends Animall{
	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}
	
}


public class AnimallEample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breathe();
		dog.sound();
		Cat cat = new Cat();
		cat.breathe();
		cat.sound();
	}

}
