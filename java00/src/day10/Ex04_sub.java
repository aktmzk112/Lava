package day10;
/*
 * 문제 4]
 	학생의 점수를 입력하면 총점을 계산해주는 프로그램을 작성
 	
 	심화 ] 
 		랜덤하게 인원수 만들고 
 		그 인원수 만큼 점수를 랜덤하게 만들어서
 		함수를 실행하게 하세요
 */
public class Ex04_sub {
		
	public int getSum(int...no) {
		int sum=0;
		for(int i=0; i<no.length; i++) {
			sum += no[i];
		}
		return sum;
	}
}
