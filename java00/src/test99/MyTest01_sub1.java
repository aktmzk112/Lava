package test99;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
 /* 새 창을 띄워보자: JButton으로 띄우는 새 창
  * 
  * 메인 창을 구현한 후, 새 창을 다른 클래스로 만들어 버튼이 만들어질 때마다 새 창을 생성합니다.
  */
 
public class MyTest01_sub1 extends JFrame {
	public MyTest01_sub1() {
		this("집에가고싶다");
	}
	
	public MyTest01_sub1(String title) {
		super(title);
		setSize(350,300);
		setVisible(true);
		
		JPanel jpn = new JPanel();
		JButton bt = new JButton("버튼1");
		JButton bt2= new JButton("버튼2");
		
		bt.setBounds(30, 170, 122, 30);
		bt2.setBounds(182, 170, 122, 30);
		
		add(bt);
		add(bt2);
		setLayout(new FlowLayout());
	}
}
