package day00;

public class Test00 {

	public static void main(String[] args) {
//		-- 자바 보너스] 랜덤하게 4자리 숫자를 발생해서 그 숫자가 평년인지 윤년이지 확인
//		-- 윤년 : 4로 나눠 떨어지고 100나눠 떨어지지 않고 400으로 나누어 떨어지는 해 
//		-200 +200 까지 랜덤 숫자 
		
		
//		for(int i=0; i<=40; i++) {
//		int num =(int) (Math.random() * (9999 - 1000 +1) + 1000); //*(최대값 - 최소값 +1) + 최소값 = 최대값을 포함간 최대값과 최소값 사이의수
//		int num2 =(int) (Math.random() * (9999 - 1000 +1) + 1000);
//		int num3 =(int) (Math.random() * 10001);
//		System.out.println(num3);
//		
//		}
/*		for(int i=0; i<=100; i++) {
			
			
			if(num <= 999) {
				num += 4000;
			}
		
			if(num%4 == 0 && num%100 != 0 || num%400 ==0) {
				System.out.println(num + "년은 윤년");
			}
			else {
			System.out.println(num + "년은 평년");
			}
		}*/
		
		int a=1;
		int b=1;
		for(int i=0; i<9; i++) {
			
			System.out.println(a+"단");
			System.out.println("----------------------------------------");
			
			for(int j=0; j<9; j++) {
				
				System.out.println(a+"x"+b+"="+a*b);
				b+=1;
				
			}
			
			a+=1;
			b=1;
			System.out.println("");
		}
	}
}


