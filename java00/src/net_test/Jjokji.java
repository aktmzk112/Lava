-package net_test;

import javax.swing.*;

import org.omg.CORBA.FREE_MEM;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;

public class Jjokji {

	// �̸��� �˷��ָ� �ּҸ� ã�Ƴ��� ��
	// �ּҸ� �˷��ָ� �̸��� ã�Ƴ��� �� �� ����
	Properties nameToIp, ipToName;
	JList list;
	JButton sendB;
	JFrame frame;
	
	DatagramSocket sSocket, rSocket;
	/*
	 	������ �ϳ��� �������� ������� �ޱ⸦ �� �� �ִ�.
	 	�׷��� ������ ������ ��쿡�� ������ ���߿� �ޱ�� ���Ѵ�. 
	 	���� ������ ����� ���ؼ� ������ ���ϰ� �޴� ������ �����ؼ�
	 	ó���ϴ� ���� ����.
	 */
	
	public Jjokji() {
		setMap();
		//â���� ����� 
		frame = new JFrame("���� ���α׷�");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				close();
			}
		});
		
		Set tmp = nameToIp.keySet();
		Vector v = new Vector(tmp);
		list = new JList(v);
		JScrollPane sp = new JScrollPane(list);
		sendB = new JButton("�����");
		//�̺�Ʈ �߰��ϰ� 
		sendB.addActionListener(new ButtonEvent());
		
		frame.add("Center",sp);
		frame.add("South", sendB);
		
		
		frame.setSize(200,300);
		frame.setVisible(true);
		
		/*--------------------- �� ����� �ڵ� ----------------------*/
		/*--------------------- ��Ʈ��ũ ���� ���� ------------------*/
		//UDP ��� �̹Ƿ� DataframSocket �� �̿��Ѵ�
		
		try {
			sSocket = new DatagramSocket();
			rSocket = new DatagramSocket(9999);
			// ��Ʈ��ũ ȸ������ ������ �� ���°� �ȴ�.
			// ��, ��ũ��ũ�� �����ϵ��ϸ� ���� �����̴�.
			
			// ���� ��Ʈ��ũ ������ �Ϸ�Ǿ����Ƿ� 
			// ������ ������ ���� �� �ִ�.
			// ������ ���°��� �������� �𸣹Ƿ� �޴� ���α׷��� �������ش�.
			ReceiveThread t = new ReceiveThread(this);
			t.start();
		} catch (Exception e) {
			// �� ���α׷��� ����� �Ϸ��� �ݵ�� ��Ĺ�� �ʿ��ϰ� 
			// ��Ĺ�� ����� �������� ������ �����ϸ� ���̻� �� ���α׷��� 
			// ���� ��Ű�� �ǹ̰� ��������.
			// ���� ���α׷��� ���� ������.
			close();
		}
		
	}
	
	//���� Ŭ���� ����
	class ButtonEvent implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String name = (String)list.getSelectedValue();
			if(name == null || name.length() == 0) {
				return;
			}
			// ������ ���� ��ȭ���ڸ� new ��Ų��. 
			SenDlg dlg = new SenDlg(Jjokji.this);
			
			//�ؽ�Ʈ �ʵ忡 �޴� ����� �̸��� ���ְ� 
			dlg.field.setText(name);
			//ȭ�鿡 ���̰� �ϰ� 
			dlg.frame.setVisible(true);
			
		}
		
	}
	//���� �ݾ��ִ� �Լ�
	public void close() {
		try {
			sSocket.close();
			rSocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
	public void toTest() {
		System.out.println("�ڱ������� IP : " + nameToIp.get("�ڱ���"));
		
	}
	public void setMap() {
		nameToIp = new Properties();
		ipToName = new Properties();
		//�츮�� �����͸� ���Ͽ� ������ �߰� 
		//������ �ܺ� ��ġ�̴� ����Ʈ���� �ʿ��ϴ�
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		try {
			fin1 = new FileInputStream("src/net_test/ip_ko.properties");
			fin2 = new FileInputStream("src/net_test/name_ko.properties");
			
			nameToIp.load(fin1);
			ipToName.load(fin2);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin1.close();
				fin2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new Jjokji();
	}

}