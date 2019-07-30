package yedam;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		
		
		Student[ ] stuArry = new Student[3];
		int a =0;
		while(true) {
			Student s1 = new Student();
			System.out.println("이름을 입력하세요.");
			s1.setName(sc.next());
			System.out.println("나이을 입력하세요.");
			s1.setAge(sc.nextInt());
			System.out.println("키를 입력하세요.");
			s1.setHight(sc.nextDouble());
			
			
			stuArry[a] =s1;
			a++;
			if(a >= 3)
				break;
		}
		for(Student st : stuArry) {
			System.out.println(st.getName());
		}
//=============================================================================================================================================		
		
		Student st1 = new Student(); // 인스턴스 생성
		st1.setName("복진영");
		st1.setMajor("중국학");
		st1.setAge(25);
		st1.setHight(160);
		Student st2 = new Student();
		st2.setName("홍길동");
		st2.setMajor("무과");
		st2.setAge(25);
		st2.setHight(160);
		//필드
		System.out.println(st1.getName());
		System.out.println(st1.getMajor());
		System.out.println(st1.getAge());
		System.out.println(st1.getHight());
		//메소드
		st1.study();
		st1.introduce();
		st1.showHeight();
		//인스턴스 주소비교
		if(st1==st2) 
			System.out.println("같은인스턴스입니다");
		else 
			System.out.println("다른인스턴스입니다");
		//인스턴스 값비교
				if(st1.getHight()==st2.getHight()) 
					System.out.println("같은값입니다");
				else 
					System.out.println("다른값입니다");

	}

}
