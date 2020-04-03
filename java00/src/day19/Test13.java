package day19;
/*
 	day19/etc/pome.txt.
 	파일을 읽어보자
 	
 	FileInputStream 으로 읽고
 	BufferedReder를 연결
 	
 	이렇게 크기가 다른 스트림을 연결해주는 보조 스트림이
 	InputStreamReader / OutputStreamWriter
 	가 있다. 
 	
 */
import java.io.*;
import javax.swing.*;
public class Test13 {

	public Test13() {
		//타겟 스트림 준비
		FileInputStream fin = null;
		//보조 스트림 준비 -1		
		InputStreamReader ir =null;
		//보조 스트림 준비 -2		
		BufferedReader br = null;
		
		try {
			//스트림 만들고 
			fin = new FileInputStream("src/day19/etc/poem.txt");
			ir = new  InputStreamReader(fin);
			br = new BufferedReader(ir);
			
			StringBuffer buff = new StringBuffer();
			while(true) {
				String str = br.readLine();
				if (str == null) break;
				
				buff.append( str + "\n");
			}
			
			JOptionPane.showMessageDialog(null, buff.toString());
			
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				br.close();
				ir.close();
				fin.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

	public static void main(String[] args) {
		new Test13();
	}

}
