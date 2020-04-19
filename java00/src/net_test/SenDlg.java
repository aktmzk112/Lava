package net_test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import net_test.db.*;

public class SenDlg {
	Jjokji main;
	JTextField field;
	JTextArea area;
	JButton sendB, resetB, closeB;
	JFrame frame;
	public SenDlg() {}
	public SenDlg(Jjokji main) {
		this.main = main;
		frame = new JFrame("��������");
		field = new JTextField();
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		sendB = new JButton("SEND");
		resetB = new JButton("reset");
		closeB = new JButton("close");
		//��ư �̺�Ʈ �߰�
		ButtonEvent evt = new ButtonEvent();
		sendB.addActionListener(evt);
		resetB.addActionListener(evt);
		closeB.addActionListener(evt);
		
		JLabel label = new JLabel("�޴� ���");
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("West",label);
		p1.add("Center",field);
		
		JPanel p2 = new JPanel();
		p2.add(sendB);
		p2.add(resetB);
		p2.add(closeB);

		frame.add("North",p1);
		frame.add("Center", sp);
		frame.add("South", p2);
		frame.setSize(400,300);

	}
	
	
	
	//DB ���� �Լ� 
	public void dbsave() {
		String msg = area.getText();
		String name = field.getText();
		Dvo dvo = new Dvo();
		Ddao dao = new Ddao();
		
		dvo.setName(name);
		dvo.setArea(msg);
		dao.sSql(dvo);	
	}
	
	//���� ������ �Լ�
	public void sendProc() {
		//���� ������ �˾Ƴ���
		String msg = area.getText();
		String name = field.getText();
		byte[] buff = msg.getBytes();
		
		//���� �ּҸ� �˾Ƴ��� 
		// ==> �̸��� �˸� �ּҸ� ���� �� �ֵ��� Map�� �غ��� ���Ҵ�.
		String ip = (String) main.nameToIp.get(name);
		InetAddress inet = null;

		try {
			inet = InetAddress.getByName(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//�̰��� ��Ŷ���� ������ ��
		DatagramPacket pack = null;
		try {
			pack = new DatagramPacket(buff,buff.length, inet,9999);
			//��Ʈ��ũ�� ���������
			main.sSocket.send(pack);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//�����Ⱑ �Ϸ�Ǹ� ���� â�� �ݾ��ش�.
		frame.setVisible(false);
		frame.dispose();
	}
	
	
	class ButtonEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton target =(JButton) e.getSource();
			if(target == sendB) {
				dbsave();
				sendProc();
			}else if(target == resetB) {
				area.setText("");
			}else{
				frame.setVisible(false);
				frame.dispose();
				//�� �Լ��� �޸𸮿����� �����޶�� ���....
				//System.exit(0)�� �θ�â���� �ݾƹ�����
			}
		}
	}
	
	class BtnEvt implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String comm = e.getActionCommand();
			System.out.println(comm);
			
		}
		
	}

}
