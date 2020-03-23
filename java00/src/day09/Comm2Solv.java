package day09;

/*
	comm 2]
	
	금액을 입력하면
	금액만큼의 로또게임을 만들어주는 프로그램을 작성하세요.
	로또 한게임은 1000원이고, 한장에는 5게임이 들어간다.
	입력 금액은 1000원 단위로 하기로 한다.
	단, 로또 번호는 오름차순 정렬해서 저장하세요.
	
 */

import javax.swing.*;
import java.text.*;
public class Comm2Solv {

	public static void main(String[] args) {
		// 금액을입력받는다.
		String sMoney = "";
		int money = 0 ;
		
		while(true) {
			sMoney = JOptionPane.showInputDialog("금액을 입력하세요!");
			money = Integer.parseInt(sMoney);
			if(money < 1000) {
				JOptionPane.showMessageDialog(null, "금액이 충분하지 않습니다.\n다시 입력하세요!");
				continue;
			} else {
				break;
			}
		}
		
		int paper, game;
		game = money / 1000;
		if(game % 5 != 0) {
			paper = game / 5 + 1;
		} else {
			paper = game / 5;
		}
		
		int[][][] lotto = new int[paper][][];
		for(int i = 0 ; i < paper ; i++ ) {
			int cnt = 5;
			if( i == paper - 1 ) {
				if(game % 5 == 0) {
					cnt = 5;
				} else {
					cnt = game % 5;
				}
			}
			
			lotto[i] = new int[cnt][];
			for(int l = 0 ; l < cnt ; l++) {
				int[] tmp = new int[6];
				// 로또배열 한장
				loop:
				for(int j = 0 ; j < 6; j++ ) {
					int no = (int)(Math.random() * 45 + 1);
					// 중복체크
					for(int k = 0 ; k < j ; k++ ) {
						if(tmp[k] == no) {
							--j;
							continue loop;
						}
					}
					tmp[j] = no;
				}
				
				// 정렬하기
				for(int j = 0 ; j < tmp.length - 1 ; j++ ) {
					for(int k = j + 1 ; k < tmp.length; k++) {
						if(tmp[j] > tmp[k]) {
							int no = tmp[j];
							tmp[j] = tmp[k];
							tmp[k] = no;
						}
					}
				}
				lotto[i][l] = tmp;
			}
		}
		
		// 출력하기
		
		DecimalFormat form = new DecimalFormat("  ###  |");
		System.out.println("-------------------------------");
		for(int i = 0 ; i < paper ; i++ ) {
			StringBuffer buff = new StringBuffer();
			for(int j = 0 ; j < lotto[i].length ; j++ ) {
				buff.append("|");
				System.out.print("|");
				for(int k = 0 ; k < lotto[i][j].length ; k++ ) {
					buff.append(form.format(lotto[i][j][k]).toString());
					System.out.printf("%3d |", lotto[i][j][k]);
				}
				buff.append("\n");
				System.out.println();
			}
			JOptionPane.showMessageDialog(null, buff.toString(), "### 로또 " + (i + 1) + " 게임 ###", JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
}
