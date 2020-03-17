package day06;

public class Ex02_pro {
	/*
	 * 문제 2] 
		'A' ~ 'J' 문자를 랜덤하게 100개 발생 시킨후 
		각 문자의 카운트를 구해서(숫자) 출력하세요.
		
		추가로 숫자만큼 별표(*)를 찍어서 출력하세요 
	 * 
	 */
	public static void main(String[] args) {
		// 문자배열
		 char ch[] = new char[100];
		 char ch2[] = new char[10];
		 
		 //카운트 수를 저장할 정수 배열
		 int[] count = new int[10];
		 
		 
		 for(int i=0; i<10; i++) {
			 ch2[i] = (char)('A' + i);
		 }
		 
		 for(int i=0; i<100; i++) {
			 // 'A' ~ 'J' 까지 문자 100개를 랜덤하게 만들고 
			 char tmp = (char) (Math.random() * ('J'-'A' +1)+'A');
			 
			 // ch배열에 차곡차곡 넣는다.
			 ch[i] = tmp;
			 
			 if(ch[i]=='B') {
			 System.out.print(ch[i]);
			 }
		 }
		  System.out.println();
		 	// 만들어진 문자배열에서 각 문자가 저장된 카운트를 올려준다.
		 	for(int i = 0; i < 100; i++) {
		 		int idx = ch[i] - 'A';
		 		
		 		count[idx] +=1; 
		 	}
		 	
		 	int tmp = 0;
		 	char tmp2 = '0';
		 	
		 	for(int i=0; i<count.length; i++) {
		 		
		 		for(int j=i; j<count.length; j++) {
		 			if(count[i] < count[j]) {
		 				
		 				//숫자 정렬
		 				tmp = count[i];
		 				count[i] = count[j];
		 				count[j] = tmp;
		 				
		 				//문자 정렬
		 				tmp2 = ch2[i];
		 				ch2[i] = ch2[j];
		 				ch2[j] = tmp2;
		 			}
		 				 		 		 			
		 		}
		 	}
		 
		 	for(int i =0; i< 10; i++) {
		 		System.out.printf("%3s : ", ch2[i]);
		 		
		 		System.out.print(count[i] + " ===> ");
		 		for(int j=0; j<count[i]; j++) {
		 			System.out.print("*");
		 		}
		 		System.out.println();
		 	}
		
		

	}

}
