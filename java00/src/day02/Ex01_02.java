package day02;

public class Ex01_02 {

	public Ex01_02() {
//	 	문제 2]
//	 	0~255 사이의 숫자를 만들고 
//	 	그 숫자를 코드값으로 하는 문자를 만들어서
//	 	해당문자가 영문자인지 아닌지 판별해서 출력하세요 
//	 	단, 삼항 연잔사를 처리해서 처리하세요 
	 	
		
		for(int i=0; i<=20; i++) {
		int num = (int)(Math.random() *(255-0+1))+0;
		char ch = (char) num;
		
		String str = (num >= 'A' && num <= 'Z') ? ("대문자입니다" + ch) :(
					(num >='a' && num <= 'z') ? ("소문자입니다" + ch) : ("영문 아니야!")
				) ;
		
		System.out.println(str);
		}
		
	}

	public static void main(String[] args) {
		new Ex01_02();

	}

}
