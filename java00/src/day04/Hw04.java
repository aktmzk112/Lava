package day04;

/*
 * 	�� ����� ����� �ϴµ� 
 *  �� ����� ���� ����� �����ϰ� 
 *  �� ����� ���󿡼� �������� �����ߴ�.
 *  
 *  ���� ���̰� 7564m �� �����ϰ� 
 *  �λ���� ������ �ð��� ��� ���� �������� ���̸� ������ִ� ���α׷� �ۼ�
 */
public class Hw04 {

	
		public static void main(String[] args) {
			
			int tHeight = 7564; 
			
			for(int i = 0; ; i++) {
				//�� �ʴ� �ö󰡴� ����� ����
				double h1 = 0.54*i;
				
				// �������� ����� ����
				double h2 =  tHeight - 1.07 * i;
				
				if(h1 > h2) {
					System.out.println("�ö󰡴� ����� ���� : " + h1);
					System.out.println("�������� ����� ���� : " + h2);
					System.out.println("�������� �ð� : " + (i/60) +" ��, "+(i%60)+ " ��");
					break;
				}
			}
			
		}
}