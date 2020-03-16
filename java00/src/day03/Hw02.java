package day03;

public class Hw02 {

	public Hw02() {
//	 	문제 2]
//	 	0~255 사이의 숫자를 만들고 
//	 	그 숫자를 코드값으로 하는 문자를 만들어서
//	 	해당문자가 영문자인지 아닌지 판별해서 출력하세요 
//	 	단, 삼항 연잔사를 처리해서 처리하세요 
		
	
		solv1();
	}
	
	// 숫자를 랜덤하게 만들어서 문자를 영문자인지 아닌지 판별하는 함수
	public void solv1() {
		//0~255 까지 랜덤한 숫자 생성
		int no = (int)(Math.random() * 256);
	
		//문자로 변경
		char ch = (char) no;
		
		//판별
		String str = (ch >= 'A' && ch <= 'Z') ? ("영문 대문자 "+ch+" 입니다."): (
					(ch >='a' && ch <= 'z' ) ? ("영문 소문자 "+ch+" 입니다") : ("발행한 문자 : [ "+ch+" ] 는 [ 영문자 아닌 문자 ] 입니다.")
				);
		//출력
		System.out.println(str);
	}

	public static void main(String[] args) {
		new Hw02();

	}

}
