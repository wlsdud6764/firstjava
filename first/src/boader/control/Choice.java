package boader.control;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import boader.impl.BdServiceImpl;
import boader.model.BdService;
import boader.model.Boader;

public class Choice {
	BdService service = new BdServiceImpl();
	Scanner sc = new Scanner(System.in);

	public void execute() {
//		DeptDAO dao = new DeptDAO();
//		Map<Integer, String> map = dao.getDept();
//		Set<Integer> keySet = map.keySet();
		
		System.out.println("1)사용자 등록 2)로그인  3)전체게시글보기 4)조회 ");
		int menu = sc.nextInt();
		sc.nextLine();
		if (menu == 1) {
			System.out.println("아이디를 입력하세요");
			String userId = sc.nextLine();
			if(userId.equals(ary[i].getuserId()) ) {
				System.out.println("이미있는 아이디입니다");
			}
			System.out.println("비밀번호를 입력하세요");
			String password = sc.nextLine();
			if(ary[i] != null && ary[i].get() == userId)
				
			}
		
		if (menu == 2) {
			System.out.println("아이디를 입력하세요");
			String userId = sc.nextLine();
			System.out.println("비밀번호를 입력하세요");
			String password = sc.nextLine();
			if(ary[i] != null && ary[i].get() == userId)
				
			}
			else if (menu == 3) {
			List<Boader> list = service.getbdrList();
			for (Boader bdr : list) {
				System.out.println(bdr.getTitle());
			}
		} else if (menu == 4) {
			System.out.println("1)아이디로 조회  2)제목으로조회");
			menu = sc.nextInt();
			if (menu==1) {
				System.out.println("아이디를 입력하세요");
				int userId = sc.nextInt();
				ifBoader bdr = service.getBoarder(userId);
				System.out.println(bdr);	
			}
		}
	}
}
