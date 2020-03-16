package day02;

import java.util.*;

public class Ex01_04 {

	public Ex01_04() {
//	 	문제 4]
//		 		소숫점이 있는 숫자를 입력한수 
//		 		소수점 이하 세째자리에서 반올림 결과 출력 
//		 		
//		 		원리]
//		 			+0.005 을 하면 세째자리 반올림 되고
//		 			여기에 x100 해주면 두째자리까지 정수부에 들어갈거고 
//		 			이것을 정수로 바꾸면 원숫자의 세째자리 이하는 버릴것이고 
//		 			다시 /100 으로 해주면 
//		 			다시 소수점 형태로 변환 될것이다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 소수 입력 : ");
		
		float num = sc.nextFloat();
		
		float num2 = num + 0.005f;
		System.out.println(num2);
		float num3 = num2 * 100;
		System.out.println(num3);
		int num4 = (int) num3;
		System.out.println(num4);
		float num5 = (float) num4 /100f;
		
		System.out.println(num5);
		
		
		
		
	}

	public static void main(String[] args) {
		new Ex01_04();

	}

}
