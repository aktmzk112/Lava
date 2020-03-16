package day04;


import java.util.*;
/*
 	두수를 입력받은후  
 	두수의 최대공약수를 구해서 출력해주는 프로그램 작성
 	
 	최대공약수]
 		두수를 나눌 수 있는 최대 수..?
 */
public class Hw01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int no1 = sc.nextInt();
		System.out.print("정수2를 입력하세요 : ");
		int no2 = sc.nextInt();
		
		if(no2 > no1) {
			int tmp = no1;
				no1 = no2;
				no2 = tmp;
		}
		for(int i = no2; i>0; i--) {
			
			if(no1%i == 0 && no2%i ==0) {
				System.out.println(no1 + " 과 " +no2+" 의 최대 공약수는 " + i + " 입니다.");
				break;
			}

			

			}
		}
		
	}

