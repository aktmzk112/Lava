package day06;

import java.util.Arrays;

/*
 * ���� 1]
	'A'~'J' ���� ���ڸ� ���������� ���� 
	�迭�� �ְ� �� ���ڸ� �ϳ� �� ������ ��� �ҹ��ڷ� �����ϰ� ����ϼ��� 			
	
	�迭�� ��� ������ ���ڿ��� Ȯ���ؼ� ����ϼ���
 */
public class Ex01 {

	public static void main(String[] args) {
		char[] ch = new char[10];
		char[] ch1 = new char[10];
		char al = 'A';
		
		for(int i = 0; i<10; i++) {
			ch[i] = al++;
			ch1[i] = (char) (ch[i]+32);
			System.out.print((char) (ch[i]+32));
		}
		
		System.out.println();
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(ch1));
	}

}
