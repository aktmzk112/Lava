package day19;

/*
 	예제 1]
 		키보드를 이용해서 문자를 입력 받아보자 
 */
import java.io.*;
import java.util.*;
public class Test01 {
/*
 	 참고] 
 	 	키보드 역시 외부 장치이다. 
 	 	자주쓰이는 외부 장치이기 떄문에 이미 
 	 	스크림으로 준비한 변수가 존재 한다.
 	 	
 	 		준비된 변수 : System.in
 	 		
 */
	public Test01() {
		System.out.print("한 글자를 입력해 주세요! : ");
		//	변수 생성
		int ch = 0;
		
		try {
			//1.
			
//			ch=System.in.read();
//			System.out.println("입력한 문자 : " + (char) ch);
			
			//2 ***
			
			/*
			byte[] buff = new byte[256];
			//	256의 숫자에 따라서 한번에 읽은 데이터의 양이 정해진다.
			int len = System.in.read(buff); //System.in.read(buff) 의 반환값은 읽은 문자의 수를 int로 반환 한다
			//읽을 결과를 문자열로 출력하자
			String str = new String(buff,0,len);
			System.out.println("읽은 문자 : " + str);
			*/
			
			//3 주로 네트워크 처리를 할때 많이 사용하는 방법 
			byte[] buff = new byte[256];
			Arrays.fill(buff,(byte) 'A');
			
			int len = System.in.read(buff,10,10);
			//준비된 배열의 buff의 11번 방부터 읽을 내용을 기억하세요...
			//최대 100까지만 읽으세요...(==> 100글자만 입력받을 수 있다.)
			String str = new String(buff,0,len+10);
			// \n을 지워보자 
			str = str.replaceAll("\r\n", "");
			System.out.println("입력한 문자열 : " + str);
			
				
//			Arrays.fill(buff, (byte) 'A');
//			
//			System.out.println(Arrays.toString(buff));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}	
