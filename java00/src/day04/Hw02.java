package day04;
import java.util.*;
/*
 	두수를 입력받은후
 	두수의 최소공배수를 출력
 	
 	최소공배수란 두 수로 나누어 떨어지는 가장 작은 수
 */
public class Hw02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력해라 : ");
		int no1 = sc.nextInt();
		System.out.print("정수2 입력해라 : ");
		int no2 = sc.nextInt();
		sc.close();
		
		if(no2 > no1) {
			int tmp = no1;
				no1 = no2;
				no2 = tmp;
		}
		 
		for(int i=no2; i<100; i++) {
			
			if(no1%i == 0 && no2%i == 0) {
				System.out.println(i);
				break;
			}
		}
		

	}

}
