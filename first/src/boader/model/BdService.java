package boader.model;

import java.util.List;

public interface BdService {

	public void registerBdr(Boader bdr, Boader[] ary);//게시글
	public void registeruser(Boader bdr, userId[] ary2);
	

	// 리스트 조회(전체)
	public void searchBdr(int userId, Boader[] ary);

    // 한건조회.
	public Boader getEBoader(int userId);

	// 리스트 조회(전체)
//		public List<Boader> getEmpList();

	// 리스트 조회(날짜지정)
	public List<Boader> getBdrList(String createdate);

	// 게시글등록
	public void insertBdr(Boader bdr);

	// 게시글수정
	public void updateBdr(int userId);

	// 게시글삭제

	void deleteBdr(int bdrNo);

	public List<Boader> getbdrList();
}
