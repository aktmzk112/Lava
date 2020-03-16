package day02;

public class Ex01_03 {

	public Ex01_03() {
// 		화씨(Fahrenheit) 온도 100도는 
// 		섭씨(Celcius)온도 몇도인지 알아보는 프로그램을 작정하세요
// 		
// 		공식 ] 
// 			섭씨온도 = 5/9 * (화씨온도 - 32)
	/*
	 *  데이터 연산 결과
	 *  
	 *  	정수 +,- , * , / , % 정수 = 정수
	 *      정수 +,- , * , / , % 문자 = 정수 
	 *      정수 +,- , * , / , % 실수 = 실수 
	 *      정수 - | * | / | % | 문자열 = 에러 
	 *      정수 + 문자열 				= 문자열 
	 *      실수 + 문자열 				= 문자열
	 *      문자 + 문자열 			 	= 문자열 
	 *      논리값 + 문자열				= 문자열
	 */
		float f = 100f;
		
		float c = 5f/9 *(f-32f);
		
		System.out.println(c + "도");
	}

	public static void main(String[] args) {
		new Ex01_03();

	}

}
