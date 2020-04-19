package net_test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class ReceiveDlg {
	Jjokji main;
	JTextField field;
	JTextArea area;
	JButton reB, closeB;
	JFrame frame;

	public ReceiveDlg() {
	}

	public ReceiveDlg(Jjokji main) {
		this.main = main;
		frame = new JFrame("���� ����");
		field = new JTextField();
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		reB = new JButton("����");
		closeB = new JButton("�ݱ�");
		// �̺�Ʈ �߰�
		BtnEvt evt = new BtnEvt();
		reB.addActionListener(evt);
		closeB.addActionListener(evt);
		// ���̾ƿ� �ۼ�
		JLabel label = new JLabel("�������");
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("West", label);
		p1.add("Center", field);

		JPanel p2 = new JPanel();
		p2.add(reB);
		p2.add(closeB);

		frame.add("North", p1);
		frame.add("Center", sp);
		frame.add("South", p2);

		frame.setSize(400, 300);

	}

	class BtnEvt implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();
			if(str.equals("����")) {
				String name = field.getText();
				SenDlg dlg = new SenDlg(main);
				dlg.field.setText(name);
				dlg.frame.setVisible(true);
			}
			frame.setVisible(false);
			frame.dispose();
		}

	}

}
