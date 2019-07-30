package com.yedam.bjy;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("야구게임을 시작합니다");
		int[] setAry = new int[3]; // 사용자입력
		int[] getAry = new int[3];// 난수
		int i=0;
		int j=0;
		int str =0;
		int ba=0;
		int input = 0;
		
		
		
		for ( i = 0; i < getAry.length; i++) {
			input = (int) (Math.random() * 9) + 1; //난수를 input에 대입
			int a=0; 
			for (; a < 3; a++)
				if (getAry[a] == input) { //input에 대입한 값을  getAry와 비교
					break;
				} // if
				else if(i!=a)
					continue;
			getAry[i++] = input;		
		} // for//중복페크
		
		for ( i = 0; i < 3; i++)
			getAry[i] = (int) (Math.random() * 9) + 1;
		for ( i = 0; i < 3; i++) {
			System.out.print(getAry[i]);
		}System.out.println();//난수 출력
		

		for ( j = 0; j < setAry.length; j++) {
			System.out.println("숫자를 입력하세요"); // 사용자 입력값받기
			setAry[j] = sc.nextInt();
		}
		for ( i = 0; i < getAry.length; i++) {
			for ( j = 0; j < setAry.length; j++) {
			if (getAry[i] == setAry[j]) {
				str+=str;
				System.out.println("Strike");
		}
		}
		}

	}

}
