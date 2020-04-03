package day19;

/*
 	내용을 파일에 저장하는 프로그램을 작성 하세요.
 	
 	단 , 보조 스트림 Buffered 스트림을 사용하세요
 	 
 */
import java.io.*;
import javax.swing.*;
public class Test07 {

	public Test07() {
		//1. 내보내는 스트림 준비
		FileOutputStream fout = null;
		//2. 필요에 따라서 보조스트림 연결 할 수 있다.
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("src/day19/etc/buff_test.txt");
			bout = new BufferedOutputStream(fout);
			
			//저장할 데이터 준비
			String str = JOptionPane.showInputDialog("문자를 입력하세요");
			byte[] buff = str.getBytes();
			
			
			//이제 버퍼에 쓰면 파일까지 데이터가 넘어갈 것이다
			bout.write(buff);
			//아직 버퍼가 채워지지 않았으므로 
			//버퍼의 내용이 FileOutputStream 으로 전달 되지 않았다.
			//따라서 아직 저장이 안됬다
			
			//일런경우 필요한 기능이 
			//퍼버의 내용을 강제로 모두 꺼내주는 기능 인데 
			bout.flush();
			// 따라서 버퍼드 스크림을 사용할 경우에는 습관적으로 flush()함수를 실행 해야 한다.
			
			JOptionPane.showMessageDialog(null, "***저장 완료***");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				bout.close();
				fout.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	
	}

	public static void main(String[] args) {
		new Test07();
	}

}
