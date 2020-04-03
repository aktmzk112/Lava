package day19;

import java.io.*;
import javax.swing.*;
/*
 *  DataOutputStream 으로 저장한 친구의 정보를 읽어오자
 */
public class Test08_01 {

	public Test08_01() {
		//타겟 스트림 준비
		FileInputStream fin = null;
		//보조 스트림 준비
		DataInputStream din = null;
		
		try {
			//스트림 초기화 하고 
			fin = new FileInputStream("src/day19/etc/DataStream_test.txt");
			din = new DataInputStream(fin);
			
			//주의 할점은 파일을 저장할때 이름 , 나이 , 신장,성별,전화번호, 이메일
			//의 순서로 저장을 해놓았기 때문에 가져올 때도 반드시 위 순서대로 가져와야 한다. 
			String name = din.readUTF();
			int age = din.readInt();
			float ki = din.readFloat();
			char gen = din.readChar();
			String tel = din.readUTF();
			String mail = din.readUTF();
			
			//출력하고 
			String msg = "이름 : " + name + "\n나이 : " + age + "\n신장 : " + ki + "\n성별 : " + gen + "\n전화번호 : " + tel + "\n메일 : " + mail;
			
			JOptionPane.showMessageDialog(null, msg);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		
		}finally {
			try {
				din.close();
				fin.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
	}

	public static void main(String[] args) {
		new Test08_01();
		
	}

}
