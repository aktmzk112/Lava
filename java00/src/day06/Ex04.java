package day06;
/*
 * ���� 4]
	
	������ 5���� ����� �迭�� ����� 
	������ �������� ���� ���� ���̸� ����ؼ� ������ �迭�� ����� 
	������ �ѷ��� ����ؼ� ������ �迭�� ���� 
	����� �ⷰ�ϴ� �����ϼ��� 
	
	�� ������´� 
	
		��] 
			������ : 10 , ���� �ѷ� 62.8, ���� ���� : 314	
	
	�� ���·� ��µǰ� �ϼ���...
 */
public class Ex04 {

	public static void main(String[] args) {
		int[] ban = new int[5];
		float[] res1 = new float[5];
		float[] res2 = new float[5];
		
		for(int i=0; i<5; i++) {
			ban[i] = (int) (Math.random() * (30-2+1)+2); 
			res2[i] = (float) (ban[i] * ban[i] * 3.14);
			res1[i] = (float) (2*ban[i]*3.14);
			System.out.println("�������� : " + ban[i] + " ���̴� : " + res2[i] + " �ѷ��� : "  + res1[i]);
		}
		

	}

}
