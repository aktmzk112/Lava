package day06;
/*
 * 	int[] coin = {10000,5000,1000,500,100,50,10,1};
	�̶�� �迭�� �غ��ϰ� 
	79456���� �غ�� ȭ������� ����Ҷ� ���� ȭ������� ��� �ʿ����� 
	������ ������ �迭�� ����� 
	����ϴ� ���α׷� �ۼ�
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] coin = {10000,5000,1000,500,100,50,10,1};
		int[] cnt = new int[8];
		int no = 79456;
		
		for(int i =0; i<coin.length; i++) {
			cnt[i] = no/coin[i];
			no %= coin[i];
		}
		
		for(int i=0; i<coin.length; i++) {
			System.out.println(coin[i] + "�� : " + cnt[i]);
		}
		
		
	
	}

}
