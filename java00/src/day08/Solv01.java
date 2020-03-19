package day08;

import java.util.Arrays;

/*
 * 문제1]
	우리반 학생들의 정보를배열로 관리하려고 한다.
	이름, 전화번로 이메일 을 배열의 형태로 만들어 관리하고
	다시 팀별로 데이터를 정리해서 배열을 만들고 출력

	3차원 배열 사용
 */
public class Solv01 {

	public static void main(String[] args) {
		
		
		
		String[][] team1 = new String[6][3]; //{이름 / 번호 / 메일} * 6
											//  name[0] tel[0] mail[0]
		String[] name = {"김소영","최두용","정우승","유태희","김종형","임서진"};
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
		
		String[] name2 = {"팀원1","팀원2","팀원3","팀원4","팀원5",};
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
