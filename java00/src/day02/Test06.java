package day02;

import java.util.*;

public class Test06 {
/*
  랜덤하게 정수 11~33 두수를 발생시키고
  숫자를 입력받아서 
  입력받는 숫자가 1이면 삼각형의 넓이를
  					2이면 사각형의 넒이를 구해주는 프로그램 작성
 */	
	
	public Test06() { //생성자 함수
		//입력받을 준비
		Scanner sc = new Scanner(System.in);
		//메시지 출력
		System.out.print("삼각형의 넒이는 1, 사각형 넒이는 2를 입력하세요 : ");
		int code = sc.nextInt();
		
		// 랜덤하게 두수를 발생해서 변수에 담는다 
		
		int no1 = (int)(Math.random()*(33-11+1))+11;
		int no2 = (int)(Math.random()*(33-11+1))+11;
		
		System.out.println("no1 : " + no1);
		System.out.println("no2 : " + no2);
		// 코드값이 1이면 삼각형 구해서 출력하고 2면 사각형 넒이를 출력
		/*
		  	사각형과 삼각형의 넓이의 ㅌㅏ입이 다르기 때문에 한가지 타입으로 통일 시켜야 한다.
		  	여기서는 함수 실행의 결과를 출력할 용도로만 사용할것이기 떄문에 
		  	문자열로 통일 해서 사용 
		 */
		
		//함상연산(방법1)
//		String result = (code == 1) ? ("삼각형의 넓이는 : "+ samgak(no1,no2)+" 입니다") : 
//							(
//								code == 2 ? ("사각형의 넓이는 : "+sagak(no1,no2)+" 입니다"): ("반장님에게 가세요")
//									);
		
		//방법2]
//		double semo = samgak(no1,no2);
//		int	nemo = sagak(no1,no2);
//		
//		String result = (code == 1)? ("삼각형의 넓이는 "+ semo + " 입니다") : (
//					(code ==2) ? ("사각형의 넓이는 "+ nemo +" 입니다"): ("반장에게 가랏")
//				);
		
		//방법 3]
		if (code == 1) {
			System.out.println("삼각형의 넓이는 "+ samgak(no1,no2) + "입니다.");
			
		}else if(code ==2) {
			System.out.println("사각형의 넓이는 "+ sagak(no1,no2)+"입니다");
		}else {
			System.out.println("반장님에게 가시요!!!!");
			
		}
		
		//출력
		
//		System.out.println(result);
									
	}
	
	//삼각형 넒이 구해주는 함수
	public double samgak(int no1, int no2) {
		// 면적을 구해서 변수에 담고
		double area = no1 * no2 / (double)2;
		// 면적을 반환
		return area;
	}
	//사각형 넒이 구해주는 함수
	
	public int sagak(int no1 , int no2) {
		// 면적을 구해서 변수에 담고
		int area = no1 * no2;
		// 면적을 반환
		return area;
	}
	public static void main(String[] args) {
		new Test06();
	}

}
