package day08;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		//배열을 만든다.
		int[][] num = new int[3][5];
		
		//1차배열을 초기화
		//먼저 2차 배열에 들어있는 배열을 먼저 순차적으로 꺼낸다
		for(int i=0; i<num.length; i++) {
			//2차 배열의 각 방에 들어있는 배열을 꺼낸다.
			for(int j=0; j<num[i].length; j++) {
				//1차 배열의 각 방의 데이터를 초기화한다,
				num[i][j] = i+1;
			}
		}
		System.out.println(Arrays.deepToString(num));
	}

}
