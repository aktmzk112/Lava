package day03;

/*
 	���� 1] 
 		�Խ��ǿ� ���� ���������� 15�� ���� ǥ���Ҽ� �ִ�.
 		�Խù��� ������ �����ϰ� 0~100 �߻����� 
 		�ʿ��� ������ ���� ��� �Ͽ� ������ִ� ���α׷��� �ۼ�
 		��, �Խù� ���� 0�� ���� 1�������� �ʿ��Ѱ����� �Ѵ�.
 		
 */
public class Ex02 {

	public Ex02() {
		gesi();
		
	}
	
	public void gesi() {
			int num = (int)(Math.random() * (100-0+1)) + 0;
			System.out.println(num);
			num = (num-1)/15;
		
			if(num == 0 ) {
				System.out.println("1�������Դϴ�");
			}else if(num ==1) {
				System.out.println("2�������Դϴ�.");
			}else if(num ==2) {
				System.out.println("3�������Դϴ�");
			}else if(num ==3) {
				System.out.println("4�������Դϴ�.");
			}else if(num ==4) {
				System.out.println("5�������Դϴ�.");
			}else if(num ==5) {
				System.out.println("6�������Դϴ�");
			}else {
				System.out.println("������������!!!!");
			}
			
	}

	public static void main(String[] args) {
		new Ex02();

	}

}
