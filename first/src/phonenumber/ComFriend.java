package phonenumber;

public class ComFriend extends Friend{
	String department;
	
	public ComFriend() { super();}
	ComFriend(String name, String phone, String department){
		super(name, phone);
		this.department = department;
	}
	
	void get(String name, String phone, String major) {
		for (int i = 0; i < fAry.length; i++) {
			if (fAry[i] == null)
				fAry[i] = new Friend(name, phone);
			break;
		} // for
	
	@Override
	void showInfo() {
		System.out.println("이름은" + name + ", 연락처는" + phone + ", 전공은" +  department);
	}

}
