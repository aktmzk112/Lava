package day19;

/*
 	 예제 2] FileInputStream
 	 	day19.etc 패키지에 있는 sample.txt 파일 읽어보자 
 */
import java.io.*;
import java.util.Arrays;
public class Test02 {

	public Test02() {
		// 먼저 파일에 연결할 타켓스트림(기본스트림)을 준비 
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day19/etc/sample.txt");
			/*
			// 1. 한 글자만 읽어보자 
			int ch = fin.read();
			System.out.println("읽은 문자 : " + (char)ch);
			*/
			
			/*
			//2. 여러글자를 읽어 보자 
			//이 스크림은 바이트기반의 스트림이고 데이터 처리를 바이트로 처리한다.
			//따라서 한 문자는 바이트데이터 한개이고 여러문자는 바이트데이터 여러개가 될 것이다.
			//이것을 하나의 변수에 관리를 하려면 바이트 배열이 필요하다.
			byte[] buff = new byte[1024]; //1KByte
			
			int len = fin.read(buff);
			
			//문자열로 변경하자
			String str = new String(buff,0,len);
			
			//출력하자
			System.out.println("읽은 문자 : " + str);
			System.out.println("읽은 문자 수 : " + len);
			*/
			
			//3.문서 전체를 읽어보자
			// 이렇게 하면 1KBye만 읽을 것이고 파일에는 그 이상에 데이터가 있다.
			
			byte[] buff = new byte[1024];
			// 따라서 반복해서 꺼내는 방법으로 처리해보자 
			while(true) {
				//읽은 작업이 언제 끝날지 모르므로 계속해서 반복시킨다.
//				Arrays.fill(buff,(byte)0);
				int len = fin.read(buff);
				
				if(len == -1) {
					// 더이상 읽은 데이터가 없으면 반복을 중지한다.
					// 이때 read()는 읽은 데이터가 없으면 -1을 환환해준다
					break;
				}
				
				String str = new String(buff,0,len);
//				System.out.println("######읽은 문자열#####");
				System.out.print(str);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		new Test02();
	}

}
