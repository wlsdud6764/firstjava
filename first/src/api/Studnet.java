package api;

public class Studnet {
	private String studentNum;
	public Studnet(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Studnet) {
			Studnet studnet = (Studnet) obj;
			if(studentNum.equals(studnet.studentNum)) {
				return true;
			}
		}
		return false;
	}

}
	

