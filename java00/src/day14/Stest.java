package day14;

import javax.swing.*;
public class Stest {

	public Stest() {
		String sno = JOptionPane.showInputDialog("�غ�1�� �Է��ϼ���");
		String sno2 = JOptionPane.showInputDialog("����1�� �Է��ϼ���");
		String sno3 = JOptionPane.showInputDialog("�غ�2�� �Է��ϼ���");
		String sno4 = JOptionPane.showInputDialog("����2�� �Է��ϼ���");
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
			
			JOptionPane.showMessageDialog(null,"s1�� �غ��� : " + s1.getNo1() + "\ns2�� �غ��� : "+s2.getNo1() +"\n"+ ((s1.equals(s2))?("���� �ﰢ���Դϴ�"):("�ٸ� �ﰢ���Դϴ�")));
			
		}catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		
	}
	public static void main(String[] args) {
		new Stest();
	}

}
