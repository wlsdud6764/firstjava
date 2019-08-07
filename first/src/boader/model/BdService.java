package boader.model;

import java.util.List;

public interface BdService {

	public void registerBdr(Boader bdr, Boader[] ary);//게시글
	

	// 리스트 조회(전체)
	public void searchBdr(String userId);

    // 한건조회.
	public Boader getEBoader(String userId);

	// 리스트 조회(전체)
//		public List<Boader> getEmpList();

	// 리스트 조회(날짜지정)
	public List<Boader> getBdrList(String createdate);

	// 게시글등록
	public void insertBdr(String title, String contents);


	// 게시글수정
	public void updateBdr(String userId);

	// 게시글삭제
	
	public void deleteBdr(String bdrNo);

	public List<Boader> getbdrList();
//사용자등록

	public void insertUser(String userName, String userId, String pwd);


	public Boader getBoarder(String userId);


}
