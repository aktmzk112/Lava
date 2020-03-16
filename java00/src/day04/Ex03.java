package day04;
/*
 * 	문제 3]
 * 		2x + 4y = 10의 방정식의 결과를 출력
 * 		단! x, y 는 모두 0이상 10이하 사이의 수 
 */
public class Ex03 {
	
	public static void main(String[] args) {
		for(int x = 0; x < 11; x++) {
			for(int y=0; y<11; y++) {
				if(2*x + 4*y == 10) {
					System.out.println("x가 " + x +" 이고 y가" + y + " 일때 합은" + (2*x+4*y) + " 입니다.");
				}
			}
		}
		
	}
}
