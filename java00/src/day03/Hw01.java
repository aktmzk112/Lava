package day03;

import java.util.*;
public class Hw01 {
	 /*조건명령 : 조건을 주고 조건이 맞는 경우와 맞지 않는 경우를 구분해서 처리해주는 명령문
	  * 	1.if
	  * 		==> 조건을 제시하고 그 조건에 맞는 경우에만 처리하는 조건문
	  * 
	  * 		형식]
	  * 			if(조건식){
	  * 				실행문...	
	  * 			}
	  * 		==> 조건식이 참일 경우에만 실행문을 실행하고 거짓일경우 조건문을 실행하지 않는다.
	  *  
	  * 	2.if ~ else
	  * 		==> 조건을 제시하고 조건에 맞는경우와 그렇지 않은경우를 처리하는 조건문
	  * 
	  * 		형식]
	  * 			if(조건식){
	  * 				실행문 1
	  * 			}else {
	  * 				실행문 2
	  * 			};
	  * 		==> 조건식이 참이면 실행문 1을 실행하고 거짓인 경우 실행문 2를 실행 한다.
	  * 	
	  * 	3.if ~ else if ~else
	  * 		==> 조건을 2개이상을 제시 하고 각 조건의 맞는 경우를 처리하는 조건문.
	  * 
	  * 		형식]
	  * 			if(조건식1){
	  * 				실행문1
	  * 			}
	  * 			else if(조건식2){
	  * 				실행문2
	  * 			}
	  * 			else if(조건식3){
	  * 				실행문3
	  * 			}
	  * 			...
	  * 			else{
	  * 				실행문4
	  * 			};
	  * 	
	  *			==> 조건1이 참이면 실행문1을 실행 
	  *				조건2가 참이면 실행문2을 실행
	  *				조건이 모두 거짓이면 실행문 4 실행
	  *				조건식을 여러게를 제시해서 그 조건문에 맞는 실행문을 실행하는 조건문
	  *
	  * 	4. switch ~ case 
	  * 		==> 조건을 처리하는데 데이터를 여러개를 제시하고 그 데이터에 맞는 경우 처리해주는 방법
	  * 
	  * 		형식]
	  * 			seitch(변수){
	  * 				case 데이터1: 
	  * 					실행문1;
	  * 					break;
	  * 				case 데이터1: 
	  * 					실행문1;
	  * 					break;
	  * 				case 데이터1: 
	  * 					실행문1;
	  * 					break;
	  * 				...
	  * 				default:
	  * 					실행문n;
	  * 
	  * 			}
	  * 		==> 변수의 값이 일치 하는 case문의 실행문을 실행시킨다.
	  * */
	
	/*
	 * 문제 1] 3자리로 구성된 숫자 하나를 입력을 받은 후 또는 렌덤하게 만든 후 백자리 이하를 버린 숫자를 만들어서 출력 
	 * 예] 4 -->400
	 */
	public Hw01() {
		//입력받을 준비 
		Scanner sc = new Scanner(System.in);
		//메세지 출력
		System.out.print("### 입력받아 처리할 경우 1, 랜덤하게 처리할경우 2 를 입력하세요! :  ");
		
		int num = sc.nextInt();
		

		if(num ==1) {
				iFloor(sc);
		}
		else if(num == 2) {
				rFloor();
		}
		else System.out.println("반장님에게 가시요!");
	}
	// 입력 받아서 처리하는 방법
	public void iFloor(Scanner sc) {
			// 메세지 출력
			System.out.print("세자리 정수를 입력하세요! : ");
			// 숫자 꺼내서 변수에 기억
			int no = sc.nextInt();
			System.out.print("입력한수: "+no);
			// 십의 자리 이하는 버리고 
			// 123 ==> 100 <--(123 -23)
			//			   <-- 123/ 100 *100
			int no2 = no;
			//첫번째 방법
			no = no / 100*100;
			System.out.println(", 변경된 수 : "+no);			
			//두번재 방법
			no2 = no2 - (no2%100);
			System.out.println("변경된 수 two : "+no2);
	}
	
	// 랜덤하게 처리하는 방ㅂ법
	
	public void rFloor() {
		//랜덤하게 숫자 만들고
		int no = (int) (Math.random() * (999-100 +1))+100;
		System.out.print("랜덤한 수: "+no);
		//십의 자리에서 반올림
		int no2 = no;
		//첫번째 방법
		no = no / 100*100;
		System.out.println(", 변경된 수 : "+no);			
		//두번재 방법
		no2 = no2 - (no2%100);
		System.out.println("변경된 수 : "+no2);
		
	}
	public static void main(String[] args) {
		new Hw01();
	}

}
