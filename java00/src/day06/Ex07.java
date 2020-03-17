package day06;

import java.util.*;
/*
 문제 6]
	문자열을 입력받아 
	문자배열에 문자열을 이루는 문자를 순차적으로 저장하시요.
	
	참고]
		문자열의 특정위치의 문자를 추출해주는 함수
		문자열.charAt(위치값);
							
 */
public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[10];
		System.out.print("문자열 입력: " );
		String str = sc.nextLine();
		System.out.println();
		
		System.out.println("입력한 문자열 : " + str);
		System.out.print("뽑은 문자 : ");
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
			
			System.out.print( ch[i] + " | ");
		
		}
		
	}

}
