package iavaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderTest {

	public static void main(String[] args) {
		// test파이 읽기
//		fileRead();
		// test파이 복사
		fileCopy();
	}

//	}
//	private static void fileRead() {
//		FileReader fr = new FileReader(new File("d:/temp" ,"hello.txt")) {
//			char[] readchar = new char[100];
//			int readNo = 0;
//			while((redNo = fr.read(readchar))!=-1) {
//				System.out.println(readchar);
//			}
//		}
//		

	private static void fileCopy() {
		FileReader fr;
		try {
			fr = new FileReader(new File("d:/temp", "hello.txt"));
			FileWriter fw = new FileWriter(new File("d:/temp", "hello.txt"));
			char[] readchar = new char[100];
			int copyNo = 0;
			while ((copyNo = fr.read(readchar)) != -1) {
				fw.write(readchar,0,copyNo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
