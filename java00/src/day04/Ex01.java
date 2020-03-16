package day04;

import java.util.*;
/*
 *  4자리 숫로된 년도를 입력 받아서 
 *  윤년인지 평년인지 판단해서 출력해서
 *  단!. switch ~ case 로 처리 
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		int code=0;
		
		//코드만들기( 4로 나눠떨어지는 수 -1 100으로 나눠 떨어지는수는 - 2 400으로
		//나눠떨어지면 -3
		
		if(year % 400 == 0) {
			code = 3;
		}else if(year % 100 == 0) {
			code = 2;
		}else if(year % 4 == 0) {
			code = 1;
		}
		
		System.out.println(code);
		
		switch (code) {
		case 1:
			System.out.println("윤년");
			break;
		case 2:
			System.out.println("평년");
			break;
		case 3:
			System.out.println("윤년");
			break;
		case 0:
			System.out.println("평년");
			break;
		}

	}

}
