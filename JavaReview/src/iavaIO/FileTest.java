package iavaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileTest {

	public static void main(String[] args) {
		// 파일 목록
		fileList();
		// 파일 삭제
		fileDelete();
		//폴더 생성
		makeDir();
		//파일 복사
		filecopy();
	}
private static void filecopy() {
	String src = "d:/tmp/Desert.jpg";
	try {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(new File("d:/temp/img","p.jpg"));
		byte[] readBytes =new byte[100];
		int readByteNo = 0;//읽은 바이트 크기
		while((readByteNo = fis.read(readBytes)) !=-1) {
			fos.write(readBytes,0,readByteNo);
			
		}
			fos.flush();
			fos.close();
			fis.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
			
	
}
	
	private static void fileDelete() {
		File file = new File("d:/temp/Desert.jpg");
		file.delete();

	}

	private static void fileList() {
		File file = new File("d:/temp");
		if (file.isDirectory()) {
			File[] list = file.listFiles();
			for (int i = 0; i < list.length; i++) {
				System.out.printf("%s %d\n ", list[i].getName(), list[i].length());
			}
		}
	}

	private static void makeDir() {
		File file = new File("d:/temp/img/a/b");
		file.delete();
	}

}
