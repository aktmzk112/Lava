package day00;

public class Test00 {

	public static void main(String[] args) {
//		-- �ڹ� ���ʽ�] �����ϰ� 4�ڸ� ���ڸ� �߻��ؼ� �� ���ڰ� ������� �������� Ȯ��
//		-- ���� : 4�� ���� �������� 100���� �������� �ʰ� 400���� ������ �������� �� 
//		-200 +200 ���� ���� ���� 
		
		
//		for(int i=0; i<=40; i++) {
//		int num =(int) (Math.random() * (9999 - 1000 +1) + 1000); //*(�ִ밪 - �ּҰ� +1) + �ּҰ� = �ִ밪�� ���԰� �ִ밪�� �ּҰ� �����Ǽ�
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
				System.out.println(num + "���� ����");
			}
			else {
			System.out.println(num + "���� ���");
			}
		}*/
		
		int a=1;
		int b=1;
		for(int i=0; i<9; i++) {
			
			System.out.println(a+"��");
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


