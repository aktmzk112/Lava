package day04;
/*
 		do ~ while 명령
			: for와 while 명령은 선 조건처리명령이고 조건에 따라서 한번도 실행 안될수 있지만
				do ~ while 명령은 후조건 처리명령이고 
				조건에 관계없이 무조건 한번은 실행을 한다.!!
			
			형식]
				(1)
				do {
					(2)
				} while(조건식 - (3));
				
				-(4)
				
				순서 ]
					1 -> 2 -> 3(참)- >2 ->3(참) -> 2 -> 3 (거짓) -> 4
			
		
 				
 */
public class Test06 {

	public static void main(String[] args) {
		int no = 10;
		do {
			System.out.println("no : " + no);
		}while(no++ < 10);

	}

}
