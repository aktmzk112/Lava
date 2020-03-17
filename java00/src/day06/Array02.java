package day06;

import java.util.Arrays;

/*
 	배열생성과 반복문
 		1~10 까지 수로된 배열을 만드시오
 */
public class Array02 {

	public static void main(String[] args) {
		// 10개의 숫자를 기억할 배열을 만들고 
		int[] arr = new int[10];
		
		// 반복해서 숫자 넣어주고
		int i = 0;
		while(i < 10) {
			// 배열에 데이터 입력하고
			arr[i] = i+1;
			
			//카운터 변수 증가시키고
			i++;
		}
		
		//배열의 데이터 간단하게 꺼내는 방법
		//반복문에서 향상된 for 사용
		for(int no : arr) {
			System.out.printf("%3d",no);
		}
		System.out.println();
		
		//배열의 내용만 살펴보자
		System.out.println("arr : " + Arrays.toString(arr));

	}

}
