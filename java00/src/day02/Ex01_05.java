package day02;

public class Ex01_05 {

	public Ex01_05() {
// 		랜덤한 숫자를 10~99 까지 만들고 
// 		그 숫자가 가까운 10의 배수의 차를 출려하는 프로그램 작성
// 		
// 		예] 
// 			45 는 50 과의 차가 5가 난다.
// 			53 는 50 과의 차가 3이 난다.
// 		
// 		힌트]
// 			15 => 15/10 * 10 
// 			23 => 23/10 = 2 * 10 =20 ... 
		int num  = (int) (Math.random() * (99-10+1))-10;
		int num2 = num / 10 * 10;
		System.out.println(num);
		System.out.println(num2);
	
 			
	}
	
	public void ex05_sub(int no1, int no2) {
		int mai = no1 - no2;
		int win = no2+10;
		int il = no1 % 10;
		
		
		
	}

	public static void main(String[] args) {
		new Ex01_05();

	}

}
