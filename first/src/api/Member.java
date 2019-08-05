package api;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {//매개값이 Member인지 확인
			Member member = (Member) obj; //Member타입으로 강제타입변환,id 필드 값이 동일한지 검사후 동일하면 true
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
//id가 동일한 문자일경우 같은 해시코드를리턴
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
