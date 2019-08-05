package nestedClass;

public class LocalclassExample {
	static String regularExpression = "[^0-9]";
	private static void validatePhomeNumber(String pNo1, String pNo2) {
		final int numberLength = 10;
		class PhoneNumber{
			String formattedPhoneNumber = null;
			PhoneNumber(String PhoneNumber) {
				String currentNumber=
						PhoneNumber.replaceAll(regularExpression, "");//replaceAll(앞,뒤)앞애있는 표현을 뒤에있는 표현으로 바꾼다
				if(currentNumber.length() == numberLength)
					formattedPhoneNumber=currentNumber;
				else 
					formattedPhoneNumber=null;
			}
				public String getNumber() {
					return formattedPhoneNumber; 
				}
		}//end of PhoneNumber class
		PhoneNumber myNo1 = new PhoneNumber(pNo1);
		PhoneNumber myNo2 = new PhoneNumber(pNo2);
		if(myNo1.getNumber()==null)
			System.out.println("first Number is invalid");
		else 
			System.err.println("first Number is" + myNo1.getNumber());
		
		if(myNo2.getNumber()==null)
			System.out.println("first Number is invalid");
		else 
			System.err.println("first Number is   " + myNo2.getNumber());
		
		
	}

	public static void main(String[] args) {
//		String str = "010-1234-5678";
//		String changedStr = str.replaceAll("[^0-9]", "*");// ^아닌것
//		System.out.println("changedStr");
		validatePhomeNumber("12-3456-7890","4567-7890");
	}

}
