package day09;

public class Test03 {
/*
 * 1차원 배열에 
 * 'A' ~ 'E' 까지 초기화 해주는 함수를 제작하여 
 * 전역변수 ch에 초기화를 해주고 
 * 
 * 대문자를 입력하면 소문자로 반환해주는 함수를 만들어서 
 * ch의 문자를 소문자로 변경 하라 
 * 
 * 심화학습
 * 		문자 배열을 입력하면 
 * 		문자 배열을 'A' ~ 'E' 초기화 해주는 기능을 가진 함수를 작성 하고 실행서 출력
 * 
 * 		
 */
	char[] ch;
	char[] ch2;
	public Test03() {
		
		setCh();
		for(char c : ch) {
			System.out.printf("%2c | ",c);
		}
		System.out.println();
		//뱌열의 내용을 소문자로 변경
		for(int i=0; i<ch.length; i++) {
			char d = ch[i];
			char e = toSo(d);
			ch[i] = e;
		}
		
		//출력
		for(char c : ch) {
			System.out.printf("%2c | ",c);
		}
		System.out.println();

		
		setCh();
		for(char c : ch) {
			System.out.printf("%2c | ",c);
		}
	}

	//문자 배열 초기화 함수
	public void setCh() {
		ch = new char[5];
		for(int i=0; i<5; i++) {
			ch[i] = (char) ('A' + i);
		}
	}
	
	//대분자를 소문자로 반환 해주는 함수
	public char toSo(char d) {
		char result = (char) (d + ('a'-'A'));
		
		return result;
	}
	
	public static void main(String[] args) {
		new Test03();
		
	}

}
