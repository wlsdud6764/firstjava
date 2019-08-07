package boader.model;

public class Boader {//게시물
	int bdrno;//게시물번호
	int orgno;//댓글	번호
	String title;
	String contents;
	String creatdate;
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
	
	
	}
	
