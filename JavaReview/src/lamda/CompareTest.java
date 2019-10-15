package lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTest {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90, 96),
				new Student("이순신", 95, 93),
				new Student("복진영", 100, 100)
				);
		Collections.sort(list,new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
	});
		//람다
		Collections.sort(list,(o1, o2) -> o1.getName().compareTo(o2.getName()));
	
	
	
}
}
