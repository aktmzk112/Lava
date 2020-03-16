package test01;

import java.util.*;

public class Test02 {
//정수 3개 입력 >> 20 100 33 중간 값은 33

	public Test02() {
		Scanner sc = new Scanner(System.in);
		mid(sc);
	}
	
	public void mid(Scanner sc) {
		System.out.print("정수 1번 입력 : ");
		int top = sc.nextInt();
		System.out.print("정수 2번 입력 : ");
		int mid = sc.nextInt();
		System.out.print("정수 3번 입력 : ");
		int min = sc.nextInt();
	}
	

	public static void main(String[] args) {
		new Test02();
	}

}
