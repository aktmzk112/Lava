package day06;

import java.util.Arrays;

/*
 * 문제 1]
	'A'~'J' 까지 문자를 순차적으로 만들어서 
	배열에 넣고 각 문자를 하나 씩 꺼내서 출력 소문자로 변경하고 출력하세요 			
	
	배열에 담긴 내용을 문자열로 확인해소 출력하세요
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
