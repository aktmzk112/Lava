package day19;

/*
 *  fr01.txt 파일을 읽어보자
 *  이파일은 ObjectOutputStream 으로 저장한 파일이므로 
 *  반드시 저장할떄 사용한 클래스 읽는 쪽에서 패키지와 파일 이름 까지 똑같이 
 *  존재해야 하고
 *  반드시 ObjectInputStream 을 사용해서 읽어야 한다.
 * 
 */
import java.io.*;
import javax.swing.*;

public class Test14_01 {

	public Test14_01() {
		//타겟스트림 
		FileInputStream fin = null;
		//보조스트림
		ObjectInputStream oin = null;

		try {
			//스트림 생성
			fin = new FileInputStream("src/day19/etc/fr01.txt");
			oin = new ObjectInputStream(fin);
			
			//저장할 때 클래스로 저장을 했으니 읽을때도 클래스로 읽자 
			Friend fr = (Friend) oin.readObject();	
			JOptionPane.showMessageDialog(null, fr.getName() + "\n" + fr.getTel() + "\n" + fr.getMail() +
												"\n" + fr.getAge() + "\n"+fr.getHeight() + "\n"+ fr.getGen());
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			try {
				oin.close();
				fin.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test14_01();
	}

}
