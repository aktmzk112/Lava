package day02;

public class Test04 {
	/*
	 	************
	  	생서자(Constructor)
	  	: 클래스가 객체가 될 때 클래스의 맴버가 가져야될 기본값이 있을것이다
	  	  이때 그 맴버들의 기본값은 셋팅 해주는 역할을 하는것이 생성자 함수....
	  	  
	  	  형식]
	  	  	public 클래스이름(){
	  	  		내용...
	  	  	}
	  	  
	  	  ***
	  	  생성자 함수는 반환값이 없다.
	  	  
	  	  ***
	  	  생성자 함수를 하나도 정의 하지 않으면 
	  	  자바 가상머신이 자동으로 기본 생성자 함수를 만들어서 호출해준다.
	  	  
	  	  만일 생성자 함수를 하나라도 만들면 
	  	  자바 가상머신이 기본 생성자 함수를 만들지 않는다.
	  	  
	  	  따라서
	  	  생성자 함수를 정의를 할거면
	  	  기본 생성자 함수를 내용이 없더라도 정의 를 해두는것이 좋다.
	  	  
	 */
	
	/*
	 	비교 연산자
	 		: 변수나 상수의 크기를 비교해서 논리값을 얻는 연산자.
	 	
	 	참고]
	 		수학에서 비교연자를 사용하듯이
	 		한번에 두개를비교할 수는 없다

	 	예]
	 		int no = 10;
	 		
	 		1 <= no <= 20; ==> error
	 		
	 		==> (1 <= no) & (no <= 20); ==> 정상
	 	
	 	논리 연산자 
	 		논리값을 가지고 연산해서 노리값을 얻어내는 연산자
	 		
	 		종류]
	 			& : 두조건이 모두 참일경우에 
	 			| : 두조건중 하나가 참이면 참
	 			! : 부정 연산자
	 			
	 			(절삭 연산자)
	 			&& : 두조건이 모두 참일경우 참.
	 			|| : 두조건중 하나가 참이면 참.
	 			
	 	
	 */
	public Test04() {
		test1();
		test2();
	}
	
	public static void main(String[] args) {
		new Test04();
		
	}

	public void test1() {
		char ch1 = 'A';
		char ch2 = 97+1;
		System.out.println("97 : "+ch2);
		int no1 = ch1;
		
		ch2 = (char)(no1 + 3); // no1이 int 타입이므로 강제형변환이 필여하다
		
		
		boolean bool1 = false;
		boolean bool2 = true;
		
		System.out.println(ch2);
		
	}
	
	public void test2() {
		boolean bool1 = false;
		boolean bool2 = true;
		
		System.out.println("1." + (bool1 & bool2));
		System.out.println("2. "+(bool1 | bool2));
		System.out.println("3. "+ !(bool1 & bool2));
		
		
		int no1 = 10;
		int no2 = 11;
		
		System.out.println("4. "+ ((no1 > no2) && (++no1 == no2)));
		System.out.println("4-1."+ no1);
		
		System.out.println("5. "+ ((no1 < no2) || (++no1 == no2)));
		System.out.println("5-1."+ no1);
		
		
		// 비트연산자
		System.out.println("6. "+(35 & 24));
		
	}
	
}
