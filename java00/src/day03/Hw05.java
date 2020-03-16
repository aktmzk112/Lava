package day03;

public class Hw05 {
	
/*
 	
 */
/*
 	 		랜덤한 숫자를 10~99 까지 만들고 
	 		그 숫자가 가까운 10의 배수의 차를 출려하는 프로그램 작성
	 		
	 		예] 
	 			45 는 50 과의 차가 5가 난다.
	 			53 는 50 과의 차가 3이 난다.
	 		
	 		힌트]
	 			15 => 15/10 * 10 
	 			23 => 23/10 = 2 * 10 =20 ... 
	 				
 */
	public Hw05() {
		solv();
	}
	
	public void solv() {
		int no = (int) (Math.random() * (99-10+1))+10; //10~99까지 랜덤 숫자 생성
		
		//가까운 10의 배수 만들기 
		//먼저 10으로 나눈 나머지 구하기
		int nmj = no % 10;
		
		//나머지가 5보다 크거나 같으면 십의단위를 10을올려주고, 작으면 10의 단위로 그냥쓴다.
		int sip = (nmj >= 5) ? (no/10 * 10 + 10) : (no / 10 * 10);
		
		//차를 구한다, 그런데 나머지가 5보다 크거나 같은 경우는 sip에서 숫자를 뺴줘야 되고 
		//5보다 작으면 no에서 sip을 빼주면 된다.
		int cha = (nmj >= 5) ? (sip - no) : (no - sip);
		
		//출력
		System.out.println("랜덤하게 발생한 숫자 : " + no + "\n가까운 십의배수 : "+sip+
							"\n가까운 십의배수와의 차 : " + cha);
		
		
	}	

	public static void main(String[] args) {
		new Hw05();

	}
	


}
