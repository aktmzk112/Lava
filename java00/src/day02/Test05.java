package day02;

/**
 *  이클래스는 삼항 조건연산자 연습용 클래스
 * @author 유태희
 * @since 2020.03.10
 * @version v.1.0
 * @see 
 *			변경이력
 *					2020.03.10 - 클래스제작 - 담당자 : 유태희
 *
 */
public class Test05 {
/*
 	랜덤한 수 발생 시키는 방법
 		Math 클래스 random() 함수는 0보다  크거나 같고 1보다 작은 실수를 반환해주는 함수
 		
 		이때 범위의 해당하는 랜덤한 수(정수)를 발생시키는 방법
 		
 		(int) (Math.random() * (최대값-최소값 +1))+(최소값); 
 		
 */
	
	public Test05() {
		test1();
			
	}
	
	public void test1(){
		//1~10 까지 랜덤한 숫자를 발생하여 그숫자가 짝수인지 홀수인지 판별
		// 짝수인 경우 어떤수를 2로 나눠서 나머지가 0인수
		
		//1. 랜덤한 숫자(정수) 생성
		int num = (int)(Math.random()*(10-1+1)) + 1;
		
		//2. 삼항연사자로 조건을 정의 
		//2-1 참일때 반한값을 정의
		//2-2. 거짓일때 반환값 정의
		String msg = (num % 2==0)?
				("[ "+ num +" ] 은 짝수입니다"):
				 ("[ "+ num +" ] 은 홀수 입니다");
		
				
		//출력한다. 
		System.out.println(msg);
		
		
	}
	
	public static void main(String[] args) {
		new Test05();	

	}

}
