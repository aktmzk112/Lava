package day20;

/*
 * 	ȸ����ȣ�� �Է��ϸ�
 * 	�����ͺ��̽��� ȸ�� ������ ��ȸ���ִ� ���α׷� �ۼ� �غ��� 
 * 
 */
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class Test02 {
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public Test02() {
		dbInit();

		// ȸ����ȣ�� �Է¹޴´�.
		int no = -1;
		while (true) {
			String sno = JOptionPane.showInputDialog("ȸ����ȣ �Է�");
			try {
				no = Integer.parseInt(sno);
				break;
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
			
		}
		//���Ǹ�� ����
		String sql = "SELECT * FROM member WHERE mno="+no;
		String psql = "SELECT * FROM member WHERE mno= ?";
		

		try {
			/*
			// Statement�� ������
			stmt = con.createStatement();
			//���Ǹ�� �Ǿ ������ 
			rs = stmt.executeQuery(sql);
			*/
			
			//? �� ä������ϴ� ���� ����� ����� �� ����ϴ� Statement �� PreparedStatement �̴� 
			pstmt = con.prepareStatement(psql);
			//prepareStatement �� ���Ǹ���� ������ ������ �ϰ� 
			//������� �Ŀ��� ���� ����� �ϼ��ؾ� ���������� �۵��Ѵ�.
			
			//���Ǹ���� �ϼ�����
			pstmt.setInt(1, no);
			
			//���� ��� ������ ��� �ް�
			rs = pstmt.executeQuery();
			//�۾��� ���� ������
			rs.next();
			
			//�ʿ��� ������ �̾ƿ��� 
			int mno = rs.getInt("mno");
			String name = rs.getString("name");
			String mid = rs.getString("id");
			String mpw = rs.getString("pw");
			String mail = rs.getString("mail");
			String gen = rs.getString("gen");
			String tel = rs.getString("tel");
			int ano = rs.getInt("ano");
			char issh =  rs.getString("isshow").charAt(0);
			
			//���
			JOptionPane.showMessageDialog(null, name + " ������ ����\nȸ����ȣ : "+mno+
						"\n���̵� : " +mid + "\n��й�ȣ : " +mpw + "\n�����ּ� : " + mail +"\n���� : " + gen + "\n�ƹ�Ÿ��ȣ : " +
						ano + "\nȰ������ : " + ((issh == 'Y') ? "Ȱ����" : "Ż��ȸ��")
					);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	// �����ͺ��̽� ����̹� �ε��ϰ� Ŀ�ؼ� ����ִ� �Լ�
	public void dbInit() {
		try {
			// ����̹� �ε��ϰ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Ŀ�ؼ� ���
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			con = DriverManager.getConnection(url, user, pw);
//			System.out.println("Ŀ�ؼ� ������ ����~~~");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				stmt.close();
				con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
