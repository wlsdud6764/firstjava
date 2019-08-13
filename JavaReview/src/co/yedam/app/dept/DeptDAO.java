package co.yedam.app.dept;

import java.util.List;


public interface DeptDAO {

	// 등록
	void insert(Departments dept);

	// department_name 수정
	void update(Departments dept);

	// 삭제
	void delete(int dept_id);

	// 단건조회
	Departments selectOne(int dept_id);

	// 전체조회
	List<Departments> selectAll();

}