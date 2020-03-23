package day10;

/*
 * 문제 2]
	10개의 과목의 점수를 입력할 배열을 만들고 (배열의 길이는 10으로 한다.)
	그 배열에 담긴 점수의
	총점, 평균을 구래서 출력해주는 프로그램을 작성
	단, 입력, 총점계산, 평균걔산, 출력은 함수를 제작하세요 
 */
public class Ex02_sub {
	int[] no1;
	int no2;
	double no3;
	
	public void scr(int[] num1) {
		no1 = num1; 
//		int sum = 0;
		for(int i=0; i<no1.length; i++) {
			no2 += no1[i];
		}
		
		no3 = no2/10.;
	}
	
	public void toPrint() {
		for(int i=0; i<no1.length; i++) {
			System.out.println("점수 " +i+"은 : " + no1[i]);
		}
		System.out.println("------------------------------");
		System.out.println("총점은 : " + no2);
		System.out.println("평균은 : " + no3);
	}
	
	
}
