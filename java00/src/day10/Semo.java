package day10;
/*
 * 문제1]
	
	원의 반지름, 둘레, 넒이를 저장할 클래스를 만들고 
	그 클래스 객체 10개를 배열로 관리할 배열을 만들어서
	각 맴버를 초기화 하고 
	출력 하세요 
 */
public class Semo {
	int ban;
	double no1;
	double no2;
	
	public void setSemo(int semo) {
			ban = semo;
			
			no1= ban*2*3.14;
			no2= ban*ban*3.14;
			
	}
	
	public void semoPrint() {
		System.out.println("원의 반지름은 : " + ban);
		System.out.println("원의 둘레 : " +  no1);
		System.out.println("원의 넓이 : " + no2);
		System.out.println();
	}
}
