package phonenumber;

public class Friend {
	String name;
	String phone;
	Friend(){}
	Friend(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	void get(String name, String phone) {
		for (int i = 0; i < fAry.length; i++) {
			if (fAry[i] == null)
				fAry[i] = new Friend(name, phone);
			break;
		} // for
	}
	void showInfo() {
		System.out.println("이름은" + name + ", 연락처는" + phone );
	}
}
