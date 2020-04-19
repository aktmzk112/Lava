package day20;

/*
 	�� Ŭ������ JDBC��  �׽�Ʈ �ϱ� ���� Ŭ���� 
 	
 	����Ŭ�� ����� ���� hello ������ �����ؼ� 
 	member ���̺� �����͸� ä������.
 	
 */
import java.sql.*;
import javax.swing.*;
import java.util.*;
public class Test01 {

	public Test01() {
		// ����
		/*
		 * 1.JDBC��� �ܺ� �����ͺ��̽��� ������ ����̹��� �̹� �߰��� �� ���Ҵ�. ���� �� ���α׷����� �� ����̹��� ������ �;� �Ѵ�. �ܺ�
		 * Ŭ������ �ε��ϴ� �Լ�
		 * 
		 * Class.forName(Ŭ�����̸�);
		 */

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 1. ���� ����̹� �ε��� ���� ���´�
			JOptionPane.showMessageDialog(null, "DB Driver Loading Complete!!!");
			
			// 2. ������ �õ��� ����
			/*
			 	������ �����ͺ��̽� ���� �����ϴ� ���(URL)�� �ణ�� �ٸ���.
			 	�� ��� ���� ���۽ſ� ������ û�ϼ��� 
			 	
			 	�����ϴ� ����� JDBC���� ����� �ϸ� �ȴ�.
			 	DriverManager.getConnection();
			 */
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			//�� rul�� db���� �ٸ���
			Connection con = DriverManager.getConnection(url,user,pw);
			/*
			 	��ó�� ������ �ϰ� �Ǹ� �����ڸ� �����ϴ� ������ ���� �ϴµ� 
			 	�� ������ �����ϴ� Ŭ������ �ٷ� Connection �̴�.
			 	
			 	��������� �����ͺ��̽��� ���� ���ݾ� ������ �޶����� �κ��̴�.
			 	
			 	���ĺ��ʹ� �׻� ������ ������� JDBC���� ����� ������ 
			 	JDBC�� �ش� DBMS���� ����� �����Ѵ�.
			 	
			 */
			JOptionPane.showMessageDialog(null, "Oracle Connect Complete!!!");
			
			//���� ����Ŭ�� ���ӵ� �Ǿ��� ���� ���� ����� ��������.
			//3. Statement �����.
			Statement stmt = con.createStatement();
			
			
			//4. ���� ����� ����� 
			ArrayList<String> avtList = new ArrayList<String>();
			avtList.add("INSERT INTO avatar VALUES(11, 'img_avatar1.png' ,'img_avatar1.png','M')");
			avtList.add("INSERT INTO avatar VALUES(12, 'img_avatar2.png' ,'img_avatar2.png','M')");
			avtList.add("INSERT INTO avatar VALUES(13, 'img_avatar3.png' ,'img_avatar3.png','M')");
			avtList.add("INSERT INTO avatar VALUES(14, 'img_avatar4.png' ,'img_avatar4.png','F')");
			avtList.add("INSERT INTO avatar VALUES(15, 'img_avatar5.png' ,'img_avatar5.png','F')");
			avtList.add("INSERT INTO avatar VALUES(16, 'img_avatar6.png' ,'img_avatar6.png','F')");
			
			
			String sql01 = "INSERT INTO member VALUES( 1000,'������','euns','12345','euns@increpas.com','M','010-3175-9042',11,'Y')";
			String sql02 = "INSERT INTO member VALUES( 1001,'�ֵο�','dDragon','12345','dDragon@increpas.com','M','010-1111-1111',11,'Y')";
			String sql03 = "INSERT INTO member VALUES( 9999,'�����','chairman','12345','chariman@increpas.com','F','010-9999-9999',15,'Y')";
			/*
			int cnt =0;
			//	���� Statement �� ���� ��ɿ� �Ǿ ������ �ȴ�

			for(int i=0; i<avtList.size(); i++) {
				cnt += stmt.executeUpdate(avtList.get(i));
				
			}

			JOptionPane.showMessageDialog(null, "�Էµ� ������ �� : " + cnt);
*/			
			
			/*
			// ȭ���� �߰��غ���
			if(stmt.execute(sql02)) {
				JOptionPane.showMessageDialog(null, "���Ǹ�� ���� ����");
			}else {
				JOptionPane.showMessageDialog(null, "���Ǹ�� ���� ����");
				
			}
			*/
			/*
			// ȭ���� �߰��غ���
			boolean bool = stmt.execute(sql04);
			if(bool) {
				JOptionPane.showMessageDialog(null, "���Ǹ�� ��� �߻�");
			}else {
				JOptionPane.showMessageDialog(null, "���Ǹ�� ��� ����");
			}
			*/
			/*
			String dsql = "TRUNCATE TABLE MEMBER";
				
			stmt.execute(dsql);
			*/
			/*
			//ȸ�� �߰�
			stmt.execute(sql01);
			stmt.execute(sql02);
			stmt.execute(sql03);
			*/
			
			String sql04 = "SELECT * FROM member WHERE mno=1000";
			ResultSet rs = stmt.executeQuery(sql04);
			//���� �۾����� BOF�̹Ƿ� ���������Ͱ� ����ִ� ������ ���� ������ �ȴ�
			rs.next();
		/*	
			int mno = rs.getInt(1);
			String name = rs.getString(2);
			String mid = rs.getString(3);
			String mpw = rs.getString(4);
			String mail = rs.getString(5);
			String gen = rs.getString(6);
			String tel = rs.getString(7);
			int ano = rs.getInt(8);
			char issh =  rs.getString(9).charAt(0);
		*/
			int mno = rs.getInt("mno");
			String name = rs.getString("name");
			String mid = rs.getString("id");
			String mpw = rs.getString("pw");
			String mail = rs.getString("mail");
			String gen = rs.getString("gen");
			String tel = rs.getString("tel");
			int ano = rs.getInt("ano");
			char issh =  rs.getString("isshow").charAt(0);
			
			JOptionPane.showMessageDialog(null, name + " ������ ����\nȸ����ȣ : "+mno+
						"\n���̵� : " +mid + "\n��й�ȣ : " +mpw + "\n�����ּ� : " + mail +"\n���� : " + gen + "\n�ƹ�Ÿ��ȣ : " +
						ano + "\nȰ������ : " + ((issh == 'Y') ? "Ȱ����" : "Ż��ȸ��")
					);
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
