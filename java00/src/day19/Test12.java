package day19;
/*
 	Test11.java 파일을 읽어보자 
 */
import java.io.*;
import javax.swing.*;

public class Test12 {

	public Test12() {
		//기본 타겟 스트림 준비
		FileReader fr = null;
		//필터 스트림 준비 
		BufferedReader br = null;
		
		try {
			
			//스트림 초기화 
			fr = new FileReader("src/day19/Test11.java");
			br = new BufferedReader(fr);
			//몇번을 읽어야 할지 모르므로 반복하자 
			String msg = "";
			while(true) {
				String str = br.readLine();
				
				if(str == null) break;
				
				msg+=str+ "\n";
			}
			
			//내용 출력
			JOptionPane.showMessageDialog(null, msg);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

	public static void main(String[] args) {
		new Test12();
	}

}
