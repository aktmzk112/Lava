package day04;

/*
 *  2~100 사이의 수중 소수만 출력해주는 프로그램을작성
 
 *	소수 1과 자기 자신으로만 나눌수 있는수 
 *
 *  comm ] 
 *  	위 문제의 결과로 찾아낸 소수위 갯수를 맨 마지막에 출력
 */
public class Hw03 {

	public static void main(String[] args) {
	int no=0;
		
	//2~100까지 수를 반복해서 소수 검사를 한다.
		loop:
	    for(int i = 2; i<=100; i++) {
			
			//나눌수 있는 수가 있는지 검사 
			for(int j = 2; j < i; j++) {
				
				if( i % j == 0) {
					continue loop;
				}
			}
			
			// 위의 반복문이 정장적으로 끝까지 반복처리가 됬다면 이 행을 실행할 것이고
			// 그 말은 나눌수 있는 수(j)가 없다는 말이므로 
			// 이수(i)는 소수일 것이다.
			
			//그러면 소수를 출력만 하면 될 것이다.
			String mk = ", ";
			
			if(i == 2) {
				mk = "";
			}
			
			System.out.print(mk +i);
			
			
			no++;
		}
		
			System.out.println("");
			System.out.print("나온 소수의 갯수는 총 " + no + "입니다. ");
	}	
}