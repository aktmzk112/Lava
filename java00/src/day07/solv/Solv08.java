package day07.solv;
/*
 * 문제 8]
	회원 이름, 전화번호, 이메일 저장할 배열을 만들고 
	데이터를 입력하면 
	
	회원의 이름을 입력하면 
	이름, 전화번호, 이메일을 출력해주는 프로그램을 작성하세요
 */

import java.awt.Label;

import javax.swing.*;

import javax.swing.JOptionPane;
public class Solv08 {
	public static void main(String[] args) {
		String[] name = {"김소영","최두용","정우승","유태희","김종형","임서진"};
		String[] tel = {"010-1111-1111","010-2222-2222","010-3333-3333","010-7777-7777","010-5555-5555","010-8888-8888"};
		String[] mail = new String[]{"@1","@2","@3","@4","@5","@6"};
		
		
		//만약 임서진 이라는 이름을 입력하면 
		//임서진이 가지는 인덱스를 알아내기 위해
		//name 배열의 각 방의 저당된 데이터를 모두 꺼내서
		//임서진 이라는 문자열과 비교하여
		//맞는경우 해당 인덱스를 기억시켜 놓으면 된다.
		//이때 인덱스 를 변수는 
		//반복문의 블록내부에 만들경우 블럭을 빠져나가게 되면
		//사용할수 없게 되므로 
		//따라서 인덱스를 기억할 변수는 반복문의 블럭 밖에다 만들어 둔다.
		
		
		//먼저 문자열 입력
		

 while (true) {
	 String code = JOptionPane.showInputDialog("번호를 입력하세요 \n 1. 이름으로 회원찾기 \n 2. 종료");
	 switch (code) {
	 	case "1":
			String str = JOptionPane.showInputDialog("이름을 입력하세요!");
			//인덱스 변수
			int idx = -1;
			
			for(int i = 0; i<name.length; i++) {
				// name 배열에서 str과 같은 문자열이 있는지 검사 
				// 주의사랑은 문자열의 데이터비교는 동등비교 연사자가 아닌
				// 반드시 문자열.equals(문자열2) 를 사용
				if(name[i].equals(str)) {
						idx =i;
						break; // 필요한 데이터를 찾았기 때문에 반복문은 종료한다.
				}
			}
			
			
			
			String msg = "없는   팀원입니다";
			//그런데 3팀이 아닌 광호씨 이름이 입력되는 경우 해당 인덱스를 찾지 못할 것 이므로 
			//이때 역시 모두 실행이 될것이다.
			//이경우는 idx 변수의 값이 교체가 되지 않고 -1로 유지 된다.
			// idx 값이 -1인 경우는 해당 사람을 찾지 못했다는 의미 가될 것이다 .
			if(idx != -1) {
				//이경우는 인덱스를 찾은 경우
				//이제 인덱스는 알아냈으니 해당인덱스 해당하는 정보를 출력해주자!
				msg = "name \t: " + name[idx] + "\ntel\t" + tel[idx] + "\nmail\t" + mail[idx];
				JOptionPane.showMessageDialog(null, msg);
			}else {
				//인덱스를 못찾은 경우
				//이경우는 msg에 초기값이 있기 떄문에 없어 도된다.
				JOptionPane.showMessageDialog(null, msg);
			}
			break;
	 	case "2":
	 		JOptionPane.showMessageDialog(null, "종료합니다");
	 		return;
		
		
	}
   }
		}
}
