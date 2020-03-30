package day15;

import java.io.*;
import java.util.*;
public class Test06 {

	public Test06() {
		File f = new File("D:\\java\\git\\Lava\\java00\\doc\\ScannerTest.txt");
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(f);
			String str = sc.nextLine();
			System.out.println("내 파일 내용 : " + str);
			
		}catch (Exception e) {
			e.printStackTrace();
		}	
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}
