package generic;

public class CompareMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer, String> p1 = new Pair<>(10,"bok");
		Pair<Integer, String> p2 = new Pair<>(10,"bok");
		boolean result = Utill.compare(p1, p2);
		if(result)
			System.out.println("동일한 객체입니다");
		else {
			System.out.println("아닙니다");
		}

	}

}
