package boader.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import boader.impl.BdServiceImpl;
import boader.impl.UserDAO;
import boader.model.BdService;
import boader.model.Boader;

public class Borderch {
	BdService service = new BdServiceImpl();
	Scanner sc = new Scanner(System.in);

	public void execute() {
		String createdate, userName, userId, pwd,title,contents;
		int bdrno, orgno;
		
		UserDAO dao = new UserDAO();
		Map<String, String> map = dao.getUser();
//		Set<String> keySet = map.keySet();

		Map<String, List<Boader>> mapBdr = new HashMap<>();
		boolean flag = true;
		while (flag) {
			System.out.println("1)아이디 등록  2)로그인 3)전체 리스트  4)아이디 조회  5)작성일 조회  6)게시글작성  7)게시글 변경    8)게시글 삭제  9)댓글 삭제 10)종료");

			int menu = sc.nextInt(); sc.nextLine();
			switch (menu) {
			case 1: // 아이디 등록
				System.out.println("사용자 이름 >> ");
				userName = sc.nextLine();
				System.out.println("아이디 >> ");
				userId = sc.nextLine();
				System.out.println("비밀번호 >> ");
				pwd = sc.nextLine();
				service.insertUser(userName, userId,pwd);
				System.out.println("등록완료");
				break;

			case 2: // 로그인
				System.out.println("사용자 이름 >> ");
				userName = sc.nextLine();
				System.out.println("아이디 >> ");
				userId = sc.nextLine();
				System.out.println("비밀번호 >> ");
				pwd = sc.nextLine();
				break;

			case 3: // 전체 조회
				System.out.println(" 전체의 리스트을 조회합니다.");
				List<Boader> list = service.getbdrList();
				for (Boader bdr : list)
					System.out.println(bdr.getBdrno() + " " + bdr.getContents());
				break;
			case 4: // 한 사람 조회
			System.out.println("조회할 아이디 입력>>");
			userId = sc.nextLine();
			Boader bdr = service.getBoarder(userId);
			System.out.println(bdr.getBdrno()+bdr.getOrgno() + bdr.getTitle()+ bdr.getContents() );
			break;
//			case 5: // 작성일 조회
//				System.out.println("언제 이후 리스트를알고 싶나요?");
//				String hireDate = sc.next();
//				List<Boader> list2 = new ArrayList<>();
//				list2 = service.getBdrList(createdate)
//				for (Boader emp1 : list2)
//					System.out.println("Last Name: " + emp1.getLastName() + ", Hire Date: " + emp1.getHireDate());
//				break;
//			case 6: // 게시글 수정
//				System.out.print("변경할 게시글의 번호를입력하세요 >> ");
//				empId = sc.nextInt();
//				System.out.print("변경할 내용 >> ");
//				salary = sc.nextInt();
//				service.updateEmp(empId, salary);
//				System.out.println(" 변경 완료");
//				break;
//			case 7: // 게시글 삭제
//				System.out.print("삭제할 게시글번호 >> ");
//				bdrNo = sc.nextLine();
//				service.deleteBdr(bdrNo);
//				System.out.println("게시글 삭제 완료");
//				break;

//			case 8: // 댓글 삭제
//				System.out.print("삭제할 게시글번호 >> ");
//				empId = sc.nextInt();
//				service.deletebdr();
//				System.out.println("사원 삭제 완료");
//				break;
			case 6: // 게시글 등록
				System.out.print("제목 >> ");
				title = sc.next();
				System.out.print("내용 >> ");
				contents = sc.next();
				service.insertBdr(title, contents);
				System.out.println("게시글 등록 완료");
				break;
			case 8: // 종료
				System.out.println("프로그램 종료하겠음!");
				flag = false;

			}

		}
	}
}