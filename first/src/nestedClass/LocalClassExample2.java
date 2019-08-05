package nestedClass;

import phonenumber.MainClass;

public class LocalClassExample2 {
	interface HellowThere {
		void greet();

	}

	public static void greetInEnglish(String name) {
		class EnglishHelloThere implements HellowThere {
			String name;

			public EnglishHelloThere(String name) {
				this.name = name;
			}

			@Override
			public void greet() {
				// TODO Auto-generated method stub
				System.out.println("Hello" + this.name);

			}
		}

		HellowThere myGreeting = new EnglishHelloThere(name);
		myGreeting.greet();
	}

	public static void main(String[] args) {
		greetInEnglish("jinyoung");
	}
}
