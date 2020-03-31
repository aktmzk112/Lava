package day17;

import java.util.*;
import javax.swing.*;

public class Ex01 {

	public Ex01() {
		ArrayList<Stud> list = new ArrayList<Stud>();

		while (true) {
			String name = JOptionPane.showInputDialog("이름을 입력하세요\n종료는 q를 입력하세요");
			if (name.equals("q")) break;
			String sban = JOptionPane.showInputDialog("반을 입력하세요");
			int ban = Integer.parseInt(sban);
			String sno = JOptionPane.showInputDialog("학생번호를 입력하세요");
			int no = Integer.parseInt(sno);
			
			int kor = (int) (Math.random() * 91 + 10);
			int eng = (int) (Math.random() * 91 + 10);
			int math = (int) (Math.random() * 91 + 10);
			int phy = (int) (Math.random() * 91 + 10);
			int cod = (int) (Math.random() * 91 + 10);

			list.add(new Stud());

			for (int i = 0; i < list.size(); i++) {
				list.get(i).setName(name);
				list.get(i).setBan(ban);
				list.get(i).setNo(no);
				list.get(i).setKor(kor);
				list.get(i).setEng(eng);
				list.get(i).setMath(math);
				list.get(i).setPhysics(phy);
				list.get(i).setCod(cod);
				list.get(i).setTotal();

				System.out.println("이름 : " + list.get(i).getName());
				System.out.println("반 : " + list.get(i).getBan());
				System.out.println("학생번호 : " + list.get(i).getNo());
				System.out.println("국어 점수 : " + list.get(i).getKor());
				System.out.println("영어 점수 : " + list.get(i).getEng());
				System.out.println("수학 점수 : " + list.get(i).getMath());
				System.out.println("과학 점수 : " + list.get(i).getPhysics());
				System.out.println("코드 점수 : " + list.get(i).getCod());
				System.out.println("총점: " + list.get(i).getTotal());
			}
			


		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
