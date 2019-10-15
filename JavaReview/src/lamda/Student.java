package lamda;



public class Student implements Comparable<Student> {
	private String name;
	private int englishScore;
	private int mathScore;
	
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public String getName() { return name; }
	public int getEnglishScore() { return englishScore; }
	public int getMathScore() { return mathScore; }


	
//	@Override
//	public int compareTo(Student o) {
//		return this.getEnglishScore() - o.getEnglishScore();//양수a 음수 b 같다 0
//	}
	
	
}
