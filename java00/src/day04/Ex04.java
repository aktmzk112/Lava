package day04;

import java.util.*;
/*
 * 	5자리 정수를 입력받아서 
 *  그 숫자가 회문수 인지 아닌지 판별 
 *  해문수란?
 *  	앞에서 읽으나 뒤에서 읽으나 똑같은수.
 *  	예 12321 - 회문수
 *  
 *  	   12312 - 	회문수 x
 */
public class Ex04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 5자리 입력 : ");
		  int number = sc.nextInt();
		  int tmp = number;
		  int num = 0;
		 
		  for(int i=0; i<5; i++) {
		   
			  num = num*10 + tmp%10; 
		   System.out.println(num);
		   tmp=tmp/10; 
		   


		  }
		  
		  if (number == num) {
		   System.out.println(number + "는 회문수.");
		  }else {
		   System.out.println(number + "는 회문수가 아님.");
		  }
		  }
		
	}

		
	
