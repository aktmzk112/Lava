package day04;

/*
 * 윤년 평년 구하기
 */
import java.util.*;
public class Test01 {

	
	
	public static void main(String[] args) {
		//작업순서
		//0. 필요한 변수 선언
		Scanner sc;
		int year;
		String hae = "평년";
		//1 입력받을 준비
		sc =  new Scanner(System.in);
		//2. 메세지 출력
		System.out.print("### 몇년도 ??? : ");
		//3. 년도 꺼내서 변수에 담고
		year = sc.nextInt();
		
		//4. 조건 처리헤서 판다
		if(year % 400 ==0) {
			/*
			 *  400으로 나눠 떨어지는수가 실행되는 부붑ㄴ 
			 *  이경우는 이블럭을 실행시키고 
			 *  전체 조건문 자체를 실행이사다
			 */
				hae ="윤년";
		}else if(year % 100 == 0) {
			/*
			 *  이블럭을 실헹하는 경우는 400으로 나우어 떨어지지 않는 수중에 
			 *  100으로 나워서 떨어지는 수가 실행되는 부분
			 */
//				hae="평년";
			
		}else if(year % 4== 0) {
			 	hae="윤년";
				
		}
			
		//5. 출력
		System.out.println("입력한해 [ " + year + " ] 는 [ " + hae + " ] 입니다");

	}

}
