package iavaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExample {

	public static void main(String[] args) {
		//1바이트일때
//		readByte();
		readChar();
		System.out.println((char)0Xac99);
	}
	
//	public static void readByte() {
//		int ch;
//		try {
//			ch = System.in.read();
//			System.out.println(ch +" : " + (char)ch);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
	public static void readChar() {
		int ch;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			ch =isr.read();
			System.out.println(Integer.toHexString(ch) +" : " + (char)ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void readStr() {
		String str;
		try {
//			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
			str = br.readLine();
			System.out.println("입력값 : " + str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
