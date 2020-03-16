package day04;

/*
 	while 명령
 		
 		for명령문 처럼 반복 실행할수 있는 명령문
 		for 명령문과의 차이점은 반복을 할 횟수를 지정하는 카운터 변수가 
 		그리고 증감식도 없다
 		명령내부에 없는것이 차이점....
 		
 		형식]
 			
 			(1)
 			while(조건식 - (2)){
 				- (3)
 			
 			}
 				- (4)
 				
 		순서]
 			1 -> 2 -> 3 -> 2 -> 3 ->..... 조건삭아 true 인 경우에만 
 				-> (4) 
 		
 		

 */
public class Test05 {
	
	public static void main(String[] args) {
		int dan = 2;
		
		while(dan < 9) {
			int gop = 1 ;
			System.out.println("-----------------------------");
			while(gop < 10) {
				System.out.println(dan + " x " + gop + " = " + (dan * gop));
				gop++;
			}			
			dan++;
		}
		System.out.println("-----------------------------");
		
	}
}
