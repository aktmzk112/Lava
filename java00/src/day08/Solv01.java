package day08;

import java.util.Arrays;

/*
 * ����1]
	�츮�� �л����� �������迭�� �����Ϸ��� �Ѵ�.
	�̸�, ��ȭ���� �̸��� �� �迭�� ���·� ����� �����ϰ�
	�ٽ� ������ �����͸� �����ؼ� �迭�� ����� ���

	3���� �迭 ���
 */
public class Solv01 {

	public static void main(String[] args) {
		
		
		
		String[][] team1 = new String[6][3]; //{�̸� / ��ȣ / ����} * 6
											//  name[0] tel[0] mail[0]
		String[] name = {"��ҿ�","�ֵο�","�����","������","������","�Ӽ���"};
		String[] tel = {"010-1111-1111","010-2222-2222","010-3333-3333","010-7777-7777","010-5555-5555","010-8888-8888"};
		String[] mail = new String[]{"@1","@2","@3","@4","@5","@6"};
		
		for(int i = 0; i<team1.length; i++) {
			int no=0;
			
				team1[i][no] = name[i]; 
				team1[i][++no] = tel[i]; 
				team1[i][++no] = mail[i]; 

		}
		
//		System.out.println(team1[1][0]);
	
		
		String[][] team2 = new String[5][3];
		
		String[] name2 = {"����1","����2","����3","����4","����5",};
		String[] tel2 = {"010-1111-1111","010-2222-2222","010-3333-3333","010-7777-7777","010-5555-5555"};
		String[] mail2 = new String[]{"@1","@2","@3","@4","@5"};
		
		for(int i = 0; i<team2.length; i++) {
			int no=0;
			
				team2[i][no] = name2[i]; 
				team2[i][++no] = tel2[i]; 
				team2[i][++no] = mail2[i]; 

		}
		
		String[][][] ban = new String[2][][];
		
		ban[0] =team1;
		ban[1] =team2;
		
		
		
		for(int i=0; i<ban.length; i++) {
			
			for(int j=0; j<ban[i].length; j++) {
				for(int k=0; k<ban[i][j].length; k++) {
					System.out.print(ban[i][j][k]);
					
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}

}
