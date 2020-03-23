package day09;

/*
	comm 2]
	
	�ݾ��� �Է��ϸ�
	�ݾ׸�ŭ�� �ζǰ����� ������ִ� ���α׷��� �ۼ��ϼ���.
	�ζ� �Ѱ����� 1000���̰�, ���忡�� 5������ ����.
	�Է� �ݾ��� 1000�� ������ �ϱ�� �Ѵ�.
	��, �ζ� ��ȣ�� �������� �����ؼ� �����ϼ���.
	
 */

import javax.swing.*;
import java.text.*;
public class Comm2Solv {

	public static void main(String[] args) {
		// �ݾ����Է¹޴´�.
		String sMoney = "";
		int money = 0 ;
		
		while(true) {
			sMoney = JOptionPane.showInputDialog("�ݾ��� �Է��ϼ���!");
			money = Integer.parseInt(sMoney);
			if(money < 1000) {
				JOptionPane.showMessageDialog(null, "�ݾ��� ������� �ʽ��ϴ�.\n�ٽ� �Է��ϼ���!");
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
				// �ζǹ迭 ����
				loop:
				for(int j = 0 ; j < 6; j++ ) {
					int no = (int)(Math.random() * 45 + 1);
					// �ߺ�üũ
					for(int k = 0 ; k < j ; k++ ) {
						if(tmp[k] == no) {
							--j;
							continue loop;
						}
					}
					tmp[j] = no;
				}
				
				// �����ϱ�
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
		
		// ����ϱ�
		
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
			JOptionPane.showMessageDialog(null, buff.toString(), "### �ζ� " + (i + 1) + " ���� ###", JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
}
