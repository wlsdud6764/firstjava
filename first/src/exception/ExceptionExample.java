package exception;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			String str1 = args[0];
			String str2 = args[1];
			System.out.println(str1);
			System.out.println(str2);
			int num1 = Integer.parseInt(str1);//
			int num2 = Integer.parseInt(str2);
			System.out.println("num1>>>" + num1);
			System.out.println("num2>>>" + num2);
		} catch (ArrayIndexOutOfBoundsException e) {// 입력된 배열값이 없을때
			// TODO: handle exception
			System.out.println("배열에러 발생");
//			e.getMessage();
//			e.printStackTrace();// 에러가 어디에서 생겼는지 가르쳐주는것
		} catch (NumberFormatException e) {
			System.out.println("숫자 변환에러가 발생");
//			e.getMessage();
//			e.printStackTrace();
		} catch (Exception e3) {

			System.out.println("알수없는 예외가 발생했습니다");
		}finally {//생략가능
			System.out.println("try 구문이 실행되면 항상 실행되는 내용기술");
		}
		System.out.println("프로그램의 끝부분");
	}
}
