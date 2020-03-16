package day03;
import java.util.*;

public class Hw06 {
/*
 * 문제 6]
	 		임이의 년드를 입력 받아서 
	 		해당년도가 윤년인지 평년이지 판별하여 출력 
	 		
	 		단, 삼항연자자는 사용
	 		
	 		윤년 
	 			4로 나눠 떨어지고 100나눠 떨어지지 않으며 400으로 나눠 떨어지는 해
 */
	public Hw06() {
		solv();
	}
	//윤년 판별하는 함수
	public void solv() {
	while(true){
		// 입력 받을 준비 
		Scanner sc =new Scanner(System.in);
		// 메세지 출력 
		System.out.print("년도를 입력 해라 !:");
		// 입력한 숫자 변수에 담고 
		int year = sc.nextInt();
		// 윤년인지 평년인지 판별 
		String result = (year % 4 !=0 ) ? ("평년") : (
					(year % 100 != 0) ? ("윤년") : (
						(year % 400 == 0) ? ("윤년") : ("평년")
							)
				);
		// 출력
		System.out.println(result);
	}
	}
	public static void main(String[] args) {
		new Hw06();

	}

}
