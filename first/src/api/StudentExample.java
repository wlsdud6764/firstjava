package api;

import java.util.HashMap;

public class StudentExample {
	public static void main(String[] args) {
		HashMap<Studnet, String>hashMap = new HashMap<Studnet, String>();
		hashMap.put(new Studnet("1"),"95");
		String score = hashMap.get(new Studnet("1"));
		System.out.println("1번 학생의 총점은 " + score);
	}

}
