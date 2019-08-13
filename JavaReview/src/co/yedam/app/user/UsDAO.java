package co.yedam.app.user;

import java.util.List;

import co.yedam.app.dept.Departments;

public interface UsDAO {

	// 등록
	void insert(User us);

	// department_name 수정
	void update(User us);

	// 삭제
	void delete(int us_id);

	// 단건조회
	Departments selectOne(int us_id);

	// 전체조회
	List<User> selectAll();

}
