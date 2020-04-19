package MyProj.controller;

import MyProj.DAO.*;
import MyProj.VO.*;
import java.util.*;
import javax.swing.*;


public class AddMember01 {

	public AddMember01() {
		//ȸ�� �Ѹ��� �߰��غ��� 
		//ȸ�� �����ʹ� VO�� ��Ƽ� �Ѱ��ֱ�� ��������Ƿ� VO�� �غ��Ѵ�.
		
		MemberVo mVO = new MemberVo();
		mVO.setName("������");
		mVO.setId("sdh");
		mVO.setPwd("12345");
		mVO.setMail("sdh@increpas.com");
		mVO.setGen("M");
		mVO.setTel("010-9823-5579");
		mVO.setAno(11);
		
		// �����ʹ� �غ� �Ǿ����� 
		// DB�� ó�� �Լ��� ȣ���Ѵ�.
		
		MemberDAO mDao = new MemberDAO();
		
		// DB ó���Լ��� ȣ�����ش�
		int cnt = mDao.addMember(mVO);
		
		if(cnt == 1) {
			JOptionPane.showMessageDialog(null, mVO.getName() +" ���� �����߽��ϴ�");
		}
		else {
			JOptionPane.showMessageDialog(null, "������ �����Ǿ����ϴ�");
			
		}
	}

	public static void main(String[] args) {
		new AddMember01();

	}

}
