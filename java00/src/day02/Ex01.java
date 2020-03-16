package day02;


import java.util.*;
public class Ex01 {
	/*
	 * 	문제 1]
	 	3자리로 구성된 숫자 하나를 입력을 받은 후 또는 렌덤하게 만든 후
	 	백자리 이하를 버린 숫자를 만들어서 출력
	 		예]
	 	 		4 --> 400
	 	 		
	 	문제 2]
	 	0~255 사이의 숫자를 만들고 
	 	그 숫자를 코드값으로 하는 문자를 만들어서
	 	해당문자가 영문자인지 아닌지 판별해서 출력하세요 
	 	단, 삼항 연잔사를 처리해서 처리하세요 
	 	
	 	문제 3]
	 		화씨(Fahrenheit) 온도 100도는 
	 		섭씨(Celcius)온도 몇도인지 알아보는 프로그램을 작정하세요
	 		
	 		공식 ] 
	 			섭씨온도 = 5/9 * (화씨온도 - 32)
	 	
	 	문제 4]
	 		소숫점이 있는 숫자를 입력한수 
	 		소수점 이하 세째자리에서 반올림 결과 출력 
	 		
	 		원리]
	 			+0.005 을 하면 세째자리 반올림 되고
	 			여기에 x100 해주면 두째자리까지 정수부에 들어갈거고 
	 			이것을 정수로 바꾸면 원숫자의 세째자리 이하는 버릴것이고 
	 			다시 /100 으로 해주면 
	 			다시 소수점 형태로 변환 될것이다.
	 	
	 	문제 5] 
	 		랜덤한 숫자를 10~99 까지 만들고 
	 		그 숫자가 가까운 10의 배수의 차를 출려하는 프로그램 작성
	 		
	 		예] 
	 			45 는 50 과의 차가 5가 난다.
	 			53 는 50 과의 차가 3이 난다.
	 		
	 		힌트]
	 			15 => 15/10 * 10 
	 			23 => 23/10 = 2 * 10 =20 ... 
	 			
	 			
	 	문제 6]
	 		임이의 년드를 입력 받아서 
	 		해당년도가 윤년인지 평년이지 판별하여 출력 
	 		
	 		단, 삼항연자자는 사용
	 		
	 		윤년 
	 			4로 나눠 떨어지고 100나눠 떨어지지 않으며 400으로 나눠 떨어지는 해
	 		
	 			
	 */
	
	//기본 생성자 함수
	public Ex01() {
//		mun1();
//		mun2();
//		mun3();
//		mun6();
//		mun5();
		mun4();
	}

	public void mun1() {
//		문제 1]
//			 	3자리로 구성된 숫자 하나를 입력을 받은 후 또는 렌덤하게 만든 후
//			 	백자리 이하를 버린 숫자를 만들어서 출력
//			 		예]
//			 	 		4 --> 400
		
		int num = (int)(Math.random() * (999-100 +1 ))+100;
		int num2 = num/100*100;
		System.out.println(num2);
	}
	public void mun2() {
//	 	0~255 사이의 숫자를 만들고 
//	 	그 숫자를 코드값으로 하는 문자를 만들어서
//	 	해당문자가 영문자인지 아닌지 판별해서 출력하세요 
//	 	단, 삼항 연잔사를 처리해서 처리하세요 

		
		for(int i=0; i<=20; i++) {
		int num = (int)(Math.random()*(255-0 +1)) + 0;
		
		char ch = (char)num;
		
		String str = (num >= 'A' && num<= 'Z')? ("영문 대문자 "+ch+" 입니다"):
			( 
					(num >= 'a' && num <= 'z')? ("영문 소문자 "+ch+" 입니다") :("영문자가 아닙니다")
					);
		System.out.println(str);
		}
		
	}
	
	public void mun3() {
// 		화씨(Fahrenheit) 온도 100도는 
// 		섭씨(Celcius)온도 몇도인지 알아보는 프로그램을 작정하세요
// 		
// 		공식 ] 
// 			섭씨온도 = 5/9 * (화씨온도 - 32)
		/*
			c = 5 / 9f * (F -32) //화씨 구하는 공식
			c * 9f / 5 = F - 32
			c * 9f / 5 + 32 = F //섭씨 구하는 공식 
		 */
		
		float fah = 100f;
		
		
		float c = 5 / 9f * (fah -32);
		System.out.println(c);
		
//		float f = c * 9f / 5 + 32;
//		System.out.println(f);
		
		
		System.out.println("섭씨 온도는 : "+ (int)c+"도 입니다");
		
		
		
	}
	
// 	문제 4]
//	 		소숫점이 있는 숫자를 입력한수 
//	 		소수점 이하 세째자리에서 반올림 결과 출력 
//	 		
//	 		원리]
//	 			+0.005 을 하면 세째자리 반올림 되고
//	 			여기에 x100 해주면 두째자리까지 정수부에 들어갈거고 
//	 			이것을 정수로 바꾸면 원숫자의 세째자리 이하는 버릴것이고 
//	 			다시 /100 으로 해주면 
//	 			다시 소수점 형태로 변환 될것이다.
//	 	
	
	public void mun4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("소수를 입력하세요 : ");
		double num = sc.nextDouble();
		
		
		double no = (num+0.005);
		System.out.println(no);
		double num2 = (num + 0.005) * 100 ;
		System.out.println(num2);
		int num3 = (int) num2;
		System.out.println(num3);
		double num4 = (double)num3 /100;
		
		System.out.println(num4);
		
		
		
	}
	
	public void mun5() {
//	 	문제 5] 
//		 		랜덤한 숫자를 10~99 까지 만들고 
//		 		그 숫자가 가까운 10의 배수의 차를 출려하는 프로그램 작성
//		 		
//		 		예] 
//		 			45 는 50 과의 차가 5가 난다.
//		 			53 는 50 과의 차가 3이 난다.
//		 		
//		 		힌트]
//		 			15 => 15/10 * 10 
//		 			23 => 23/10 = 2 * 10 =20 ... 
		int num1 = (int) (Math.random() * (99-10 + 1)) +10;

		int num2 = num1 /10*10;
		
		mun5Sub(num1, num2);
		
		
	
		
	}
	
	public void mun5Sub(int no1,int no2) {
			int num = no1 - no2;
			int num2 = no2 + 10;
			int num3 = num2 - no1;
			
			String str = (no1 % 10 < 5) ? (no1 +"는 " + no2 +"과의 차가 " + num + " 이난다") :
				(no1 +"는 " + num2 +"과의 차가 " + num3 + " 이난다");
			System.out.println(str);
	}
	
	public void mun6() {
		
//	 	문제 6]
//		 		임이의 년드를 입력 받아서 
//		 		해당년도가 윤년인지 평년이지 판별하여 출력 
//		 		
//		 		단, 삼항연자자는 사용
//		 		
//		 		윤년 
//		 			4로 나눠 떨어지고 100나눠 떨어지지 않으며 400으로 나눠 떨어지는 해
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		
		String str = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ?"해당 "+year+"년은 윤년 입니다.":"해당 "+year+"년은 평년입니다";
 
		System.out.println(str);
		
		
				
	}
	public static void main(String[] args) {
		new Ex01();

	}

}
