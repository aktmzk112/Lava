package test99;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
 /* �� â�� �������: JButton���� ���� �� â
  * 
  * ���� â�� ������ ��, �� â�� �ٸ� Ŭ������ ����� ��ư�� ������� ������ �� â�� �����մϴ�.
  */
 
public class MyTest01_sub1 extends JFrame {
	public MyTest01_sub1() {
		this("��������ʹ�");
	}
	
	public MyTest01_sub1(String title) {
		super(title);
		setSize(350,300);
		setVisible(true);
		
		JPanel jpn = new JPanel();
		JButton bt = new JButton("��ư1");
		JButton bt2= new JButton("��ư2");
		
		bt.setBounds(30, 170, 122, 30);
		bt2.setBounds(182, 170, 122, 30);
		
		add(bt);
		add(bt2);
		setLayout(new FlowLayout());
	}
}
