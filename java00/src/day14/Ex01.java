package day14;
/* 문제 2]
 	if - else if 구문을 사용하여 
 	
 	나이를 입력받아서 십대, 이십대,....
 	판별해주는 프로그램 작성 	
*/

/*
 * 추가학습 메인 기능을 함수로 제작하여 하시요
 */
import javax.swing.*;

public class Ex01 {

	public Ex01() {
		String age = JOptionPane.showInputDialog("나이를 입력하세요 : ");
		int age2 =0;
		String msg ="";
		
		try {
			age2 = Integer.parseInt(age);	
			if (age2 < 10) {
				System.out.println("10 대 미만 입니다");
			} else if (age2 >= 10 && age2 < 20) {
				System.out.println("10 대 입니다");
			} else if (age2 >= 20 && age2 < 30) {
				System.out.println("20 대 입니다");
			} else if (age2 >= 30 && age2 < 40) {
				System.out.println("30 대 입니다");
			} else if (age2 >= 40 && age2 < 50) {
				System.out.println("40 대 입니다");
			} else if (age2 >= 50 && age2 < 60) {
				System.out.println("50 대 입니다");
			} else {
				System.out.println("50대 이상입니다");
			}
		}catch (Exception e) {
			msg = "나이 형태가 아닙니다";
			System.out.println(msg);
		}
//		System.out.println(age2);
	}

	public static void main(String[] args) {

		new Ex01();
	}

}
