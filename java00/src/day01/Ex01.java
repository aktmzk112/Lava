package day01;
public class Ex01 {
/*
 * 	1. 5,10, 20 을 제외한 숫자 하나를 가정하고(양수, 음수 모두)
 * 		이것을 2진수로 바꿔보고 
 * 		실제 프로그램의 결과와 일치하는지 확인하세요
 * 
 * 		비트코드 확인 방법 Integer.toBinaryString(숫자)
 * 
 *  2. 반지름이 7인 원의 넒이, 둘레 를 계산하여 출력 
 *  	원의 둘래는 2*반지름*3.14
 *  	넒이는 반지름 * 반지름 * 3.14
 *  	단! 반지름 , 둘레 , 넒이는 변수를 만들어서 처리하세요 
 *  	둘레는 float 타입의 변수로 처리
 *  
 *  3. 2개의 숫자(정수)를 변수에 담고 두수를 가로 세로 사각형의 넒이를 구하세요 
 * 
 *  4. 3번문제의 두수를 밑변과 높이로 가지는 삼각형의 넒이를 구하세요 
 *  
 *  5. 54232원을 지불을해야한다.
 *  	우리나라의 화폐로 각단위가 필요한지 계산해서 출력하세요 
 *  	
 * 
 * 숙제] 
 * 	1년은 365.2426일이다.
 * 	이 날짜는 몇일 몇시간 몇분 몇초 인지 계산해서 출력하세요 
 *  
 */
	public static void main(String[] args) {
		
		          
		System.out.println("52 : 0011 0100 ");
		System.out.println("52 : " + Integer.toBinaryString(52));

		/*
		 * * 2. 반지름이 7인 원의 넒이, 둘레 를 계산하여 출력 원의 둘래는 2*반지름*3.14 넒이는 반지름 * 반지름 * 3.14 단!
		 * 반지름 , 둘레 , 넒이는 변수를 만들어서 처리하세요 둘레는 float 타입의 변수로 처리
		 */
		int ban = 7;
		
		float num1 = 2*ban*3.14f;
		double num2 = ban *= ban * 3.14;
		System.out.println("원의 둘레는 : " + num1 +"입니다.");
		System.out.println("원의 넒이는 : " + num2 +"입니다");
		
//		3. 2개의 숫자(정수)를 변수에 담고 두수를 가로 세로 사각형의 넒이를 구하세요 
		
		int no1 = 5;
		int no2 = 10;
		
		System.out.println("사각형의 넒이는 : " + no1*no2 + "입니다." );
//		4. 3번문제의 두수를 밑변과 높이로 가지는 삼각형의 넒이를 구하세요 
		
		System.out.println("삼각형 넒이는 : " + no1*no2/2 + "입니다.");
		
		/*
		 * 5. 54232원을 지불을해야한다. 우리나라의 화폐로 각단위가 필요한지 계산해서 출력하세요
		 */
		
		getmoeny();
		
//		 * 숙제] 
//				 1년은 365.2426일이다.
//				 이 날짜는 몇일 몇시간 몇분 몇초 인지 계산해서 출력하세요 
		
	}

	
	static void getmoeny() {
		int money = 54232;
		int oman = 0;
		int man = 0;
		int ochun = 0;
		int chun = 0;
		int obaek = 0;
		int baek = 0;
		int osip = 0;
		int sip = 0;
		int il = 0;
		
		int tmp = money;
		
		oman = tmp/50000;
		tmp %= 50000;
		
		man = tmp/10000;
		
		ochun = tmp/5000;
		
		chun = tmp/1000;
		tmp %= 1000;
		
		obaek = tmp/500;
		
		baek = tmp/100;
		tmp %= 100;
		
		osip = tmp/50;
		
		sip = tmp/10;
		tmp %= 10;
		
		il = tmp/1;
		
		
		System.out.println("필요한 5만원 권 : "+oman+"장");
		System.out.println("필요한 1만원 권 : "+man+"장");
		System.out.println("필요한 5천원 권 : "+ ochun+"장");
		System.out.println("필요한 천원 권 : " + chun+"장");
		System.out.println("필요한 오백원 : " + obaek +"개");
		System.out.println("필요한 백원 : "+baek+"개");
		System.out.println("필요한 오십원 : " + osip + "개");
		System.out.println("필요한 십원 : " + sip + "개");
		System.out.println("필요한 일원 : "+ il + "개");

	}
}
