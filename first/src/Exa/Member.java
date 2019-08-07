package Exa;


public class Member {
	String name;
	int age;
	
	

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member compare = (Member) obj;
			if(this.name == compare.name) {
				return true;
			}
		} 
		return false;
	}




}
