package test01;

import java.util.*;

public class Test02 {
//���� 3�� �Է� >> 20 100 33 �߰� ���� 33

	public Test02() {
		Scanner sc = new Scanner(System.in);
		mid(sc);
	}
	
	public void mid(Scanner sc) {
		System.out.print("���� 1�� �Է� : ");
		int top = sc.nextInt();
		System.out.print("���� 2�� �Է� : ");
		int mid = sc.nextInt();
		System.out.print("���� 3�� �Է� : ");
		int min = sc.nextInt();
	}
	

	public static void main(String[] args) {
		new Test02();
	}

}
