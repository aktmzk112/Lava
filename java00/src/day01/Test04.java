package day01;
/**
 * 
 *  클래스의 정보를 담는 주석. 이부분에 클래스이 설명을 작성한다.
 * @author		유태희
 * @since 	 	2020.03.09 (작성일)
 * @version 	v.1.0 	 해당 클래스의 버전을 지정하는 부분) 
 * @see					(참고해야할 클래스들을 나열하는 부분)
 * 
 * 
 * 			변경이력]
 * 				2020.03.09	- class 제작 - 담장자 : 유태희 
 * 			
 */

public class Test04 {

	public static void main(String[] args) {
		/*
		 	java 의 주석처리 
		 		1. // 단일주석
		 		
		 		2. /* */ // <== 여러행을 주석처리하는 방법 
		 		
		 
		/*
		 * 	증감연산자 
		 * 		++, --
		 * 		: 변수에 붙어지면 붙여진 변수이 값을 1또는 -1해준다
		 * 
		 * 
		 */
		int no1 = 10;
		int no2 = no1++ + ++no1;
//					10      12
		System.out.println(no2);
		
		/*
		 *  문자열을 결합해주는 연산자는 + 로 처리를 한다.
		 */
		
		int num1 =10;
		int num2 = ++num1 + num1++;
		//			11			11
		System.out.println(num2);
		

	}

}
