package day20;
/*
 *  회원들의 
 *  	이름, 아이디 , 성별 , 아바타번호 
 *  를 조회하세요 
 */
import java.sql.*;
import javax.swing.*;
import java.util.*;
public class Test03 {
	
	Connection con =null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public Test03() {
		dbInit();
		//질의 명령 작성
		String sql = "SELECT name ,id , gen ,ano FROM member WHERE isshow = 'Y'";
		
		//스테이트먼트 가져오고 
		//질의 명령을 스테이트먼트에 실어서 보내자 
		StringBuffer buff = new StringBuffer();
		try {
			stmt  = con.createStatement();			
			rs = stmt.executeQuery(sql);
			//질의 명령의 결과가 여러 행인 경우는 반복해서 작업을 하자 
			while(rs.next()) {
				buff.append(rs.getString("name") + " | "); //이름 붙여주고
				buff.append(rs.getString("id") + " | ");
				buff.append(rs.getString("gen") + " | ");
				buff.append(rs.getInt("ano") + "\n");
			}
			
			//결과 출력하고
			JOptionPane.showMessageDialog(null, buff.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void dbInit() {
		try {
			//드라이버 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			con = DriverManager.getConnection(url,user,pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
