package day19;

/*
  	파일에 
  		친구의 정보를 저장한다.
 		
 		정보 
 			이름	String
 			나일	int
 			신장	float
 			성별 	char
 			전화	String
 			메일 	String 
 			
 	이처럼 자바의 데이터 타입을 그대로 보내고 받을 수 있는 스트림은
 	DataInputStream / DateOutputStream 
 	이다. 
 	
 	주의 사항 ] 
 		입력순에 맞게 그대로 꺼내야하고 
 		읽을때도 DataOutputStream 으로만 꺼내야 한다.
 *
 */
import java.io.*;
import javax.swing.*;
public class Test08 {

	public Test08() {
		//필요한 스크림을 준비한다.
		//타겟 스트림 준비 
		//파일에 연결할 것이므로 
		FileOutputStream fout = null;
		//필터 스크림 준비  <== 자바의 데이터타입을 사용해야 한다.
		DataOutputStream dout = null;
		
		try {
			//스트림 초기화 
			fout = new FileOutputStream("src/day19/etc/DataStream_test.txt");
			dout = new DataOutputStream(fout);
			
			//저장할 데이터 준비 
			String name = "쵸파";
			int age = 29;
			float height = 90.0f;
			char gen = 'M';
			String tel = "010-1111-1111";
			String mail = "choppa@increpas.com";
			
			// DateInputStream / DataOutputStream 의 특징은 자바의 데이를 
			// 변환없이 사용할 수 있다.
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeFloat(height);
			dout.writeChar(gen);
			dout.writeUTF(tel);
			dout.writeUTF(mail);
			
//			dout.flush();
			
			JOptionPane.showMessageDialog(null, "*** 친구 등록 완료 ***");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}finally {
			
			try {
				dout.close();
				fout.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
	}
	
	public static void main(String[] args) {
		new Test08();
	}
}
