package generic;

import java.util.Arrays;

class Course<T>{
	private String name;
	private T[] students;
	public Course(String name,int capcity) {
		this.name = name;
		students = (T[]) new Object[capcity];
		
	}
	public String getName() {
		return this.name;
	}
	public T[] getStudentss() {
		return this.students;
	}
	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i]==null) {
				students[i]=t;
				break;
			}
			
		}
	}
}
class Person{
	
}
class Worker extends Person {
	
}
class Student extends Person {	
}
class Hightsh extends Student{
	
}

public class WildCardExample{
	public static void registerCourse(Course<? >course) {//<? 상위클래스의 타입을 받아온다 
		System.out.println(course.getName() + "수강생" + 
							Arrays.toString(course.getStudentss()));
	}
	public static void registerCourseWorker(Course <? super Worker> course) {
		System.out.println(course.getName() + "수강생" + 
				Arrays.toString(course.getStudentss()));	
	}
	public static void registerCourseStudent(Course <? extends Student> course) {
		System.out.println(course.getName() + "수강생" + 
				Arrays.toString(course.getStudentss()));	
	}
	public static void main(String[] args) {
		Course<Person> personCourse = new Course("일반인 과정", 5);
		Course<Worker> workerCourse = new Course("직장인", 5);
		Course<Student> studentCourse = new Course("학생과정", 5);
		Course<Hightsh> highCourse = new Course("고등학생과정", 5);
		//일반인
		personCourse.add(new Person());
		personCourse.add(new Worker());
		personCourse.add(new Student());
		personCourse.add(new Hightsh());
		//직장인
		workerCourse.add(new Worker());
		//학생과정
		studentCourse.add(new Student());
		studentCourse.add(new Hightsh());
		//고등학생과정
		highCourse.add(new Hightsh());
		
		//매개값확인
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highCourse);
		//<? super Worker>
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//<? extends Student>
		registerCourseStudent(highCourse);
		registerCourseStudent(studentCourse);
	}
}
