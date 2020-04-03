package day19;

import java.io.*;
public class Hw02 {

	public Hw02() {
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day19/etc/sample.increpas");
			
			
			byte[] b = new byte[1024];
			while(true) {
				int len = fin.read(b);
				String str = new String(b,0,len);
				
				System.out.println(str);
			}
			
		} catch (Exception e) {
//			e.printStackTrace();
			
		
		}finally {
			try {
				fin.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
	}

	public static void main(String[] args) {
		new Hw02();
	}

}
