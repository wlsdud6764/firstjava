package boader.model;

public class Boader {//게시물
	int bdrno;//게시물번호
	int orgno;
	String title;
	String contents;
	String userId;
	
	public Boader(int bdrno, int orgno, String title, String contents, String userId) {
		super();
		this.bdrno = bdrno;
		this.orgno = orgno;
		this.title = title;
		this.contents = contents;
		this.userId = userId;
	}
	public int getBdrno() {
		return bdrno;
	}
	public void setBdrno(int bdrno) {
		this.bdrno = bdrno;
	}
	public int getOrgno() {
		return orgno;
	}
	public void setOrgno(int orgno) {
		this.orgno = orgno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "번호"+ bdrno + "아이디: " + userId + "제목 : " + title  +  "내용 "  + contents;
	}
	



	}
	
