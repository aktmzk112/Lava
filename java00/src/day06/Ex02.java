package day06;
/*
 * ���� 2] 
	'A' ~ 'J' ���ڸ� �����ϰ� 100�� �߻� ��Ų�� 
	�� ������ ī��Ʈ�� ���ؼ�(����) ����ϼ���.
	
	�߰��� ���ڸ�ŭ ��ǥ(*)�� �� ����ϼ��� 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		char[] ch2 = new char[]{'A','B','C','D','E','F','G','H','I','J'};
		char[] ch = new char[100];
		int[] count = new int[10];
		for(int i = 0; i<100; i++) {
				int no = (int) (Math.random() * (74 - 65 +1)) + 65;
				ch[i] = (char) no;
//				System.out.println(ch[i])
				
				
				if(ch[i] == 'A') {
					count[0]++;
				}else if(ch[i] == 'B') {
					count[1]++;
				}else if(ch[i] == 'C') {
					count[2]++;
				}else if(ch[i] == 'D') {
					count[3]++;
				}else if(ch[i] == 'E') {
					count[4]++;
				}else if(ch[i] == 'F') {
					count[5]++;
				}else if(ch[i] == 'G') {
					count[6]++;
				}else if(ch[i] == 'H') {
					count[7]++;
				}else if(ch[i] == 'I') {
					count[8]++;
				}else if(ch[i] == 'J') {
					count[9]++;
				}
				

				
			
		}
		
		for(int j=0; j < count.length; j++) {
			System.out.println(ch2[j] +"�� ���� : " + count[j]);
		}


	}

}
