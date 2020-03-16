package day03;

import java.util.*;
public class Hw04 {
	/*
	 * 	 		소숫점이 있는 숫자를 입력한수 
 		소수점 이하 세째자리에서 반올림 결과 출력 
 		
 		원리]
 			+0.005 을 하면 세째자리 반올림 되고
 			여기에 x100 해주면 두째자리까지 정수부에 들어갈거고 
 			이것을 정수로 바꾸면 원숫자의 세째자리 이하는 버릴것이고 
 			다시 /100 으로 해주면 
 			다시 소수점 형태로 변환 될것이다.
	 */
	public Hw04() {
		//소수 입력받을 준비
		Scanner sc = new Scanner(System.in);
		//메세지 출력
		System.out.print("실수만 입력해라 :");
		//입력받아 변수에 담고
		double num = sc.nextDouble();
		//함수 변수 데이터 넘겨주면서 실행하고 데이터 받고 
		double result = banolim(num);
		// 데이터 출력
		System.out.println("입력받은 실수 : "+num+ "\n반올림한 실수 : "+result);
	}
	
	// 실수를 소수두쨰자리에서 반올힘해주는 함수
	public double banolim(double no1) {
		
		//반환값을 담을 변수 생성
		double result = 0.;
		
		// 입력받은 데이터 반올림(소수세째자리에서...)
		/*
		 *  double no = 123.4567 
		 *  int no1 = int (no * 1000); =>123456
		 *  no1 = no1+5;			=> 123461
		 *  no1 = (no1 / 10) / 100.;		=> 123.46
		 */
		int no2 = (int) (no1*1000);
		no2 +=5;
		result = (no2/10) /100.;
		
		//데이터 반환
		return result;
	}

	public static void main(String[] args) {
		new Hw04();
		
	}

}
