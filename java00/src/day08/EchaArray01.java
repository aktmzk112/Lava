package day08;

import java.util.Arrays;

public class EchaArray01 {

	public static void main(String[] args) {
		//2�� �迭�� �����Һ����� ����
		
		int[][] num;
		
		//������ �迭�� ���� ��� 
		num = new int[3][0];
		
		num[0] = new int[3];
		num[1] = new int[5];
		num[2] = new int[7];
		
		//���
		System.out.println(Arrays.deepToString(num));
	}

}
