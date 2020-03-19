package day08;

import java.util.Arrays;

public class EchaArray01 {

	public static void main(String[] args) {
		//2차 배열을 관리할변수를 선언
		
		int[][] num;
		
		//변수에 배열을 만들어서 기억 
		num = new int[3][0];
		
		num[0] = new int[3];
		num[1] = new int[5];
		num[2] = new int[7];
		
		//출력
		System.out.println(Arrays.deepToString(num));
	}

}
