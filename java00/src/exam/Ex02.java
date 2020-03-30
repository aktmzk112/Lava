package exam;

import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/*
���� 2 ]

link : https://www.nytimes.com/2020/03/29/world/coronavirus-live-news-updates.html?action=click&module=Spotlight&pgtype=Homepage

"President Trump said Sunday that the federal government��s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter.
He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion."

�ܾ������ ���ڿ��� �߶�
�ܾ���̰� ���� �� �ܾ��� ���ڼ��� �ܾ ����ϼ���.

��, ,�� . , - �׸��� ? �� �ܾ�� �����Ѵ�.

*/
import java.util.*;
public class Ex02 {

	public Ex02() {
		String str = "President Trump said Sunday that the federal government��s guidelines for social distancing would last until April 30, backing down from his previous comments that he hoped the country could go back to work by Easter."+
				"He had clashed with public health experts around the country when he suggested that the guidelines ? which urge people to stay at home and not to gather in groups of more than 10 - might be relaxed by April 12. His announcement on Sunday indicated that he had backed down from that suggestion.";
	
		/*
		 	���� ]
		 		
		 		���� ��κ��� ���� ���ڿ��� ��ü�� �����ϴ� ����� ����.
		 		�����ϴ� �۾��� �ϴ� �Լ����� ���� ����� ��ȯ�ϴ� ��ɸ� ������ �ִ�.
		 */
		
		String tmp = str.replaceAll(",", "");
		tmp = tmp.replaceAll("\\.", "");
		tmp = tmp.replaceAll("\\?", "").replaceAll("-", "");
		
		String tmp1 = str.replaceAll(",", "").replaceAll("\\.", "").replaceAll("\\?", "").replaceAll("-", "");

//		System.out.println(tmp1);
		
		// ���� �ܾ ������ �������� ArrayList�� ��´�
		// StringTolenizer�� �������
		StringTokenizer token = new StringTokenizer(tmp1);
		
		// ���� ������ �������� �߷��� ����� ���۸޸𸮿� ���� �Ǿ������Ƿ� �ϳ��� ������
		// ����� ArrayList�� ����� ���������� �ʾƵ� ����� �ִ�.
		
		// ArrayList ����
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		//token���� �ϳ��� ������ ä���� 
		while(token.hasMoreTokens()) { //���� ���۸޸𸮿� ���� �����Ͱ� �ִ��� �����
			list.add(token.nextToken());
		}
		
		//����غ��� 
		for(Object obj : list) {
			System.out.println((String) obj);
		}
		
		//���� ����Ʈ�� �ܾ���� ���̸� �̾Ƽ� 
		//���� �� �ܾ��� ���̿� �ܾ ����Ѵ�.
		
		//1. ���� �� �ܾ��� ���̿� �ܾ ������ ���� ���� 
		int len = 0;
		String word ="";
		for(int i=0; i< list.size(); i++) {
			String daneo = (String)list.get(i);
			int gilee = ((String)list.get(i)).length();
			if(len < gilee) {
				len = gilee;
				word = daneo;
			}
		}
		
		//���� ���� �� �ܾ��� ���̿� �ܾ ������ �Ǿ����� ���������.
		JOptionPane.showMessageDialog(null, "���� �� �ܾ��� ���� : " + len + "\n" + "���� �� �ܾ� : " + word);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
