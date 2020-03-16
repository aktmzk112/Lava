package day03;

public class Hw03 {
	/*
	 * 	 	문제 3]
		 		화씨(Fahrenheit) 온도 100도는 
		 		섭씨(Celcius)온도 몇도인지 알아보는 프로그램을 작정하세요
		 		
		 		공식 ] 
		 			섭씨온도 = 5/9 * (화씨온도 - 32)
	 */
	public Hw03() {


	}

	public static void main(String[] args) {
		new Hw03();
		
		//화씨온도 만들기
		double fr = 100;
		
		//섭씨온도 계산
		//참고] 정수와 정수의 연산 결과는 정수가 나온다.
		
		double ca = 5 /9.* (fr -32);

		//출력
		System.out.println("화씨온도 "+ fr + " 도는 섭씨온도 [ " + (int)(ca * 10 + 5) / 10f+ " ] 입니다.");
		
	}

}
