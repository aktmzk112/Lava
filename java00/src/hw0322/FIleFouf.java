package hw0322;

import java.io.*;
import java.util.*;
public class FIleFouf {

	public FIleFouf() {
		
		File fa = new File("doc");
		FileInputStream fin = null;
		FileOutputStream fout = null;
		String[] list = fa.list();
		
		
		for(int i=0; i<list.length; i++) {
			String flist = "doc/"+list[i];
			String folist = "test_doc/"+list[i];
			try {
				fin = new FileInputStream(flist);
				fout = new FileOutputStream(folist);
				
				byte[] b = new byte[1024];
				
				String str = "";
				while(true) {
					int len = fin.read(b);
					
					if(len == -1) break;
					
					str += new String(b , 0 ,len);
					
				}
				byte[] b1 = str.getBytes();
				fout.write(b1);
				
				 
			} catch (Exception e) {

				e.toString();
			}finally {
				try {
					fin.close();
					fout.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
//			System.out.println(flist);
			
		}
	
		System.out.println("정상 복사 완료");
	}

	public static void main(String[] args) {
		new FIleFouf();
	}

}
