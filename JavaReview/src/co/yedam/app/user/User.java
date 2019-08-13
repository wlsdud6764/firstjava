package co.yedam.app.user;

public class User {
	private int USER_ID;
	private int USER_NAME;
	private int PWD;
	
	
	
	
	//읽기(조회) 접근메소드( getter&setter)
	public int getUSER_ID() {
		return USER_ID;
	}
	//쓰기(변경)
	public void setUSER_ID(int uSER_ID) {
		USER_ID = uSER_ID;
	}
	public int getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(int uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public int getPWD() {
		return PWD;
	}
	public void setPWD(int pWD) {
		PWD = pWD;
	}
	

}
