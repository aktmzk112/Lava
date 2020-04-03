package day19;

/*
 	예제 4]
 		파일을 복사해보자
 */
import java.io.*;
import java.util.Arrays;

import javax.swing.*;
public class Test04 {
	public Test04() {
		//할일
		// 파일 복사는 파일의 내용을 읽은 후 
		// 읽은 내용을 다른 파일에 내보내는 작업이다.
		// 따라서 기존 파일을 읽을 타겟스트림을 준비하고 
		// 읽은 후 읽은 내용은 문자열로 저장해 두고 byte[] 을 복사될 파일에 쓰면 될 것이다 
		//저장할 타겟스트림에 쓰면 된다.
		
		//기본 스트림 두개 준비
		FileInputStream fin = null; //원본
		FileOutputStream fout = null; //복사본
		
		
		try {
			//기본스크림 두개를 연다
			fin = new FileInputStream("src/day19/Test04.java");
			fout = new FileOutputStream("src/day19/Test04_01.java");
			//한 곳에서 읽어서 그대로 다른 곳에 쓰면 된다.
			//몇번 읽어야 할지 모르므로 
			
			String str = "";
			byte[] buff = new byte[1024];
			while(true) {
				Arrays.fill(buff, (byte)0);
				int len = fin.read(buff);
				if(len == -1) break;
				str += new String(buff,0,len);
			}
			
			//문자열을 파일에 기록한다
			// 문자열을 byte[]로 만들어주고
			byte[] bstr = str.getBytes();
			fout.write(bstr);
			
			JOptionPane.showMessageDialog(null, "복사완료");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			
			try {
				fin.close();
				fout.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
	}

	public static void main(String[] args) {
		new Test04();
	}

}
