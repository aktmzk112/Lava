package day19;

/*
 	김소월의 진달래 꽃을 저장해보자 
 	
 */
import java.io.*;
import javax.swing.*;

public class Test09 {

	public Test09() {
		//스트림을 준비하고 
		PrintStream ps = null;
		try {
			//스트림 초기화 
			ps = new PrintStream("src/day19/etc/poem.txt");
			// 참고 ] 이스트림은 보조스트림 이다.하지만 직접 장치에 연결이 된다
			//			마치 기본 스트림 없이 작동하는것 처럼 보이지만
			//			내부적으로 타겟스트림(기본스트림)을 만들어서
			//			드 스트림에 연경해서 사용하는 보조 스트림이다.
			
			// 시를 써보자 
			ps.println("********* 진달래 꽃 *********");
			ps.println("					김	소	월");
			ps.println();
			ps.println("나보기가 역겨워 가실때에는");
			ps.println("말없이 고이 보내 드리오리다.");
			ps.println();
			ps.println("영변에 약산 진달래 꽃");
			ps.println("아름따다 가실길에 뿌리오리다");
			ps.println();
			ps.println("가시는 걸음걸음 놓인 그꽃을");
			ps.println("사뿐히 즈려밟고 가시옵소서");
			ps.println();
			ps.println("나보기가 역겨워 가실때에는");
			ps.println("죽어도 아니눈물 흘리오리다.");
			
			ps.flush();
			//내부적으로 Buffer의 기능을 가지고 있으므로 반드시 
			//내용이 끝나면 버퍼를 비워줘야 한다.
			
			JOptionPane.showMessageDialog(null, "저장완료");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				ps.close();
				// close() 함수는 내부적으로 flush() 기능을 포함 하고 있다
				// 따라서 close() 호출되면 자동적으로 flush()도 호출이 된다.
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
