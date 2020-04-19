package day20;
/*
 *  ȸ������ 
 *  	�̸�, ���̵� , ���� , �ƹ�Ÿ��ȣ 
 *  �� ��ȸ�ϼ��� 
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
		//���� ��� �ۼ�
		String sql = "SELECT name ,id , gen ,ano FROM member WHERE isshow = 'Y'";
		
		//������Ʈ��Ʈ �������� 
		//���� ����� ������Ʈ��Ʈ�� �Ǿ ������ 
		StringBuffer buff = new StringBuffer();
		try {
			stmt  = con.createStatement();			
			rs = stmt.executeQuery(sql);
			//���� ����� ����� ���� ���� ���� �ݺ��ؼ� �۾��� ���� 
			while(rs.next()) {
				buff.append(rs.getString("name") + " | "); //�̸� �ٿ��ְ�
				buff.append(rs.getString("id") + " | ");
				buff.append(rs.getString("gen") + " | ");
				buff.append(rs.getInt("ano") + "\n");
			}
			
			//��� ����ϰ�
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
			//����̹� ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Ŀ�ؼ�
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
