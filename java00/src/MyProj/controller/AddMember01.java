package MyProj.controller;

import MyProj.DAO.*;
import MyProj.VO.*;
import java.util.*;
import javax.swing.*;


public class AddMember01 {

	public AddMember01() {
		//회원 한명을 추가해보자 
		//회원 데이터는 VO에 담아서 넘겨주기로 약속했으므로 VO를 준비한다.
		
		MemberVo mVO = new MemberVo();
		mVO.setName("서동혁");
		mVO.setId("sdh");
		mVO.setPwd("12345");
		mVO.setMail("sdh@increpas.com");
		mVO.setGen("M");
		mVO.setTel("010-9823-5579");
		mVO.setAno(11);
		
		// 데이터는 준비 되었으니 
		// DB에 처리 함수를 호출한다.
		
		MemberDAO mDao = new MemberDAO();
		
		// DB 처리함수를 호출해준다
		int cnt = mDao.addMember(mVO);
		
		if(cnt == 1) {
			JOptionPane.showMessageDialog(null, mVO.getName() +" 님이 가입했습니다");
		}
		else {
			JOptionPane.showMessageDialog(null, "가입이 거절되었습니다");
			
		}
	}

	public static void main(String[] args) {
		new AddMember01();

	}

}
