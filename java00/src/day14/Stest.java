package day14;

import javax.swing.*;
public class Stest {

	public Stest() {
		String sno = JOptionPane.showInputDialog("밑변1을 입력하세요");
		String sno2 = JOptionPane.showInputDialog("높이1을 입력하세요");
		String sno3 = JOptionPane.showInputDialog("밑변2을 입력하세요");
		String sno4 = JOptionPane.showInputDialog("높이2을 입력하세요");
		int no1 =0;
		int no2 =0;
		int no3 =0;
		int no4 =0;
		
		try {
			
			no1 = Integer.parseInt(sno);
			no2 = Integer.parseInt(sno2);
			no3 = Integer.parseInt(sno3);
			no4 = Integer.parseInt(sno4);
			Samgak s1 = new Samgak(no1,no2);
			Samgak s2 = new Samgak(no3,no4);
			JOptionPane.showMessageDialog(null,s1.toString());
			JOptionPane.showMessageDialog(null,s2.toString());
			
			JOptionPane.showMessageDialog(null,"s1의 밑변은 : " + s1.getNo1() + "\ns2의 밑변은 : "+s2.getNo1() +"\n"+ ((s1.equals(s2))?("같은 삼각형입니다"):("다른 삼각형입니다")));
			
		}catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		
	}
	public static void main(String[] args) {
		new Stest();
	}

}
