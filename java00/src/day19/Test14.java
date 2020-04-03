package day19;
/*
 *  Friend 에 데이터를 채워서 파일에 그대로 저장해 보자
 */
import java.io.*;
import javax.swing.*;
public class Test14 {

	public Test14() {
		//타겟 스트림 준비하고 
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		try {
			//스트림 만들거
			fout = new FileOutputStream("src/day19/etc/fr01.txt");
			oout = new ObjectOutputStream(fout);
			
			//Friend를 만들고 데이터를 채워준다.
			
			Friend f1 = new Friend("쵸파","010-1111-2222","choppa@increpas.com",25,90.0f,'M');
			
			//데이터를 넘기고 
			oout.writeObject(f1);
			
			JOptionPane.showMessageDialog(null, "저장완료");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				oout.close();
				fout.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
	}

	public static void main(String[] args) {
		new Test14();
	}

}
