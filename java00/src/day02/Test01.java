package day02;


import java.io.ObjectInputStream.GetField;
import java.util.*;
public class Test01 {
/*
	자바 프로그램의 토큰 구분
		
		==> 컴퍼일러는 토큰 단위로 번역을 시도한다.
			따라서 개발자는 컴파일러가 번역을 하는 토큰을 구분해 주어야 한다.
			이때 사용하는 기호가 " ; " 기호를 사용해서 구분을 한다.
			
		우리가 습관적으로 int a = 20;
		한 이유는 토큰을 구분해주기 위한 기호이다.
		
		결론적으로 토큰이란 하나의 명령이 종료되었음을 알려주는 기호이다.
		
		만약 개발자가 토큰구분을 하지 않으면 오류가 날 수 있다.
		
		예]
			int a = 10
			int b = 20;
				==> 위의 두줄을 컴파일러는 하나의 명령으로 간주해서 처리할 것이고
					이런 명령의 형식은 자바에서는 존재하지 않으므로 에러가 발생하게 된다.
					
		예]
			int a = 10; int b = 20;
				==> 한줄로 입력했지만
					두개의 명령을 토큰으로 구분해줬기 때문에 각각을 인식해서 컴파일 할 수가 있다.
		
		참고]
			; 대신 } 기호가 그 역확을 대신 할 수 있다.
			
			예]
				if(조건식) {
				} // 이 부분에서 토큰이 발생하게 된다.
-----------------------------------------------------------------------
	키보드로 데이터를 입력받아서 사용하는 방법
		1. 클래스 구문 시작전에 
			import java.util.*;
			로 java.util 패키지의 모든 클래스를 사용할 준비를 해둔다.
			import java.util.Scanner;
			==> 이 방법은 java.util 패키지 내의 Scanner 클래스만 사용할 준비를 한것.
		
		2. 프로그램에 들어가서
			
			Scanner sc = new Scanner(System.in);
			
			이라는 명령을 이용해서 키보드를 통해서 입력 받을 도구를 준비한다.
			
		3. 키보드를 통해서 입력받을 필요가 생겼을 때
			
			변수 = sc.nextXXX();
			명령을 이용해서 데이터를 입력받으면 된다.
			
			이때 XXX는 입력받을 데이터의 종류에 따라 달라진다.
			
			문자열	- sc.nextLine();
			정수		- sc.nextInt();
			실수		- sc.nextFloat();
			
		참고]
			정수형태의 문자열을 정수로변환시키는 방법
			Integer.parseInt(숫자형문자열);
			
 */
	
	public static void main(String[] args) {
		// 숫자를 입력받아서 입력받은수에서 50 뺀 수를 출력하자.
		
		// 1. 입력받을 준비한다.
		Scanner sc = new Scanner(System.in);
		// 2. 메세지 출력한다.
		System.out.print("정수를 입력하세요 : ");
		// 3. 입력받은 데이터를 문자열변수에 담는다.
		String str = sc.nextLine();
		// 입력을 받은 후 필요없으면 닫아준다.
		// 4. 문자열 데이터를 정수로 변환한다.
		int num = Integer.parseInt(str);
		// 5. 변환된 정수를 계산한다.
		int result = num - 50;
		// 6. 계산 결과를 출력한다.
		System.out.println("입력한 수 " + num + " 에서 50을 빼면 " + result + " 입니다." );
	
		//*  2. 반지름이 7인 원의 넒이, 둘레 를 계산하여 출력 
		//*  	원의 둘래는 2*반지름*3.14
		//*  	넒이는 반지름 * 반지름 * 3.14
		//*  	단! 반지름 , 둘레 , 넒이는 변수를 만들어서 처리하세요 
		//*  	둘레는 float 타입의 변수로 처리
		
		
		
		System.out.println("반지름을 입력하세요 : ");
		int ban = sc.nextInt();
		
		float won = 2*ban*3.14f;
		double won2 = ban *= ban * 3.14;
		System.out.print("원의 둘레는 : "+won+" 입니다.");
		System.out.println("원의 넒이는 : "+won2+ " 입니다");
		
//		3. 2개의 숫자(정수)를 변수에 담고 두수를 가로 세로 사각형의 넒이랑 삼각형의 넒이를 구하세요
		
		System.out.print("정수 1번을 입력하세요 : ");
		int no = sc.nextInt();
		System.out.print("정수 2번을 입력하세요 : ");
		int no2 = sc.nextInt();
		
		int square = no * no2;
		int triangle = no * no2 / 2;
		
		
		System.out.println("사각형의 넒이는 : " +square + " 입니다");
		System.out.println("삼각형의 둘레는 : " + triangle + " 입니다.");
		
		
		Test01 ts1 = new Test01();
		System.out.print("금액 입력 :");
		int mon = sc.nextInt();
		sc.close();
		ts1.getmoney(mon);
	}


	public void getmoney(int mon) {
		
		int money = mon;
		
		int oman = 0;
		int man = 0;
		int ochun = 0;
		int chun = 0;
		int obaek = 0;
		int baek = 0;
		int osip = 0;
		int sip = 0;
		int il = 0;
		
		oman = money / 50000;
		money %= 50000;
		
		man = money / 10000;
		money %= 10000;
		
		ochun = money / 5000;
		money %= 5000;
		
		chun = money / 1000;
		money %= 1000;
		
		obaek = money / 500;
		money %= 500;
		
		baek = money / 100;
		money %= 100;
		
		osip = money / 50;
		money %= 50;
		
		sip = money / 10;
		money %= 10;
		
		il = money /1;
		money %= 1;
		
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
 */




}

	