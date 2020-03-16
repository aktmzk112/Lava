package day01;

public class Test02 {
	public static void main(String[] args) {
			/*
			 		  변수 만드는 형식
			 		  		
			 		  		1.
			 		  		[접근지정자] [속성] 데이터타입 변수이름; 변수언어
			 		  		변수이름 = 데이터; 데이터초기화
			 		  		
			 		  		2.
			 		  		[접근지정자] [속성] 데이터타입 변수이름 = 데이터; 변수선언과 초기화까지 한번에
			 				
			 		
			 */
		
		double no1 = 3.14;
		
		float no2 = (float) 3.14; 	//1. 강제 형변환 
		float no3 = 3.14f; 			//2. 리터럴 형변환
		
		double no4 = 123.456f; 		//3. double타입이 float타입보다 크므로 자동 형변환 된다.
		
		String str1 = "가나다";
		String str2= "가나다";
		String str3= new String("가나다");
		
		
		System.out.println(str1==str2);
		
		System.out.println(str1 == str3);
		
		System.out.println(str3.equals(str1));
		
		
		
	}
}
