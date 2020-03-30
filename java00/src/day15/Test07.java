package day15;

import java.io.*;
import java.util.*;

public class Test07 {

	public Test07() {

		File f = new File("D:\\java\\git\\Lava\\java00\\doc\\day15_src.txt");
		Scanner sc = null;
		String str = ""; 
		try {
			sc = new Scanner(f);
			str = sc.nextLine();

		} catch (Exception e) {
			e.printStackTrace();

		}
		StringTokenizer token = new StringTokenizer(str);

		int count = token.countTokens(); // 자른 문자열의 갯수를 반환해주는 함수

		System.out.println("자른 갯수 : " + count);

		// 꺼내보자

		/*
		 * for (int i = 0; i < count; i++) { String tmp = token.nextToken();
		 * 
		 * System.out.println("분리된 문자열 : " + tmp); }
		 */

		// 다시 꺼내기
		/*
		 * System.out.println(); for (int i = 0; i < count; i++) { String tmp =
		 * token.nextToken();
		 * 
		 * System.out.println("다시꺼낸 문자열 : " + tmp); } }
		 */

		// 실제 StringTokenizer를 사용하는 법

		while (token.hasMoreTokens()) {
			String tmp = token.nextToken();
			System.out.println("분리된 문자열 : " + tmp);
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
