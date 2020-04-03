package day19;

/*
 	문자 단위로 파일에 데이터를 저장하는 프로그램을 작성해보자.
 	 
 */
import java.io.*;
import javax.swing.*;
public class Test10 {

	public Test10() {
		//기본 스트림 준비
		FileWriter fw = null;
		
		try {
			//스트림 초기화 
			fw = new FileWriter("src/day19/etc/FileWriter_test.txt");
			
			/*
			//1. 한글자만(2byte) 저장
			char ch = '한';
			fw.write(ch);
			*/
			
			/*
			//2 여러글자 저장
			String str = "저는 항상 잘 됩니다.";
			char[] ch = str.toCharArray();
			fw.write(ch);
			*/
			
			//3. 문자열을 전송해보자
			String str = "DOGBOT은 머리가 없는 대신 스크린을 탑재했다. 이 화면엔 빨간색 물음표나 느낌표가 뜨는데 로봇의 기분을 알려주는 것이다."
					+ " 관찰 시에는 흰색 사각형이 화면에 뜨며, 집중 중일 땐 빨간색이다.";
			fw.write(str);
			/*
			 	 char단위 스트림은 텍스트 데이터만 처리하도록 되어있기 때문에 
			 	 기본 함수의 + 문자 처리 기능이 추가되었다.
			 	 
			 */
			JOptionPane.showMessageDialog(null, "저장 완료!");
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
	}

	public static void main(String[] args) {
		new Test10();
	}

}
