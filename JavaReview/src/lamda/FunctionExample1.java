package lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(new Student("홍길동", 90, 96), new Student("이순신", 95, 93));

	public static void printString(Function<Student, String> function) {
		for (Student student : list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Function<Student, String> function = t -> t.getName();// Function<매개변수, return타입>
		Function<Student, Integer> function2 = t -> t.getEnglishScore();
		Function<Student, Integer> function3 = t -> t.getMathScore();
		Student std = new Student("홍길동", 90, 96);
		System.out.println("학생이름: " + function.apply(std));
		System.out.println("영어점수: " + function2.apply(std));
		System.out.println("수학점수: " + function3.apply(std));

	}
}
