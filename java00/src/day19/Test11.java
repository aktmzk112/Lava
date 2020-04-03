package day19;

/*
 *  Test10 에서 만든 문서 읽기
 */
import java.io.*;
import javax.swing.*;
public class Test11 {

	public Test11() {
		//스트림 준비
		FileReader fr = null;
		
		try {
			//스트림초기화
			fr = new FileReader("src/day19/etc/FileWriter_test.txt");
		/*
			//1 한글자 읽기 
			int ch = fr.read();
			JOptionPane.showMessageDialog(null, "읽은 데이터 : " + (char) ch);
			
		*/
			
			//2. 여러글자 읽기
			char[] buff = new char[1024];
			int len = fr.read(buff);
			String str = new String(buff , 0, len);
			JOptionPane.showMessageDialog(null, str);
		} catch (Exception e) {
		
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		

	
	}

	public static void main(String[] args) {
		new Test11();
	}

}
