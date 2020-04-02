package day18;

import java.io.*;
import java.util.*;
import javax.swing.*;
public class Test03 {

	public Test03() {
		Properties prop = new Properties();
		
		//데이터 채우고
		//Properties 는 Map의 일종이므로 데이터를 채울때도 Map처럼 채우면 된다
		prop.put("name", "김소영");
		prop.put("age","30");
		prop.put("tel", "010-8888-9999");
		prop.put("put","서울시 신림동");
		
		//파일로 데이터를 영구 보관하자
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("src/day18/Pengsoo.txt");
			// 파일에 위에서 작업한 내용을 기록한다
			prop.store(fout,"#### 절대로 영구보관 ####");
			JOptionPane.showMessageDialog(null, "영구보관 완료");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
//			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
