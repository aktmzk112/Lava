package day02;

public class Ex01_05 {

	public Ex01_05() {
// 		������ ���ڸ� 10~99 ���� ����� 
// 		�� ���ڰ� ����� 10�� ����� ���� ����ϴ� ���α׷� �ۼ�
// 		
// 		��] 
// 			45 �� 50 ���� ���� 5�� ����.
// 			53 �� 50 ���� ���� 3�� ����.
// 		
// 		��Ʈ]
// 			15 => 15/10 * 10 
// 			23 => 23/10 = 2 * 10 =20 ... 
		int num  = (int) (Math.random() * (99-10+1))-10;
		int num2 = num / 10 * 10;
		System.out.println(num);
		System.out.println(num2);
	
 			
	}
	
	public void ex05_sub(int no1, int no2) {
		int mai = no1 - no2;
		int win = no2+10;
		int il = no1 % 10;
		
		
		
	}

	public static void main(String[] args) {
		new Ex01_05();

	}

}
